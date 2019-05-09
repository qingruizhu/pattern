package threadlocal;

public class ThreadLocalTest {
    public static void main(String[] args) {

        for (int i = 0; i <20 ; i++) {
            new Thread() {
                @Override
                public void run(){
                    System.out.println(Thread.currentThread().getName()+":start run.......");
                    ThreadLocalSingleton bean1 = ThreadLocalSingleton.getInstance();
                    ThreadLocalSingleton bean2 = ThreadLocalSingleton.getInstance();
                    ThreadLocalSingleton bean3 = ThreadLocalSingleton.getInstance();
                    ThreadLocalSingleton bean4 = ThreadLocalSingleton.getInstance();
                    ThreadLocalSingleton bean5 = ThreadLocalSingleton.getInstance();
                    System.out.println(Thread.currentThread().getName()+":"+bean1);
                    System.out.println(Thread.currentThread().getName()+":"+bean2);
                    System.out.println(Thread.currentThread().getName()+":"+bean3);
                    System.out.println(Thread.currentThread().getName()+":"+bean4);
                    System.out.println(Thread.currentThread().getName()+":"+bean5);
                    System.out.println(Thread.currentThread().getName()+":end run.......");
                }
            }.start();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.fillInStackTrace();
            }

        }

    }
}
