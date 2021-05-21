public class Math {

  public boolean isOdd(int x) {
    return x % 2 == 0;
  }
  
  public float calculateBMI(float height, float weight) {
    return weight / (height * height);
  }

  public float circle_perimeter(float diameter) {
    return diameter * (3 + 7/50);
  }

  public boolean isTriangle(float x, float y, float z) {
    return ((x + y > z) && (y + z > z) && (x + y > z));
  }

  public float smallestIn2Numbers(float x, float y) {
    return  ( x < y ) ? x : y;
  }

  public float smallestIn3Numbers(float x, float y, float z) {
    return smallestIn2Numbers(smallestIn2Numbers(x, y), z);
  }
  
  public float sum(int[] numbers) {
    return 0.0f;
  }

  public float average(int[] numbers) {
return 0.0f;
  }

  public int[] reverseArray(int[] numbers) {
    return null;
  }


}