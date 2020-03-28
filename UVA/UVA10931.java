package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
*
* Parity
* Convert to binary
* How many 1s were found?
*
* */

public class UVA10931 {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String line;
        int i;
        while ( !(line = in.readLine()).equals("0") ){
            int sum = 0;
            int linea = Integer.parseInt(line);

            line = Integer.toBinaryString(linea);
            for ( i = 0; i < line.length(); i++ ){
                if (line.charAt(i) == '1'){
                    sum++;
                }
            }
            System.out.println("The parity of " + line + " is " + sum + " (mod 2)." + " " + method2(linea) );
        }
    }

    private static int method2(int linea){
        int sum = 0;
        String s1 = "";
        while ( linea != 0){

            if (linea % 2 == 1){
                sum++;
            }
            s1 += linea % 2;
            System.out.println(linea % 2);
            linea /= 2;

        }
//        int i;
        int j;
        StringBuilder sbin = new StringBuilder();
//        for ( i = s1.length() -1; i >= 0 ;i--){
//            sbin.append(s1.charAt(i));
//        }
        j = s1.length() -1;
        while (j >= 0){
            sbin.append(s1.charAt(j));
            j--;
        }
        System.out.println(s1);
        System.out.println(sbin.toString());
        return sum;
    }
}
