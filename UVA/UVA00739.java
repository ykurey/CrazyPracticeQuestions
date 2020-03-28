package com.company;

/*
*
*
*
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UVA00739 {

    private static int[] charcodes = { 0, 1, 2, 3, 0, 1, 2, 0, 0, 2, 2, 4, 5, 5, 0, 1, 2, 6, 2, 3, 0, 1, 0, 2, 0, 2 };

    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String line;

        while ( (line = in.readLine().trim()) != null){
            String an = Sound(line);
            System.out.println( line + " " + an);
        }
    }

    private static String Sound(String word){
        StringBuilder sbin = new StringBuilder();

        int i = 1;

        sbin.append(word.charAt(0));
        char[] wordchar = word.toCharArray();
        int codea = charcodes[wordchar[0] - 'A'];
        while ( sbin.length() < 4 && i < word.length()){
            int codeb = charcodes[word.charAt(i++) - 'A'];
            if ( codeb != 0 && codea != codeb){
                sbin.append(codeb);
            }
            codea = codeb;
        }
        while ( sbin.length() < 4){
            sbin.append(0);
        }
        return sbin.toString() ;
    }

}
