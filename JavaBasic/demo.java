
public class demo {

    public static void main(String[] args) {
        System.out.println(bmiCalcu(1.63, 55));

    }
    
    public static double bmiCalcu(double height, double weight) {
        double bmi = weight / (height * height);
        return bmi;
    }

}



    