class decon {
    int id ;
    String name;
     void display(){
        System.out.println(id+" "+name);
     }
     public static void main(String[] args){
        decon c1=new decon();
        decon c2=new decon();
        c1.display();
        c2.display();
     }
}