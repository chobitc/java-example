package com.example;

import java.io.File;

public class MyClassLoaderTest {

    public static void main(String[] args) {
        MyClassLoader classLoader = new MyClassLoader();
        classLoader.setRoot(getRootDir());

        Class<?> testClass = null;
        try {
            testClass = classLoader.loadClass("com.example.MyBar");
            Object object = testClass.newInstance();
            System.out.println(object.getClass().getClassLoader());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private static String getRootDir() {
        String projectDir = getProjectDir();
        String[] dirs = {projectDir, "src", "main", "resources"};
        return String.join(File.separator, dirs);
    }

    private static String getProjectDir() {
        String classLoaderPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String projectPath = classLoaderPath.substring(0, classLoaderPath.lastIndexOf("target") - 1);
        return projectPath;
    }

}
