import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

interface fil{
    String[] filt(String[] s);
}
class t{
    public static void main(String[] args) {
        fil f = s -> Arrays.stream(s).filter((p) -> p.length() > 3).toArray(String[]::new);
        String[] ans;
        List<String> a = new ArrayList<String>();
        a.add("dfsdf");
        a.add("dsfsdfsd");
        ans = f.filt(a.toArray(String[]::new));
        for(String x: ans){
            System.out.println(x);
        }
    }
}