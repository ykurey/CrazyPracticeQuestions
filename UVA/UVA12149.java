package com.company;

import java.util.Scanner;

/*
 *
 * Calculate the side length as n * n
 * There are several squares inside.
 * n = 1 => 1
 * n = 2 => 5
 * n = 3 => 14
 * law
 * 1^2 + 2^2 + 3^2 + ... + n^2
 *
 * */
public class UVA12149 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n;
        int sum;
        int i;

        while ( (n = in.nextInt()) != 0){
            sum = 0;
            for ( i = 1; i <= n; i++){
                sum += Math.pow(i,2);
            }
            System.out.println(sum);
        }
    }
}