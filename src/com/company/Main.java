package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(drawTriangle("*", 10));

    }// main

    // Assume equilateral triangle
    public static String drawTriangle(String symbol, int side) {
        StringBuilder sb = new StringBuilder();

        int i = 0;

        //Top line
        for(i = 1; i < side; i++){sb.append(" ");}
        sb.append(symbol);
        sb.append("\n");

        for(i = 1; i < side-1; i++){
            for(int j = 1; j < side-i; j++){sb.append(" ");}
            sb.append(symbol);

            for(int k = 1; k <= (i * 2)- 1 ; k++){sb.append(" ");}
            sb.append(symbol);
            sb.append("\n");

        }

        //Bottom line
        for(i = 0; i < side; i++){sb.append(symbol + " ");}

        return sb.toString();

    }

}




