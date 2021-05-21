package BTVN_b2;

public class Math2 {
    
    public float average(int[] numbers){
        int total = 0;
        for (int i = 0; i < numbers.length; i++){
            total = total + numbers[i];
        }
        return total / numbers.length;
    }

    public int[] reverseArray(int[] numbers){
        
        for (int i = numbers.length - 1; i >= 0; i--){
            numbers[i];
        }
        return numbers;
    }

    public int countOddNumber(int[] numbers){
        int soLe = 0, soChan = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 != 0){
                soLe++;
            } else {
                soChan++;
            }
        }
        return (soLe++) & (soChan++);
    }

    public int oddNumberArray(int[] numbers){
        int soLe = 0, soChan = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 != 0){
                soLe--;
            } else {
                soChan--;
            }
        }
        return soLe-- & soChan--;
    }

    public String bmiRating(float height, float weight){
        float chisoBMI;
        chisoBMI = weight / (height * height);
        if (chisoBMI < 18.5){
            System.out.println("Nhẹ cân");
        } else if (chisoBMI <= 24.9){
            System.out.println("Bình thường");
        } else if (chisoBMI <= 29.9){
            System.out.println("Quá cân");
        } else if (chisoBMI >= 30){
            System.out.println("Rất nguy hiểm");
        }
        return chisoBMI;
    }
}
