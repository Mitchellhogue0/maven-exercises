//import com.sun.tools.jdeprscan.scan.Scan;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ApacheString {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter a string :)");
        String input = sc.nextLine();
        StringTest(input);

    }

  public static void StringTest (String input) {
      System.out.println("This is a number? " + StringUtils.isNumeric(input));
      System.out.println("This is the string with flipped casing: " + StringUtils.swapCase(input));
      System.out.println("This is the string reversed: " + StringUtils.reverse(input));
  }
}
