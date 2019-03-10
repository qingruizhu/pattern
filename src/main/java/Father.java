public class Father {

    private String a;
    public String b="bbbbb";
    public static String c = "ccccc";

    private int dint;
    public int eint=11111;
    private static int fint = 22222222;

    static {
        System.out.println("father静态代码块");
    }

    public Father() {
        System.out.println("father空参构造");
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public static String getC() {
        return c;
    }

    public static void setC(String c) {
        Father.c = c;
    }

    public int getDint() {
        return dint;
    }

    public void setDint(int dint) {
        this.dint = dint;
    }

    public int getEint() {
        return eint;
    }

    public void setEint(int eint) {
        this.eint = eint;
    }

    public static int getFint() {
        return fint;
    }

    public static void setFint(int fint) {
        Father.fint = fint;
    }
}
