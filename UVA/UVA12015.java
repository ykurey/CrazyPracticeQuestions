package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
*
* Find the maximum
*
* */

public class UVA12015 {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        int i;
        int j;

        for ( i = 1; i <= n; i++){
            String[] s1 = new String[10];
            int[] a1 = new int[10];

            int max = Integer.MIN_VALUE;
            for ( j = 0; j < 10; j++){
                StringTokenizer sin = new StringTokenizer(in.readLine());//(xxx, ",") ,為自訂，預設空白
                s1[j] = sin.nextToken();
                a1[j] = Integer.parseInt(sin.nextToken());

                max = Math.max(max, a1[j]);
            }

            StringBuilder sbin = new StringBuilder();
            sbin.append("Case #");
            sbin.append(i);
            sbin.append(":\n");
            int k;
            for ( k = 0; k < 10; k++){
                if(max == a1[k]){
                    sbin.append(s1[k]);
                    sbin.append("\n");
                }
            }
            System.out.print(sbin.toString());
        }
    }
}
