public class MovieT {
    public static void main(String[] args) {
//        Movie m = new Movie();
//
//        m.title = "버즈오브프레이";
//        m.actor = "할리퀸";
//
//        System.out.println(m.title +"\t"+ m.actor);


        Movie[] mv = new Movie[2];

        mv[0] = new Movie();
        mv[0].title = "범죄도시1";
        mv[0].actor = "장첸";

        mv[1] = new Movie();
        mv[1].title = "진짜 귀찮다";
        mv[1].actor = "강해상";

        for (int i = 0; i< mv.length; i++){
            System.out.println(mv[i].title+"\t"+mv[i].actor);
        }


    }
}
