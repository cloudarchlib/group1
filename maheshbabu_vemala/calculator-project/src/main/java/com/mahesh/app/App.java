package com.mahesh.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!!!" );
        Calculator calculator = new Calculator();
        int sum = calculator.sum(6,5);
        System.out.println( "sum is " +sum );
        int sub = calculator.sub(6,5);
        System.out.println( "sub is " +sub );
        int mul = calculator.mul(6,5);
        System.out.println( "mul is " +mul );
        int div = calculator.div(5,5);
        System.out.println( "div is " +div );
    }
}
