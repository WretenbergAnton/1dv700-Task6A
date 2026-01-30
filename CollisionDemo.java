import java.util.Random;

public class CollisionDemo {

  public static int hash8(String line) {
    int sum = 0;
    for (char c : line.toCharArray()) {
      sum += (int) c;
    }
    return sum % 256;
  }

  public static String randomString(Random rnd, int length) {
    String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < length; i++) {
      sb.append(chars.charAt(rnd.nextInt(chars.length())));
    }
    return sb.toString();
  }
  
  public static void main(String[] args) {
    Random rnd = new Random();
    
      System.out.println(randomString(rnd, 20));
  }
}
