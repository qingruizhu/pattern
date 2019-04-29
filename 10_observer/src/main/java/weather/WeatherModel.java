package weather;

/**
 * @Description:通知内容
 * @Auther: qingruizhu
 * @Date: 2019-04-29 16:47
 */
public class WeatherModel {
    private int code;
    private String message;

    public WeatherModel(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNotice() {
        if (code == 200) {
            return "出去玩去喽!";
        }
        if (code == 400) {
            return "请注意啦⚠️";
        }
        return "爱干嘛干嘛去";

    }

}
