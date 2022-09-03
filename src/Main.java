import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = a / 6;

        int c = b;
        int d = a - (c + c);
        int e = b;

        System.out.println(c + " " + d + " " + e + " ");

    }
}