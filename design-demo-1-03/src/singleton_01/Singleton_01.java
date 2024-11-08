package singleton_01;

import entity.Student;

public class Singleton_01 {

    private static Student student = null;
    public static Student getInstance(){
        if (student==null){
            student = new Student();
        }
        return student;
    }
}
