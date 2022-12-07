public class IndexOutOfBound {
    public static void main(String[] args) throws IndexOutOfBoundsException {

        String str = "My String";

        try {
            System.out.println(str.charAt(9));
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException();

        } finally {
            System.out.println("finally Block");
        }

    }
}
