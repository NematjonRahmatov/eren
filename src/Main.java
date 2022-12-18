import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Abdu<Integer, Void> xx = ll -> null;
        Abdu<Integer, Integer> l = x -> x * x;
        Abdu<Integer, Integer> pr = Math::abs;
        System.out.println(l.apply(5));
        System.out.println(xx.apply(5));
        System.out.println(pr.apply(-51));

        Classes cl = new Classes();
        Classes1 cl1 = new Classes1();
        Classes2 cl2 = new Classes2();
        Classes3 cl3 = new Classes3();
        Classes4 cl4 = new Classes4();

        /*cl = cl1;
        cl = cl4;
        cl1 = cl2;
        cl1 = cl4;
        cl2 = cl3;
        cl2 = cl4;
        cl3 = cl4;
        cl4 = cl4;*/

        ArrayList<Classes> lcl = new ArrayList<>();
        ArrayList<Classes1> lcl1 = new ArrayList<>();
        ArrayList<Classes2> lcl2 = new ArrayList<>();
        ArrayList<Classes3> lcl3 = new ArrayList<>();
        ArrayList<Classes4> lcl4 = new ArrayList<>();
        /* lcl1 = lcl2;   -invariation */
        lcl.add(cl4);
        lcl.add(cl1);
        lcl.add(cl2);
        lcl.add(cl3);
        Abdu<ArrayList<Classes>, Integer> kn = (Main::KolN);
        System.out.println(kn.apply(lcl));
        AddN(lcl2);
        System.out.println(lcl2.size());

        lcl.forEach(System.out::println);
    }

    public static int KolN(ArrayList<? extends Classes> ar){        /*Co-variation*/
        int n = 0;
        for (int i = 0; i < ar.size(); i++){
            n = n + ar.get(i).n;
        }
        return n;
    }

    public static void AddN(ArrayList<? super Classes4> ar){        /*Cont-variation*/
        for (int i = 0; i < 10; i++){
            ar.add(new Classes4());
        }
    }

    public Ans testm(int x){
        Ans s = new Ans();
        s.n = 1;
        s.b = true;
        return s;
    }

    public List<Integer> testmm(int x){
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        return l;
    }

}
interface Abdu<T, R> {
    R apply(T t);  /* R apply   */
}

class Ans{
    int n;
    boolean b;

}