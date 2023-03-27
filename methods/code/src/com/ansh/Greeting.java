package com.ansh;

public class Greeting {
    public static void main(String[] args) {
//        String msg=greet();
//        System.out.println(msg);
        String msg = myGreet("Ansh Raiyani");
        System.out.println(msg);
    }

    static String myGreet(String name) {
        return "hello, " + name;
    }

    static String greet()
    {
        return "Hi, How are you?";
    }
}
