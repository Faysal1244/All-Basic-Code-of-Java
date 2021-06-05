package OOP_Overloading_COnstructor;

public class Overloading_Constructor_Test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();

        Teacher teacher2 = new Teacher("Anis",156987456);


        Teacher teacher3 = new Teacher("Faysal", "Male",17895645);

        teacher1.displayInformation();
        teacher2.displayInformation();
        teacher3.displayInformation();

    }
}
