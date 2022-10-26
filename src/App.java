public class App {
    // method
    public void sum() {
        int a = 1;
        int b = 2;
        System.out.println(a + b);
    }

    // method with return type
    public int sum2() {
        int a = 2;
        int b = 2;
        return a + b;

    }

    // create a method with parameters
    public int sum3(int a, int b, int c) {
        return a + b + c;
    }

    // method overloading with different parameters using float
    public float sum3(float a, int b) {
        return a + b;
    }

    public byte sum3(byte a, int b) {
        return (byte) (a + b);
    }

    // method overloading with parameters using double data type
    public double sum3(double a, double b) {
        return a + b;
    }

    // method overloading with parameters using byte data type
    public byte sum4(byte a, byte b) {
        return (byte) (a + b);
    }

    // method overloading with parameters using long data type
    public long sum5(long a, long b) {
        return a + b;
    }

    // method overloading with parameters using short data type
    public short sum6(short a, short b) {
        return (short) (a + b);
    }

    // main method
    public static void main(String[] args) throws Exception {

        App app = new App();

        app.sum();

        System.out.println("The sum of method with return type is: " + app.sum2());

        System.out.println("The sum of method with parameters is: " + app.sum3(1, 2, 3));

        System.out.println("The sum of method with parameters using float is: " + app.sum3(2.5f, 3));

        System.out.println("The sum of method with parameters using byte is: " + app.sum3((byte) 2, 3));

        System.out.println("The sum of method with parameters using double data type is: " + app.sum3(100.0, 3.0));

        System.out.println(
                "The sum of method with parameters using byte data type is: " + app.sum4((byte) 100, (byte) 3));

        System.out.println("The sum of method with parameters using long data type is: " + app.sum5(100L, 3L));

        System.out.println(
                "The sum of method with parameters using short data type is: " + app.sum6((short) 100, (short) 3));

    }

}
