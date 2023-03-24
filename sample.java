
import java.util.Scanner;
public class sample{
  public static void main(String[] args){
//String Concatenation

Scanner sc =new Scanner(System.in);
        
System.out.print("Enter first string:");
String str1 = sc.nextLine();
System.out.print("Enter second string");
String str2 = sc.nextLine();
String str3 = str1.concat(str2);
System.out.println("1:concatination::"+str3);
System.out.println("2:Length of first String: " + str1.length());
System.out.println("3:Length of decond String: " + str2.length());
System.out.print("enter replace string :");
String str4 = sc.nextLine();
System.out.println("4:Replace first character with second : " + str3.replace(str2,str4));
System.out.println("5:Convert to LowerCase: " + str1.toLowerCase());
System.out.println("6:Convert to UpperCase: " + str1.toUpperCase());
boolean result1 = str1.equals(str2);

    System.out.println("Strings first and second are equal: " + result1);


}
}





































