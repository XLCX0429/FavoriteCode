public class FirstClass {
    public boolean isTrue(boolean b) {
        if (b) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        FirstClass fc = new FirstClass();
        System.out.println(fc.isTrue(true));
        System.out.println(fc.isTrue(false));
    }
}
