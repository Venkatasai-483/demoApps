public class Test {

    public static void main(String[] args) {

        System.out.println(add(12, 67));
        System.out.println(mul(2, 7));

        System.out.println(isEven(10));
        System.out.println(isEven(15));
        System.out.println(isEven(100));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}