project(cxx_lib)
cmake_minimum_required(VERSION 3.11)

# set std standard to c++20 and C17
set(CMAKE_CXX_STANDARD 20)
set(CMAKE_C_STANDARD 17)
add_library(cxx_lib SHARED c_lib.cpp)

target_include_directories(cxx_lib PRIVATE

    # change the following line to meet your JDK version and location,
    # mainly the path before `include` and `include/linux`
    /usr/lib/jvm/java-20-openjdk-amd64/include
    /usr/lib/jvm/java-20-openjdk-amd64/include/linux)