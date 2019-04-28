package simple;

import java.util.ArrayList;
import java.util.List;

public class ConcretePrototypeA implements Prototype{

    private String name;
    private int age;
    private List hobbies;

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

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    /**
     * 浅克隆
     * @return
     */
    public Prototype shallowClone() {
        ConcretePrototypeA a = new ConcretePrototypeA();
        a.setName(this.name);
        a.setAge(this.age);
        a.setHobbies(this.hobbies);
        return a;
    }
    /**
     * 深克隆
     */
    public Prototype deepClone() {
        ConcretePrototypeA a = new ConcretePrototypeA();
        a.setName(this.name);
        a.setAge(this.age);
        List lst = this.hobbies;
        List<String> cpLst = new ArrayList<String>();
        for (int i = 0; i < lst.size(); i++) {
            cpLst.add((String) lst.get(i));
        }
        a.setHobbies(cpLst);
        return a;
    }
}
