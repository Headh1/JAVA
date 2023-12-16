import java.util.Scanner;

public class Che {
    static int a, b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 수를 입력하세요.");
        a = sc.nextInt();
        b = sc.nextInt();
        int min = (a < b) ? a : b;
        int max = 0;

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0)
                max = i;
        }

        System.out.println("최대공약수 : " + max);

    }
}
