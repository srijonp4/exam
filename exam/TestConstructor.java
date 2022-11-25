public class TestConstructor {
    public static void main(String[] args) {
        Student1 alan = new Student1();
        System.out.println(alan.name);
//        Student1 two =  alan;==>this thing doesn't allocates memory it just points to the same object in heAP Memory.
//        System.out.println(two.name);
//        two.name="alan";
//        System.out.println(alan.name);
        Student1 Ajax;
        for(int i = 0 ; i<645646546 ; i++){
            Ajax = new Student1();
        }

    }
}
class Student1{
    int rollno;
    String name;
    double marks;
    Student1(){
        this(0,"default_Name",100.00);
    }
    Student1(int rollno,String name,double marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }

    protected  void finalize() throws Throwable{
        //tells it what to do when memory is freed;
        System.out.printf("Object destroyed");
    }
}