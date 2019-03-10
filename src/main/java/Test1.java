
public class Test1 {
    private int id;
    private String name;
    private int age;

    public String getMsg1(String id,String name){
        String age = "18";
        String msg = name+ ":"+age+";id="+id;
        return msg;
    }
    public static String getMsg(String name){
        String age = "18";
        String id = " 8";
        String msg = name+ ":"+age+";id="+id;
        return msg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
