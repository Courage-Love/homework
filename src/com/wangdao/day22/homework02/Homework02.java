package com.wangdao.day22.homework02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework02 {

    /**
     *
     * @param targetObj
     * @param fieldName
     * @param newValue
     * @throws Exception
     */
    public static void setAll(Object targetObj, String fieldName, Object newValue) throws Exception {
        Class c = targetObj.getClass();
        Field name = c.getDeclaredField("name");
        name.set(targetObj, fieldName);
        Field age = c.getDeclaredField("age");
        age.set(targetObj, newValue);
    }
}



