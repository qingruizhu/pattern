package course;

/**
 * @Description:
 * @Auther: qingruizhu
 * @Date: 2019-04-28 09:26
 */
public class PythonCourse extends NetWorkCourse {
    private boolean needCheckWorkFlag;

    public PythonCourse(boolean needCheckWorkFlag) {
        this.needCheckWorkFlag = needCheckWorkFlag;
    }

    public boolean isNeedCheckWorkFlag() {
        return needCheckWorkFlag;
    }

    public void setNeedCheckWorkFlag(boolean needCheckWorkFlag) {
        this.needCheckWorkFlag = needCheckWorkFlag;
    }

    @Override
    protected boolean needCheckWork() {
        return this.needCheckWorkFlag;
    }

    @Override
    protected void checkWork() {
        System.out.println("检查[Python]作业啦...");

    }
}
