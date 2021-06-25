package Problem_01;

public class box {

    double height, width, depth;

    box(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }

    void displayVol() {
        double vol = height * width * depth;
        System.out.println("Volume is =" + vol);
    }
}
