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
    public int sum3(int a, int b) {
        return a + b;
    }

    // main method
    public static void main(String[] args) throws Exception {

        App app = new App();
        app.sum();
        System.out.println("The sum of method with return type is: " + app.sum2());
        System.out.println("The sum of method with parameters is: " + app.sum3(100, 3));

    }

}
