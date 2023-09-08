class Bank {
    int rateOfInterest() {
        return 0;
    }
}
class Sbi extends Bank{
    int rateOfInterest() {
        return 7;
    }
}
class Axis extends Bank {
    int rateOfInterest(){
        return 9;
    }
}
public class Method {
    public static void main(String[] args) {
        Sbi s1 = new Sbi();
        Axis a1=new Axis();
        System.out.println("Sbi Rate Of Interest = "+s1.rateOfInterest());
        System.out.println("Axis Rate Of Interest = "+a1.rateOfInterest());
    }
}
