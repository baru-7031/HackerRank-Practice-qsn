import java.util.Scanner;

public class hackerRank1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n%2!=0)
            System.out.println(n + " is odd, print weird");
        else
        {
            if (n>=2 && n<=5)
                System.out.println(n + " is even and not weird");
            else if (n>=6 && n<=20)
                System.out.println(n + " is even and weird");
            else if (n>20)
                System.out.println(n + " is even and not weird");        }
    }
}
