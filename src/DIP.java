public class DIP {
    public static void main(String[] args) {
        Lamp b = new Lamp();
        b.turnOff();
    }
}

class Button{
    private ButtonServer button;
    public void poll(){
        button.turnOn();
    }
}
interface ButtonServer{
    void turnOn();
    void turnOff();
}

class Lamp implements ButtonServer{
    @Override
    public void turnOn() {
        System.out.println("Turn On");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn Off");
    }
}
