# makefile-4-junit

Very simple project illustrating how to use `JUnit 5` inside `make` based project. In this project I use `make` as a build tool.

The code, that is being tested, is really simple

```
package sample;

public class Main {
  public int add(int a, int b) {
    return a + b;
  }
}
```
# Structure of the project

There are just three files (apart from `README.md` and `LICENSE`).

```
.
|-- LICENSE                     - license file
|-- Makefile                    - all the build steps
|-- README.md                   - this file
`-- src
    |-- main
    |   `-- sample
    |       `-- Main.java       - class that is supposed to be tested
    `-- test
        `-- sample
            `-- MainTest.java   - class that contains test
```

# Running the code

Just type

```
make
```

and that's it.

# Benchmark

## Test

```
> time make
...
...

real	0m2.780s
user	0m4.941s
sys	0m0.306s

> time mvn test
...
...

real	0m5.359s
user	0m9.764s
sys	0m0.533s
```

## Clean and test

```
# Clean, compile and test
> time (make clean; make test)
...
...

real	0m4.497s
user	0m4.798s
sys	0m0.373s

# Clean, compile and test
> time (mvn clean; mvn test)
...
...

real	0m9.310s
user	0m17.741s
sys	0m0.843s

# Firs execution ever
> time mvn test
...
...

real	0m43.291s
user	0m20.329s
sys	0m2.567s
```
