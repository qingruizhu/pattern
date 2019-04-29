package course;

/**
 * @Description:
 *          模板类：上课的整个过程
 * @Auther: qingruizhu
 * @Date: 2019-04-28 09:15
 */
public abstract class NetWorkCourse {


    public final void createCourse(String name){
        this.preCourse();
        this.studying(name);
        if (this.needCheckWork()){
            this.checkWork();
        }
        this.ending();
        System.out.println("------------------------------------------------------------");
    }

    private void ending() {
        System.out.println("学习结束...");
    }

    protected abstract void checkWork();

    protected boolean needCheckWork(){
        return false;
    }

    private void studying(String name) {
        System.out.println("学习["+name+"]ing...");
    }

    private final void preCourse(){
        System.out.println("预习...");

    }
}
