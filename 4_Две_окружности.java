//https://basecamp.eolymp.com/ru/problems/4
import java.util.Scanner;  // Import the Scanner class

import static java.lang.Math.sqrt;

public class Main
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);  
        float x1 = myObj.nextFloat();
        float y1 = myObj.nextFloat();
        float r1 = myObj.nextFloat();
        float x2 = myObj.nextFloat();
        float y2 = myObj.nextFloat();
        float r2 = myObj.nextFloat();
        float d=(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
        if (x1==x2 && y1==y2 && r1==r2)
            System.out.println(-1);
        else if ((d>(r1+r2)*(r1+r2)) || (d==0) || (d<(r1-r2)*(r1-r2)))
            System.out.println(0);
        else if (d==(r1+r2)*(r1+r2) || d==(r1-r2)*(r1-r2))
            System.out.println(1);
        else if ((d>(r1-r2)*(r1-r2)) && (d<(r1+r2)*(r1+r2)))
            System.out.println(2);
    }
}
