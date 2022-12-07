public class OuterClass {
    int a = 10;
    OuterClass(){
        System.out.println("outer class constructor called ");
    }


    class InnerClass{
        int b = 10;
        public String inner = "This is a String inside inner class";
        InnerClass(){
            System.out.println("inner claass constructor called");
        }
    }

    public static void main(String[] args) {

        OuterClass myOutClass = new OuterClass();
        OuterClass.InnerClass myInClass = myOutClass.new InnerClass();
        System.out.println(myInClass.inner);
        System.out.println("myInClass.b + myOutClass.a = " + (myInClass.b+myOutClass.a));

    }

}
