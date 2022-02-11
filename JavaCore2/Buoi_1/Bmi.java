package Buoi_1;

public class Bmi {

    public static void main(String[] args) {
        // kieu double
        System.out.println("Tra ve kieu double: " + bmidouble(1.5 , 40));

        //kieu void
        bmivoid(1.5 , 40);
    }

    // kiểu double
    public static double bmidouble(double height, double weight) {
    double bmi = weight / (height * height);
    return bmi;
    }

    // kiểu void
    public static void bmivoid(double canNang, double chieuCao) {
        double chiSoBmi = canNang / (chieuCao *chieuCao);
        System.out.println("Tra ve kieu void: " + chiSoBmi);
    }

}