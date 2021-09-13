/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joseph Schander
 */
package org.example;


import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {
        Scanner uInput = new Scanner(System.in);
        System.out.println( "What is the first number?" );
        int Num1 = uInput.nextInt();
        System.out.println( "What is the second number?" );
        int Num2 = uInput.nextInt();
        System.out.println(Num1+"+"+ Num2+"="+(Num1+Num2)+"\n"+Num1+"-"+Num2+"="+(Num1-Num2)+"\n"+Num1+"*"+Num2+"="+(Num1*Num2)+"\n"+Num1+"/"+Num2+"="+(Num1/Num2));
    }
}
