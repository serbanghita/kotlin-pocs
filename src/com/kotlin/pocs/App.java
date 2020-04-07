package com.kotlin.pocs;

public class App {
    public static void main(String[] args) {
        Integer result = AppUtilsKt.compareNumbers(101, 91);
        AppUtilsKt.log(result.toString());
    }
}
