package course;

/**
 * @Description:
 * @Auther: qingruizhu
 * @Date: 2019-04-28 09:33
 */
public class CourseTest {

    public static void main(String[] args) {
        JavaCourse javaCourse = new JavaCourse();
        javaCourse.createCourse("佳娃");
        PythonCourse pythonCourse = new PythonCourse(false);
        pythonCourse.createCourse("怕死");
    }
}
