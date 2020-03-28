package com.company;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
*
* ignore '|' and ','
* 'o' = 1 and ' ' = 0
* string of the form "o o oo" represent the binary form of ASCII codes
* simple convert the strings to ASCII codes and output corresponding characters
*
* */

public class UVA10878 {
    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        DataOutputStream out = new DataOutputStream(System.out);

        String line;
        int i;
        byte value,b;
        while ((line = in.readLine()) != null){

            if (line.indexOf("_") >= 0 ){
                continue;
            }

            line = line.replace("|","");
            line = line.replace(".","");

            value = 0;
            b = 1;

            for ( i = 7; i > 0; i--){

                if ( line.charAt(i) == 'o'){

                    value += b;

                }

                b *= 2;

            }

            out.writeByte(value);

        }

    }
}


