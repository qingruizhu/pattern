package register;


public class ContainerSingletonTest {

    public static void main(String[] args) {
/*      Object bean1 = ContainerSingleton.getBean("register.ContainerSingleton");
        Object bean2 = ContainerSingleton.getBean("register.ContainerSingleton");
        Object bean3 = ContainerSingleton.getBean("register.ContainerSingleton");
        Object bean4 = ContainerSingleton.getBean("register.ContainerSingleton");
        System.out.println(bean1);
        System.out.println(bean2);
        System.out.println(bean3);
        System.out.println(bean4);*/
        //开启debug线程模式调试
        for (int i=0;i<10;i++) {
            new Thread() {
                @Override
                public void run() {
                    Object bean = ContainerSingleton.getBean("register.ContainerSingleton");
                    System.out.println(bean);
                }
            }.start();
        }

    }
}
