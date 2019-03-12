package deep;

import java.util.Date;

public class Monkey {
    public int heignt;
    public int weignt;
    public Date birthday;

    public Monkey() {
    }

    public Monkey(int heignt, int weignt, Date birthday) {
        this.heignt = heignt;
        this.weignt = weignt;
        this.birthday = birthday;
    }

    public int getHeignt() {
        return heignt;
    }

    public void setHeignt(int heignt) {
        this.heignt = heignt;
    }

    public int getWeignt() {
        return weignt;
    }

    public void setWeignt(int weignt) {
        this.weignt = weignt;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
