//https://basecamp.eolymp.com/ru/problems/2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number==0)
        {
            System.out.print(1);
        }
        else
        {
            int cnt=0;
            while (number>0)
            {
                cnt=cnt+1;
                number=number/10;
            }
            System.out.print(cnt);
        }
    }
}
