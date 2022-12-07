//javac Volume02.java 
//java Volume02 4 10 10 5
public class Volume02 {
    public static void main(String[] args) {

        double cubeA = Double.parseDouble(args[0]);
        double sphereR = Double.parseDouble(args[1]);
        double cylinderH = Double.parseDouble(args[2]);
        double cylinderR = Double.parseDouble(args[3]);
        System.out.println("volume of cube is = " + volumeCube(cubeA));
        System.out.println("volume of sphere = " + volumeSphere(sphereR));
        System.out.println("volume of cylinder = " + volumeCylinder(cylinderR, cylinderH));
    }

    static double volumeCube(double cubeA) {
        return Math.pow(cubeA, 3);
    }

    static double volumeSphere(double sphereR) {
        return ((Math.pow(sphereR, 3) * 4 * (3.14)) / 3);
    }

    static double volumeCylinder(double cylinderR, double cylinderH) {
        return ((Math.pow(cylinderR, 2) * 22 * cylinderH) / 7);
    }
}
