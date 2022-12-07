public class HierarchicalTest{
    public static void main(String[] args) {
        H2 h2 = new H2();
        H3 h3 = new H3();
        System.out.println(h2.getA());
        System.out.println(h3.getB());
    }

}
class HierarchicalInheritance {
   private int a = 100;
    private int b = 150;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }


}
class H2 extends HierarchicalInheritance{
 H2(){
     System.out.println("h2 constructor");
 }
}
class H3 extends HierarchicalInheritance{
    H3(){
        System.out.println("h3 constructor");
    }
}
