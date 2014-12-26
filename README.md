parallel-iteration-benchmark
============================
This is not a professional benchmark. 
Coded to quickly check if https://github.com/ceylon/ceylon-spec/issues/1174 would optimize performance in some cases on jvm.

#### My results
##### Environment
```
java version "1.8.0"
Java(TM) SE Runtime Environment (build 1.8.0-b132)
Java HotSpot(TM) 64-Bit Server VM (build 25.0-b70, mixed mode)
```
Benchmarks were executed from IntelliJ IDEA due to laziness.
##### Test1
###### Run 1

```
benchmarkA: 49
benchmarkA: 33
benchmarkB: 29
benchmarkB: 10
benchmarkA: 7
benchmarkA: 12
benchmarkB: 7
benchmarkB: 8
benchmarkA: 12
benchmarkA: 9
benchmarkB: 10
benchmarkB: 9
benchmarkA: 14
benchmarkA: 13
benchmarkB: 9
benchmarkB: 10
benchmarkAsum: 149
benchmarkBsum: 92
```
###### Run 2
```
benchmarkA: 44
benchmarkA: 34
benchmarkB: 28
benchmarkB: 7
benchmarkA: 6
benchmarkA: 10
benchmarkB: 8
benchmarkB: 8
benchmarkA: 9
benchmarkA: 8
benchmarkB: 6
benchmarkB: 7
benchmarkA: 10
benchmarkA: 9
benchmarkB: 6
benchmarkB: 6
benchmarkAsum: 130
benchmarkBsum: 76
```

##### Test2
###### Run 1
```
benchmarkA: 54
benchmarkA: 32
benchmarkB: 118
benchmarkB: 7
benchmarkA: 5
benchmarkA: 9
benchmarkB: 10
benchmarkB: 8
benchmarkA: 9
benchmarkA: 13
benchmarkB: 9
benchmarkB: 5
benchmarkA: 15
benchmarkA: 21
benchmarkB: 10
benchmarkB: 9
benchmarkAsum: 158
benchmarkBsum: 176
```
###### Run 2
```
benchmarkA: 58
benchmarkA: 37
benchmarkB: 39
benchmarkB: 5
benchmarkA: 6
benchmarkA: 13
benchmarkB: 7
benchmarkB: 10
benchmarkA: 8
benchmarkA: 9
benchmarkB: 7
benchmarkB: 6
benchmarkA: 11
benchmarkA: 10
benchmarkB: 5
benchmarkB: 7
benchmarkAsum: 152
benchmarkBsum: 86
```

##### Test3
###### Run 1
```
benchmarkA: 148
benchmarkA: 29
benchmarkB: 45
benchmarkB: 11
benchmarkA: 40
benchmarkA: 19
benchmarkB: 9
benchmarkB: 23
benchmarkA: 14
benchmarkA: 10
benchmarkB: 18
benchmarkB: 9
benchmarkA: 16
benchmarkA: 21
benchmarkB: 11
benchmarkB: 8
benchmarkAsum: 297
benchmarkBsum: 134
```
###### Run 2
```
benchmarkA: 162
benchmarkA: 33
benchmarkB: 49
benchmarkB: 11
benchmarkA: 37
benchmarkA: 15
benchmarkB: 10
benchmarkB: 19
benchmarkA: 14
benchmarkA: 10
benchmarkB: 12
benchmarkB: 9
benchmarkA: 17
benchmarkA: 25
benchmarkB: 9
benchmarkB: 13
benchmarkAsum: 313
benchmarkBsum: 132
```

##### Test4
###### Run 1
```
benchmarkA: 61
benchmarkA: 25
benchmarkB: 46
benchmarkB: 26
benchmarkA: 20
benchmarkA: 18
benchmarkB: 21
benchmarkB: 10
benchmarkA: 11
benchmarkA: 10
benchmarkB: 19
benchmarkB: 21
benchmarkA: 9
benchmarkA: 14
benchmarkB: 11
benchmarkB: 8
benchmarkAsum: 168
benchmarkBsum: 162
```
###### Run 2
```
benchmarkA: 59
benchmarkA: 24
benchmarkB: 44
benchmarkB: 17
benchmarkA: 11
benchmarkA: 9
benchmarkB: 30
benchmarkB: 13
benchmarkA: 11
benchmarkA: 10
benchmarkB: 20
benchmarkB: 15
benchmarkA: 12
benchmarkA: 12
benchmarkB: 10
benchmarkB: 14
benchmarkAsum: 148
benchmarkBsum: 163
```
