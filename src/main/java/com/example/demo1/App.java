package com.example.demo1;

/**
 * Hello world!
 */
public class App 
{

    public App() 
    {

    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */

    public static void main(String[] args) 
    {
        System.out.println("Hello World!");
        System.out.println("Hi, I made some changes ..!");
    }

    public int factorial(int num)
    {
        int factorial = 1;

        for (int i = 1;i <= num;i++)
        {
            factorial *= i;
        }

        return factorial; 
    }

}
