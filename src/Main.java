// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    /**
     * This is a `blake3` hash function implemented in Rust.
     * @param input the string to be hashed
     * @return hash result,in string format
     */
    private static native String blake3(String input);

    /**
     * This is a `test_c_function` function implemented in C++.
     * It only transfers the string to C++ and returns the result back.
     * @param input the string to be processed
     * @return the result of the string processed by C++
     */
    private static native String test_c_function(String input);
    static {
        // loads rust and c++ dynamic libraries
        System.loadLibrary("rust_lib");
        System.loadLibrary("c_lib");
    }

    public static void main(String[] args) {

        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome to foreign language FFI world!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        // get a random string
        String input = "++++++++Hello, Rust!++++++++++";
        System.out.println("Input: " + input);

        // call the native method
        String output = blake3(input);
        System.out.println("Back to Java code again！");
        System.out.println("Output: " + output);

        System.out.println("---------next we will go to C++ world----------");
        // give a random string,and call the c++ function,and return the result
        // another random string

        String input2 = "hello C++!";
        System.out.println("Input: " + input2);
        String output2 = test_c_function(input2);
        System.out.println("Back to Java code again！");
        System.out.println("Output: " + output2);
    }
}
