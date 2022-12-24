#include <iostream>
#include "HelloWorld.hpp"

int main() {
    HelloWorld hello;
    std::cout << hello.returnsOnlyFive() << std::endl;
    return 0;
}