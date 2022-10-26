public class App {
    // method
    public void name() {
        int a = 1;
        int b = 2;
        System.out.println(a + b);
    }

    // method with return type
    public int name2() {
        int a = 2;
        int b = 2;
        return a + b;

    }

    // main method
    public static void main(String[] args) throws Exception {

        App app = new App();
        app.name();
        System.out.println("The sum of method with return type is: " + app.name2());

    }

}
