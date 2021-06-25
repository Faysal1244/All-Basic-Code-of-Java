package ENCOACADEMY.DesignPattern;

public class Student {
    int a= 5;
    //    private static final Student STUDENT_OBJ= new Student();
    private static  Student STUDENT_OBJ;


    private Student() {

    }

    static {
        try
        {
            STUDENT_OBJ = new Student();
        }catch(Exception e){
            throw new RuntimeException(e);
        }

    }

    public static Student getStudentInstance() {
        return STUDENT_OBJ;
    }
}
