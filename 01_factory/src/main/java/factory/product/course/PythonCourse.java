package factory.product.course;

public class PythonCourse implements ICourse {

    public String record() {
        System.out.println("Python课程记录.......");
        return "python";
    }
}
