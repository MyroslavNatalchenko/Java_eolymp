//https://basecamp.eolymp.com/ru/problems/1

import java.util.Scanner;  // Import the Scanner class
public class main
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        int N = myObj.nextInt();  // Read user input
        System.out.print(N/10 + " " + N%10);
    }
}
