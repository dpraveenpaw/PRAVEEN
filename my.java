class Main {
  public static void main(String[] args) {

    int low = 999, high = 99999;

    for(int number = low + 1; number < high; ++number) {
      int digits = 0;
      int result = 0;
      int originalNumber = number;

      // number of digits calculation
      while (originalNumber != 0) {
        originalNumber /= 10;
        ++digits;
      }

      originalNumber = number;

      // result contains sum of nth power of its digits
      while (originalNumber != 0) {
        int remainder = originalNumber % 10;
        result += Math.pow(remainder, digits);
        originalNumber /= 10;
      }

      if (result == number) {
        System.out.print(number + " ");
      }
    }

  }
 # new code develop by f2
 
 class Main {
  public static void main(String[] args) {

    String str = "Java";

    // format string 
    String formatStr = String.format("Language: %s", str);

    System.out.println(formatStr);
  }
}

// Output: Language: Java
  }
# code end of f2