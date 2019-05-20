package staticproxy.demo01;

/**
 * 静态代理角色:Father
 */
public class Father implements Person {/** 1.代理对象提供与真实对象相同的接口，以便在任何时刻都能代替真实对象 */
    /**
     * 2.内部含有对真实对象RealSubject的引用,从而可以操作真实对象
     */
    private Person son;

    public Father(Person person) {
        this.son = person;
    }


    public void findLove() {
        /** 3.代理对象可以在执行真实对象操作时，附加其他的操作，相当于对真实对象进行封装 */
        System.out.println("[father]我是你爹：我给你找.......");
        son.findLove();
        System.out.println("[father]你老爹我同意了,交往吧.......");
    }

    /**
     * 动态代理和静态对比基本思路是一致的，只不过动态代理功能更加强大，随着业务的扩展适应性更强，
     * 这个Father在动态代理模式下，会转变成媒婆，不仅仅能给他自己的闺女和儿子找对象，还可为别的客户找对象，发展成为一个产业链(婚介所)。
     */
}


