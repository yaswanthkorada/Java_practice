//copy constructor copying the objects of one to another through constructor

class concpy {
    int id;
    String name;

    concpy(int i,String n) {
        id=i;
        name=n;
    }

    concpy(concpy s){
        id=s.id;
        name=s.name;
    }
    void display() {
        System.out.println(id+ " "+name);
    }
    public static void main(String[] args) {
        concpy c1=new concpy(1,"Teja");
        concpy c2=new concpy(c1);
        c1.display();
        c2.display();
    }
}