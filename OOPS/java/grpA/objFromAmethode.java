public class objFromAmethode {

    public static void main(String[] args) {

        Red newred = new Red();

        objFromAmethode.objectCreator(newred, 17);

        System.out.println(newred.i);

    }

    static Red objectCreator(Red j, int i) {

        j.setI(i);
        return j;
    }
}

class Red {

    int i;

    Red(int i) {
        this.i = i;
    }

    public Red() {
    }

    public void setI(int i) {
        this.i = i;
    }

}
