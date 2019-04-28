package factory.method;

public class MethodFactoryTest {

    public static void main(String[] args) {
        MethodFactory factory = new JavaMethodFactory();
        factory.create().record();

        MethodFactory factory2 = new PythonMethodFactory();
        factory2.create().record();
    }
}
