package com.company;
import java.util.Scanner;

/*
*
* Calculate several words
*
* Convert all to uppercase
* Use symbol judgment, not blank
* At last,Suppose there is no symbol to add one
*
* */

public class UVA00494 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()) {
            String line = in.nextLine();
            line = line.toUpperCase();
            int i;
            int count = 0;
            int sum = 0;
            for ( i = 0; i < line.length(); i++){
                if(line.charAt(i) >= 'A' && line.charAt(i) <= 'Z'){
                    count++;
                }else if(line.charAt(i) >= 'Z' || line.charAt(i) <= 'A' && count != 0){
                    count = 0;
                    sum++;
                }
            }

            if(line.charAt(line.length()-1) >= 'A' && line.charAt(line.length()-1) <= 'Z'){
                System.out.println(++sum);
            }else{
                System.out.println(sum);
            }
        }
    }
}
