import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.printf("자연수를 입력하시오 : ");
        int n= Integer.parseInt(sc.nextLine());

        for(int i=1;i<=n;i++) { //지정한 숫자까지 모든 숫자를 반복 검사
            int sum=0;
            for(int j=1;j<i;j++) {
                if(i%j==0) { // 약수를 필터링하는 과정
                    sum+=j; // 약수들을 더하는 과정
                }
            }
            if(i==sum) { // 반복한 숫자 중 약수들만 출력
                System.out.println(i);
            }
        }
    }
}
