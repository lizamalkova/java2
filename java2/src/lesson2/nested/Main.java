package lesson2.nested;

public class Main {

    private int var2 = 2;

    public static void main(String[] args) {
        Main main = new Main();
//        Test test = new Test();
        Main.Test test = main.new Test();

        test.getVar();

    }

    protected class Test{
        protected int var = var2;

        public int getVar() {
            return var;
        }

        public void setVar(int var) {
            this.var = var;
        }
    }
}
