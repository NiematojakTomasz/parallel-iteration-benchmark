import java.io.IOException;
import java.util.Iterator;

public class Test1 {
	public static final int SIZE = 1000000;

	private static long benchmarkAsum = 0;
	private static long benchmarkBsum = 0;

	static class Pair {
		Integer a;
		Integer b;

		public Pair(Integer a, Integer b) {
			this.a = a;
			this.b = b;
		}
	}

	static class PairsCollection {
		Pair[] abs;

		public PairsCollection(Pair[] abs) {
			this.abs = abs;
		}

		Iterable<Integer> as() {
			return new Iterable<Integer>() {
				@Override
				public Iterator<Integer> iterator() {
					return new Iterator<Integer>() {
						int i = 0;

						@Override
						public boolean hasNext() {
							return i < SIZE;
						}

						@Override
						public Integer next() {
							return abs[i++].a;
						}
					};
				}
			};
		}

		Iterable<Integer> bs() {
			return new Iterable<Integer>() {
				@Override
				public Iterator<Integer> iterator() {
					return new Iterator<Integer>() {
						int i = 0;

						@Override
						public boolean hasNext() {
							return i < SIZE;
						}

						@Override
						public Integer next() {
							return abs[i++].b;
						}
					};
				}
			};
		}

		Iterable<Pair> abs() {
			return new Iterable<Pair>() {
				@Override
				public Iterator<Pair> iterator() {
					return new Iterator<Pair>() {
						int i = 0;

						@Override
						public boolean hasNext() {
							return i < SIZE;
						}

						@Override
						public Pair next() {
							return abs[i++];
						}
					};
				}
			};
		}
	}

	public static void main(String... args) throws IOException {
		Pair[] abs = new Pair[SIZE];
		for (int i = 0; i < SIZE; i++) {
			abs[i] = new Pair(i, -i);
		}

		PairsCollection collection = new PairsCollection(abs);

		benchmarkA(collection);
		benchmarkA(collection);
		benchmarkB(collection);
		benchmarkB(collection);
		benchmarkA(collection);
		benchmarkA(collection);
		benchmarkB(collection);
		benchmarkB(collection);
		benchmarkA(collection);
		benchmarkA(collection);
		benchmarkB(collection);
		benchmarkB(collection);
		benchmarkA(collection);
		benchmarkA(collection);
		benchmarkB(collection);
		benchmarkB(collection);

		System.out.println("benchmarkAsum: " + benchmarkAsum);
		System.out.println("benchmarkBsum: " + benchmarkBsum);

	}

	public static void dummy(int c) {
		if (c != 0) {
			System.out.println("This is not happening.");
		}
	}

	public static void benchmarkA(PairsCollection collection) {
		long start = System.currentTimeMillis();
		Iterator<Integer> ai = collection.as().iterator();
		Iterator<Integer> bi = collection.bs().iterator();
		while (ai.hasNext() && bi.hasNext()) {
			Integer a = ai.next();
			Integer b = bi.next();
			dummy(a + b);
		}
		long stop = System.currentTimeMillis();
		long time = stop - start;
		benchmarkAsum += time;
		System.out.println("benchmarkA: " + time);
	}

	public static void benchmarkB(PairsCollection collection) {
		long start = System.currentTimeMillis();
		Iterator<Pair> abi = collection.abs().iterator();
		while (abi.hasNext()) {
			Pair ab = abi.next();
			Integer a = ab.a;
			Integer b = ab.b;
			dummy(a + b);
		}
		long stop = System.currentTimeMillis();
		long time = stop - start;
		benchmarkBsum += time;
		System.out.println("benchmarkB: " + time);
	}
}
