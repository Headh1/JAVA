public class Ref {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};

        int re = addA(a);

        System.out.println(re);

    }

    public static int addA(int[] a){
        int sum =0;

        for (int i =0; i<a.length; i++) {
            sum = sum+a[i];
        }

        return sum;
    }
}
