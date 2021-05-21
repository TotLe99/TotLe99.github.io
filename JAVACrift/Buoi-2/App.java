public class App {
    public static void main(String[] args){
        System.out.println("Chào các bạn");

        Math math = new Math();
        System.out.println(math.isOdd(4));

        float weight = 60f;
        float height = 1.7f;
        System.out.println("Chỉ số BMI : " +math.calculateBMI(height, weight));

        float diameter = 3.0f;
        System.out.println("Chu vi hình tròn : " + diameter + " = " + math.circle_perimeter(diameter));
        
        // float x = 3.0f;
        // float y = 4.0f;
        // float z = 5.0f;
        // System.out.println("x : " + x + ", y : " + y + ", z " + z +);

        System.out.println("Số nhỏ nhất x: " + x
         + ", y: " + y
         + ", z: " + z
         + " là " + math.smallestIn3Numbers(x, y ,z));

         int[] intArray = new int[]{1, 2, 3};
         System.out.println("Tổng của mảng: " + math.sum(intArray));
    }
}
