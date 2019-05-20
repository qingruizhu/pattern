package deep;

import java.io.*;
import java.util.Date;

public class SunWuKong extends Monkey implements Cloneable,Serializable{
    private JinGuBang jinGuBang;
    public SunWuKong() {
    }
    public SunWuKong(int heignt, int weignt, Date birthday) {
        super(heignt, weignt, birthday);
    }

    public JinGuBang getJinGuBang() {
        return jinGuBang;
    }

    public void setJinGuBang(JinGuBang jinGuBang) {
        this.jinGuBang = jinGuBang;
    }

    /**
     * 重写克隆方法，调用自己的深克隆：序列化反序列化方式
     * @return
     */
    @Override
    public Object clone(){
        return this.deepClone();
    }
    private Object deepClone(){
        try {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(this);

            ByteArrayInputStream is = new ByteArrayInputStream(os.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(is);
            SunWuKong cp = (SunWuKong)ois.readObject();
            cp.setBirthday(new Date());
            return cp;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
        }
        return null;
    }

    /**
     * 浅克隆，只复制值，不复制引用对象地址
     * @return
     */
    public SunWuKong shallowLClone(){
        SunWuKong clone = new SunWuKong(this.heignt, this.weignt, new Date());
        clone.setJinGuBang(this.jinGuBang);
        return clone;
    }

}
