package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        while(true){
            print("printing...");
        }
    }

    private final String getMessage() {
        return message;
    }
    for(;;)
       System.out.println("Hello");


}
