package singleton_04;

import entity.Student;

public class Singleton_04 {

    private static Student student = null;
    public static Student getInstance(){
        if (student == null) {
            synchronized (Singleton_04.class) {
                if (student == null) {
                    student = new Student();
                }
            }
        }
        return student;
    }
}
