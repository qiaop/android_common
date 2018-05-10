package com.qiaop.apt_library;

import android.app.Activity;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by qiaopeng0809@gmail.com on 2018/5/10.
 */
public class BindViewTools {

    public static void bind(Activity activity){
        Class clazz = activity.getClass();

        try {
            Class bindViewClass = Class.forName(clazz.getName()+"_ViewBinding");
            Method method = bindViewClass.getMethod("bind",activity.getClass());
            method.invoke(bindViewClass.newInstance(),activity);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
