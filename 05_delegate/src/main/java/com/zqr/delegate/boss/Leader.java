package com.zqr.delegate.boss;

import java.util.HashMap;
import java.util.Map;

public class Leader implements IEmployee{
    public static String BUG_UPDATE= "updateBug";
    public static String DATA_DELETE = "deleteData";
    public static String SERVER_BONG = "bongServer";
    private Map<String,IEmployee> empees = new HashMap<String, IEmployee>();
    public Leader(){
        empees.put(BUG_UPDATE,new EmployeeBug());
        empees.put(DATA_DELETE,new EmployeeData());
        empees.put(SERVER_BONG,new EmployeeBong());
    }

    /**
     * 改造后：使用注册式单例获取员工
     * @param command
     * @return
     */
    public String doing(String command) {
        return empees.get(command).doing(command);
    }


    /**
     * 改造前：简单工厂模式获取员工
      * @param command
     * @return
     */
//    public String doing(String command){
//            if (command.equals(BUG_UPDATE)){
//                return  new EmployeeBug().doing(command);
//            }else if (command.equals(DATA_DELETE)){
//                return new EmployeeData().doing(command);
//            }else if (command.equals(SERVER_BONG)){
//                return new EmployeeBong().doing(command);
//            }else {
//                return "请输入正确的命令!!!";
//            }
//
//        }
}
