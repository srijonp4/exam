public class UseSuper {
    public int a;
    public int b;
    public UseSuper(int a ,int b){
        System.out.println("parent "+getClass()+" constructor called");
        this.a = a;
        this.b= b;
    }
    public void display(){
        System.out.printf("display() methode in UseSuper"+getClass());
    }

    public static void main(String[] args) {

        UseSuper parent = new UseSuper(10,20);
        parent.display();
        Sub child = new Sub(100,200,500);
        child.display();

    }
}
class Sub extends UseSuper
{
    int x ;
    Sub(int a, int b,int x){

       super(a,b);
        System.out.println("superclass constructor called");
        this.x=x;
    }

    @Override
    public void display() {
        System.out.println("display methode in Sub class");
        super.display();
    }
}
