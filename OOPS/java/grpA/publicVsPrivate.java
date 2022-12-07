public class publicVsPrivate {
    public static void main(String[] args) {

        Test test = new Test();
        System.out.println(test.getPrivateString());
        System.out.println(test.publicString);

    }
}

class Test {

    private String privateString = "This is a private String , to access it we have to make a getMethod, in this case it is getPrivateString()";

    public String publicString = "This is a Public String we can access it directly from any where";

    // public String getPrivateString() {
    // return privateString;
    // }
    public String getPrivateString() {
        return privateString;
    }

    Test() {
        System.out.println("Test class constructor called");
    }

    public static void display() {
    }
}