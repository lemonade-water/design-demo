package singleton_03;

import entity.Student;

public class Singleton_03 {

    private static Student student = null;
    public synchronized static Student getInstance(){
        if (student==null){
            student = new Student();
        }
        return student;
    }
}
