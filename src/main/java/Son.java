public class Son extends Father {
    public static void say(){
        System.out.println(o);
    }
    private String m;
    public String n="nnnnnnn";
    private static String o = "qqqqqqqq";

    private int pint;
    public int qint=333333333;
    private static int sint = 44444444;

    public Son() {
        System.out.println("son空参构造");
    }
    static{
        System.out.println("son静态代码块");
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public static String getO() {
        return o;
    }

    public static void setO(String o) {
        Son.o = o;
    }

    public int getPint() {
        return pint;
    }

    public void setPint(int pint) {
        this.pint = pint;
    }

    public int getQint() {
        return qint;
    }

    public void setQint(int qint) {
        this.qint = qint;
    }

    public static int getSint() {
        return sint;
    }
    public static void setSint(int sint) {
        Son.sint = sint;
    }
}
