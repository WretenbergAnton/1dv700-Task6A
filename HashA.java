public class HashA {

  /**
   * 
   * Very simple hashg function
   * Sums the character values of the input string
   * and reduces the result to 8 bits (0-255)
   */
  public static int hash8(String line) {
    int sum = 0;

    // Loop through each character in the string
    for (char c : line.toCharArray()) {
      sum += (int) c;
    }

    // Reduce to 8 bit (256 possible values)
    return sum % 256;
  }

  public static void main(String[] args) {
    // Test the hash function with a fixed example
   String example = "Hej";
   int h = hash8(example);
   
   System.out.println("Text: " + example);
   System.out.println("Hash: " + h);
  }
}
