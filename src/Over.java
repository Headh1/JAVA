public class Over {

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        float c = 2.5f;
        float d = 3.4f;

        int re1 = add(a,b);
        float re2 = add(c,d);

        System.out.println(re1);
        System.out.println(re2);
    }

    public static int add(int a , int b) {
        int sum =a +b;

        return sum;
    }

    public static float add(float a , float b) {
        float sum = a+b;

        return sum;
    }
}
