package com.wangdao.day22.homework03;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework03 {

    /**
     *
     * @param configFilePath 表示配置文件的路径
     */
    public void callTargetMethod(String configFilePath) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(configFilePath));
            String className = properties.getProperty("className");
            String methodName = properties.getProperty("methodName");
            Class c = Class.forName(className);
            Object o = c.newInstance();
            Method declaredMethod = c.getDeclaredMethod(methodName);
            declaredMethod.invoke(o);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
