# 一个测试Java JNI的玩具项目

- 使用Rust编写了一个blake3哈希函数，**对一个Java字符串作哈希，并返回用base64编码的哈希结果**。
- 使用C++**将一个Java字符串反转**。

## 如何运行

```bash
# 首先根据JDK版本和位置更改cxx-lib中的CMakelists.txt文件，
# 需要更改的位置已经在该文件中说明。
make run
```

## 代码主要使用的第三方库

- [Rust FFI crate](https://crates.io/crates/jni)
- [blake3哈希函数crate](https://crates.io/crates/blake3)
- [base64 crate](https://crates.io/crates/base64)
