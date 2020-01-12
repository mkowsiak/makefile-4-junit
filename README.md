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
