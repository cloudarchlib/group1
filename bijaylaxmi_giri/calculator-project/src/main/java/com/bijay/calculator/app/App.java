package com.bijay.calculator.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator=new Calculator();
        int sum=calculator.sum(59,6);
        System.out.println( sum );
        int sub1=calculator.sub(90,6);
        System.out.println( sub1 );
        int mul1=calculator.multiply(50,6);
        System.out.println( mul1 );
        int div=calculator.division(300,6);
        System.out.println( div );

    }
}
