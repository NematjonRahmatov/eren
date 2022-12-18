public class LSP {
    public static void main(String[] args) {
        Rec rec = new Rec();
        Sq sq = new Sq();
        rec.setA(5);
        rec.setB(13);
        sq.setA(5);
        System.out.println(rec.per());
        System.out.println(sq.per());
    }
}
interface Shape{
    int per();
}

class Rec implements Shape{
    int a;
    int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public int per() {
        return 2 * (a + b);
    }
}
class Sq implements Shape{
    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public int per() {
        return 4 * a;
    }
}