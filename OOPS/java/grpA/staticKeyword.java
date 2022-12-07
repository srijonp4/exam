import javax.sound.sampled.SourceDataLine;

public class staticKeyword {

    public static void main(String[] args) {

        TestStatic.display();
        System.out.println(TestStatic.cString);
        System.out.println(TestStatic.getaString());
        System.out.println(TestStatic.getbString());

    }

}

class TestStatic {
    static private String aString;
    static private String bString;
    static public String cString;
    static {
        aString = "hello";
        bString = "hi";
        cString = "GoodByee";
    }

    static void display() {
        System.out.println("hey we are inside a Static methode");
    }

    public static String getaString() {
        return aString;
    }

    public static String getbString() {
        return bString;
    }

}