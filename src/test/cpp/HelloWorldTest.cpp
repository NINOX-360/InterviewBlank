#include <gtest/gtest.h>
#include "HelloWorld.hpp"

TEST(HelloWorldTest, returnsOnlyFive) {
  HelloWorld hello;
  EXPECT_EQ(5, hello.returnsOnlyFive());
}