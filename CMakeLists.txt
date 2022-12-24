cmake_minimum_required(VERSION 3.16.3)
project(InterviewBlank)

find_package(PkgConfig REQUIRED)
find_package(Boost REQUIRED COMPONENTS program_options filesystem)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_FLAGS_DEBUG "-g")
set(CMAKE_CXX_FLAGS_RELEASE "-O3")

include_directories(${Boost_INCLUDE_DIRS} src/main/cpp)

include(FetchContent)
FetchContent_Declare(
  googletest
  URL https://github.com/google/googletest/archive/03597a01ee50ed33e9dfd640b249b4be3799d395.zip
)
# For Windows: Prevent overriding the parent project's compiler/linker settings
set(gtest_force_shared_crt ON CACHE BOOL "" FORCE)
FetchContent_MakeAvailable(googletest)

add_executable(HelloWorld src/main/cpp/HelloWorld.cpp)
target_link_libraries(HelloWorld ${Boost_LIBRARIES})

add_executable(HelloWorldTest src/test/cpp/HelloWorldTest.cpp)
target_link_libraries(
  HelloWorldTest
  GTest::gtest_main
)

include(GoogleTest)
gtest_discover_tests(HelloWorldTest)