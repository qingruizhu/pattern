package staticproxy.demo01;

public class Father implements Person {
    private Person person;

    public Father(Person person) {
        this.person = person;
    }


    public void findLove() {
        System.out.println("[father]我是你爹：我给你找.......");
        person.findLove();
        System.out.println("[father]你老爹我同意了,交往吧.......");
    }
}
