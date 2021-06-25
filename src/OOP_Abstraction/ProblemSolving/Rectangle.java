package OOP_Abstraction.ProblemSolving;

public class Rectangle extends Shape{
    Rectangle(double dim1,double dim2) {
//    this.dim1 = dim1;
//    this.dim2 = dim2;

        super(dim1, dim2);
    }
        void area(){
            double result = dim1*dim2;

            System.out.println("Rectangle area "+result);
        }
}


