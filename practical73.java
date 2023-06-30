import java.util.regex.Pattern;
import java.util.regex.Matcher;
 
public class practical73{
  public static String checkDivisibilityBy15(String num)
  {
 
    
    String cleanedNum = num.replaceAll("[^\\d]", "");
 
    
    int sum = 0;
 
    
    for (int i = 0; i < cleanedNum.length(); i++) {
      char c = cleanedNum.charAt(i);
      sum += Character.getNumericValue(c);
    }
 
    
    if (sum % 3 == 0 && sum % 5 == 0) {
      return "Yes";
    } else {
      return "No";
    }
  }
 
  public static void main(String[] args)
  {
 
    
    String num1 = "31";
    String num2 = "156457463274623847239840239402394085458848462385346236482374823647643742374523747264723762374620";
    System.out.println(checkDivisibilityBy15(num1)); 
    System.out.println(checkDivisibilityBy15(num2)); 
  }
}
 