package factory.product.course;

public class JavaCourse implements ICourse {

    public String record() {
        System.out.println("Java课程记录.......");
        return "java";
    }
}
