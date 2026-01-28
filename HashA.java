import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;


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

  public static void main(String[] args) throws  IOException {

    // Open a text file for reading (UTF-8)
    BufferedReader reader = Files.newBufferedReader(Path.of("test.txt"), StandardCharsets.UTF_8);

    String line;
    int lineNumber = 1;

    // Read the file line by line
    while ((line = reader.readLine()) != null) {
      System.out.println(lineNumber + ": " + line);
      lineNumber++;
    }

    // Always close files when finished
    reader.close();
  }
}
