public class Inst {
    int speed;
    Inst() {
        System.out.println("speed is "+speed);
    }
    {
        speed=100;
    }
    public static void main(String[] args) {
        Inst s1 = new Inst();
    }
}