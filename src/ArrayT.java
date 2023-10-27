public class ArrayT {
    public static void main(String[] args) {
        int[] a = new int[3];

        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        for (int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }

        int[] b = {1,2,3,4,5,6};
        int sum = b[0]+b[3];

        System.out.println(sum);

        char[] c = new char[]{'a','p','p','l','e'};

        for(int i =0; i<c.length; i++){
//            c[i]=(char)(c[i]-32);

            System.out.println((char)(c[i]-32));
        }


    }
}
