//connecting a metod call to method body is called binding.
//static binding means the type of the object is determined at the compile ime is called static binding or early binding.
//if there is any private ,static final methods then it is a static binding.
class Stat {
    private void run() {
        System.out.println("hello anupama madam");
    }
    public static void main (String args[]) {
        new Stat().run();
    }
}