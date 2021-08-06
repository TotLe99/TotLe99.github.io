// các kiểu giá trị trong java. method là gì . class là gì . 
public class App {
    public static int tong(int a, int b){
        return a + b;
    }
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        System.out.println(tong(x, y));
    
        SmartHome smartHome = new SmartHome();
        smartHome.say("Hôm nay trời đẹp");

        SmartCar smartCar = new SmartCar();
        smartCar.run();
    }
}
