package course;

/**
 * @Description:
 * @Auther: qingruizhu
 * @Date: 2019-04-28 09:27
 */
public class JavaCourse extends NetWorkCourse {

    @Override
    protected boolean needCheckWork() {
        return true;
    }

    @Override
    protected void checkWork() {
        System.out.println("检查[Java]作业啦...");
    }
}
