enum Status {
    RUNNING,FAILED,PENDING,SUCCESS;
}
public class demo2 {
    public static void main(String[] args) {
        Status myVar=Status.PENDING;
        switch(myVar){
            case RUNNING :
                System.out.println("ok running");
                break;
            case FAILED : 
                System.out.println("failed to perform");
                break;
            case PENDING :
                System.out.println("Please wait");
                break;
            case SUCCESS : 
                System.out.println("hurray !");
                break;
        }
        System.out.println(myVar.ordinal()); //returns the position of the cnstant in enum class

    }
}
