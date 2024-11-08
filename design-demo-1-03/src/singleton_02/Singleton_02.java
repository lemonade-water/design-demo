package singleton_02;

import entity.Student;

public class Singleton_02 {

    private final static Student student = new Student();
    public static Student getInstance(){
        return student;
    }
}
