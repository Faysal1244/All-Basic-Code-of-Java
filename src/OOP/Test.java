package OOP;

public class Test {
    public static void main(String[] args) {
//        Teacher teacher1; //Object Declare

//        teacher1 = new Teacher();
//
//        teacher1.name = "Faysal Rahman";
//        teacher1.gender = "Male";
//        teacher1.phone = 1608515417;
//
//        teacher1.displayInformation();
//third Process by using parameter

//        teacher2.name = "Shohan Rahman";
//        teacher2.gender = "Male";
//        teacher2.phone = 1608515417;


//        Teacher teacher2 = new Teacher();
//        teacher2.setInfo("Shohan Rahman", "Male", 1608515417);
//
//        teacher2.displayInformation();

        //By using Construct

        Teacher teacher3 = new Teacher("Abul Kasem", "Male", 1608515417);

        teacher3.displayInformation();
        
        //Default Constructor

        Teacher teacher4 = new Teacher();
        teacher4.displayInformation();
    }
}
