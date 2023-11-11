/*Input Format

There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.

Constraints

Output Format

If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticInitializer {
    public static int B;
    public static int H;
    public static boolean flag;
    static{
        Scanner sc = new Scanner(System.in);
        B=sc.nextInt();
        H=sc.nextInt();
        if (B>=1 && H>=1) {
            flag = true;
        }
        else{

            System.out.println("java.lang.Exception: Breadth and height must be positive");
            System.exit(0);
        }
        sc.close();
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class