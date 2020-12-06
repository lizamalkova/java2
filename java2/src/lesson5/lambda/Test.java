package lesson5.lambda;

public class Test {
    private final int VAR_X = 10;
    private final int VAR_Y = 25;
    private ConstVar constVar;


    public static void main(String[] args) {

        var test = new Test();

    }

    public Test() {
    }

    public Test(ConstVar constVar) {
        this.constVar = constVar;
    }

    private static void helloMessage(String name) {
        System.out.println("Hello, " + name);
    }

    public void testNoneVar(NoneVar obj) {
        obj.start();
    }

    public void testOneVar(OneVar obj) {
        obj.start(VAR_X);
    }

    public void testTwoVar(TwoVar obj) {
        obj.start(VAR_X, VAR_Y);
    }
}
