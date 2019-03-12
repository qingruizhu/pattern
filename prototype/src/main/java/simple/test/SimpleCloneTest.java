package simple.test;

import simple.ConcretePrototypeA;

import java.util.ArrayList;

public class SimpleCloneTest {

    public static void main(String[] args) {
        ConcretePrototypeA prototypeA = new ConcretePrototypeA();
        prototypeA.setName("宋江");
        prototypeA.setAge(18);
        ArrayList<String> hobbies = new ArrayList<String>();
        hobbies.add("喝酒");
        hobbies.add("抽烟");
        hobbies.add("烫头");
        prototypeA.setHobbies(hobbies);

        ConcretePrototypeA shallow = (ConcretePrototypeA)prototypeA.shallowClone();
        System.out.println("prototypeA："+prototypeA.getHobbies());
        System.out.println("clone："+shallow.getHobbies());
        System.out.println(prototypeA.getHobbies()==shallow.getHobbies());
        System.out.println("---------------------------------------------");
        ConcretePrototypeA deep = (ConcretePrototypeA)prototypeA.deepClone();
        System.out.println("prototypeA："+prototypeA.getHobbies());
        System.out.println("clone："+deep.getHobbies());
        System.out.println(prototypeA.getHobbies()==deep.getHobbies());
    }
}
