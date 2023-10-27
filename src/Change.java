public class Change {
    public static void main(String[] args) {
        int a =10;

        int b= 5;
        System.out.println(a);
        System.out.println(b);

        int c =0;

        c = b;
        b=a;
        a = c;

        System.out.println(a);
        System.out.println(b);
    }
}
