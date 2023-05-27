package com.rpam.rd.autotasks;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchEmAll {

    // You may set another exception in this field;
    static Exception exception = new FileNotFoundException();

    public static void riskyMethod() throws Exception {
        try {
            throw exception;
        } catch (IOException e) {
            if (e instanceof FileNotFoundException) {
                throw new IllegalArgumentException("Resource is missing", e);
            } else {
                throw new IllegalArgumentException("Resource error", e);
            }
        } catch (ArithmeticException | NumberFormatException e) {
            System.err.println("Exception occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
            riskyMethod();
    }
}
