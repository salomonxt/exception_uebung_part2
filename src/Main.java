public class Main {
    public static void main(String[] args) {
        getValue();
    }

    public static String getValue() {
        //exception
        throw new RuntimeException("not found, my friend");
    }
}
