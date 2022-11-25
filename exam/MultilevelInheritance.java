public class MultilevelInheritance {
    private String a = "I love java";

    public String getA() {
        return a;
    }

    public static void main(String[] args) {
        MultilevelInheritance n1 = new MultilevelInheritance();
        MI2 n2 = new MI2();
        MI3 n3 = new MI3();
        highlevelonly();
        System.out.println(n3.getA());
        System.out.println(n3.getB());
        System.out.println(n3.getC());
    }
    public static void highlevelonly(){
        System.out.printf("I only use HIGH LEVEL Language \n");
    }
}
class MI2 extends MultilevelInheritance{
    private String b = "I love JS";
    public String getB(){
        return this.b;
    }


}
class MI3 extends MI2{
    private String c = "I love python ";
    public String getC(){
        return c ;
    }

}
