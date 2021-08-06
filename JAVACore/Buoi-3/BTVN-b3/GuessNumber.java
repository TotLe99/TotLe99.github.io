import java.util.Random;
import java.util.Scanner;

public class GuessNumber{
    public void guessNumber() {
    Random r = new Random();
    int number = r.nextInt(100);

    Scanner input = new Scanner(System.in);
    while (true) {
      System.out.println("Số bạn đoán: ");
      String str = input.nextLine();
      if (str.equals("exit")) {
        break;
      } else {
        int guessNumber = Integer.parseInt(str);
        if (guessNumber > number){
          System.out.println("Số bạn gõ vào lớn quá!");
        } else if (guessNumber < number) {
          System.out.println("Số bạn gõ vào nhỏ quá!");
        } else {
          System.out.println("Tuyệt bạn đoán đúng rồi!!! \nGõ 'exit' để thoát nhé ^^");
        }
      }
    }
    input.close();
  }
}
