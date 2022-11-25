public class Volume {
    public static void main(String[] args) {
        calcVolume cube = new calcVolume();
        cube.setA(8);
        System.out.println(cube.volumeCube());
        calcVolume sphere = new calcVolume(10);
        System.out.println(sphere.volumeSphere());
        calcVolume cylinder = new calcVolume(5, 10);
        System.out.println(cylinder.volumeCylinder());

    }
}

class calcVolume {
    private double r;
    private double h;
    private double a;

    public calcVolume() {

    };

    public calcVolume(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public calcVolume(double r) {
        this.r = r;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return this.a;
    }

    public double volumeCube() {
        return Math.pow(this.a, 3);
    }

    public double volumeSphere() {
        return ((4 * (3.14) * (Math.pow(r, 3))) / 3);
    }

    // public double volumeCylinder() {
    // return ((22 / 7) * (Math.pow(this.r, 2)) * this.h);
    // }
    public double volumeCylinder() {
        return (r * r * h * 3.14);
    }

    public double getH() {
        return h;
    }

    public double getR() {
        return r;
    }

}
