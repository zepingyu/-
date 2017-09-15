package com.company;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//Properties配置文件的单例模式
public class MySingleton4 {
    //设定配置文件地址
    private static final String filePath = "/home/yzp/user.properties";
    private File myFile = null;
    //最后一次更新时间
    private long lastTime = 0;
    //配置文件
    private Properties myProps = null;
    //配置文件--用户
    private String p_user = "";
    //配置文件--密码
    private String p_password = "";
    //设立静态变量，直接创建实例
    private static MySingleton4 mySingleton = null;

    //获取从配置文件取得的信息
    public String getPuser(){
        return p_user;
    }
    public String getPpassword(){
        return p_password;
    }
    private MySingleton4() {
        // 私有化构造函数
        System.out.println("-->私有化构造函数被调用，创建实例中");
        myFile = new File(filePath);
        lastTime = myFile.lastModified();
        if (lastTime == 0) {
            System.err.println(filePath + " file does not exist!");
        }
        myProps = new Properties();
        try {
            myProps.load(new FileInputStream(filePath));
            System.out.println("-->properties文件加载完成");
            p_user = myProps.getProperty("user");
            p_password = myProps.getProperty("password");
            System.out.println("-->properties文件属性读取完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 开放一个公有方法，判断是否已经存在实例，有返回，没有新建一个在返回
    public static MySingleton4 getInstance() {
        if(mySingleton == null){
            System.out.println("-->没有实例，调用内部类方法返回实例");
            mySingleton = new MySingleton4();
        }
        System.out.println("-->返回实例");
        return mySingleton;
    }
}

