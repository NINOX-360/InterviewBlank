# Java

Quick start instructions below. Please verify this runs without any errors before the interview.
```bash
./gradlew RunHelloWorld
```
The build script will automatically download all the required dependencies and JDK for you.

* Gradle using a Kotlin DSL is the build system
* Unit testing is done using JUnit
* Build using Java 17
* HelloWorld.java is in src/main/java/HelloWord.java
* HelloWorldTest.java is in src/main/java/HelloWorldTest.java
* Included libraries:
  * Commons IO, Guava, Commons-Land, Args4J, JUnit

# C++

Quick start instructions below. Please verify this runs without any errors before the interview.

```bash
mkdir cmake_build;cd cmake_build;cmake ..
make
./HelloWorld
./HelloWorldTest
```
Only tested on Ubuntu 20. If you don't use Linux, please let us know in advance at help us make sure this works in advance!

* CMake is the build system
* GoogleTest is the test framework
* Compiled using C++17
* HelloWorld.cpp is in src/main/cpp/HelloWord.cpp
* HelloWorldTest.cpp is in src/main/cpp/HelloWorldTest.cpp
* Included Libraries:
  * Boost filesystem
