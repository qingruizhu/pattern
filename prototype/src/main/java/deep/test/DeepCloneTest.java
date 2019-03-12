package deep.test;

import deep.JinGuBang;
import deep.SunWuKong;

import java.util.Date;

public class DeepCloneTest {

    public static void main(String[] args) {
        SunWuKong sunWuKong = new SunWuKong(10, 20, new Date());
        JinGuBang jinGuBang = new JinGuBang(20, 30);
        sunWuKong.setJinGuBang(jinGuBang);
        //浅克隆
        SunWuKong cloneMk = sunWuKong.shallowLClone();
        System.out.println(sunWuKong.getJinGuBang());
        System.out.println(cloneMk.getJinGuBang());
        System.out.println(sunWuKong.getJinGuBang()==cloneMk.getJinGuBang());
        //反序列化的形式实现深克隆
        SunWuKong deepMk = (SunWuKong)sunWuKong.clone();
        System.out.println(sunWuKong.getJinGuBang());
        System.out.println(deepMk.getJinGuBang());
        System.out.println(sunWuKong.getJinGuBang()==deepMk.getJinGuBang());
    }
}
