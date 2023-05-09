#include "Main.h"
#include <algorithm>
#include <iostream>
#include <string>
using namespace std;
JNIEXPORT jstring JNICALL Java_Main_test_1c_1function(JNIEnv* env, jclass java_class, jstring java_string)
{

    // get input parameter from JVM
    const char* nativeString = env->GetStringUTFChars(java_string, 0);
    string java_string_cxx(nativeString);
    // inverse the string
    std::reverse(java_string_cxx.begin(), java_string_cxx.end());
    // return the result
    return env->NewStringUTF(java_string_cxx.c_str());
}
