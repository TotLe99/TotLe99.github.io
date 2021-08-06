
public class PrimeUtil{
    public boolean isPrimeA(long number){
        for (long i = 2; i < number; i++){
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public long[] createArrayPrimeNumbersB(int n) {
    long[] result = new long[n];
    int count = 0;
    int numberToCheck = 2;
    while (count < n) {
      boolean isPrime = true;
      for (int i = 0; i < count; i++) {
        if (numberToCheck % result[i] == 0) {
          isPrime = false;
          break; // không phải số nguyên tố
        }
      }
      if (isPrime) {
        result[count] = numberToCheck;
        count++;
      }
      
      numberToCheck++;
    }

    return result;
  }

}