import javax.xml.transform.sax.SAXSource;
import java.util.*;

class Mymapp{
    public static void main(String[] args) {
        MymappP<String, Integer> s = new MymappP<String, Integer>();
        s.insert("11", 1);
        s.insert("33", 3);
        System.out.println(s.len());
        s.printMKey();
        s.printMVal();
        s.printM();
    }
}
class MymappP<K, V>{
    List<K> key = new ArrayList<>();
    List<V> args = new ArrayList<>();

    private int s = 0;

    public void insert(K key, V val){
        this.key.add(key);
        this.args.add(val);
        s = s + 1;
    }

    public int len(){
        return this.s;
    }

    public void printMKey(){
        for(K kk: this.key){
            System.out.println(kk);
        }
    }
    public void printMVal()
    {
        for(V vv: this.args){
            System.out.println(vv);
        }
    }

    public void printM(){
        for(int i = 0; i < this.s; i++){
            System.out.println("Key: " + this.key.get(i) + " Values: " + this.args.get(i));
        }
    }
}