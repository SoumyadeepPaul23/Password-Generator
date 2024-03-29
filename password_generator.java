import java.util.Random;
import java.util.*;


public class password_generator{
   public static void main(String[] arg) {
    int length=8;
    System.out.println("Welcome to the Random Password Generator: \n");
    System.out.println("Enter the length of your password: \n N.B:(Minimum length should be 8)");
    Scanner sc=new Scanner(System.in);
    int len=sc.nextInt();
    if(len<8){
        System.out.println("Minimum Length of password should be 8 !");
        System.exit(0);
    }

        length=len;
        System.out.printf("Your generated password of length %d is : ",length);
      System.out.println(generatePassword(length));
   }

   private static char[] generatePassword(int length) {
      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
      String specialCharacters = "!@#$";
      String numbers = "1234567890";
      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
      Random random = new Random();
      char[] password = new char[length];

      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
      password[3] = numbers.charAt(random.nextInt(numbers.length()));
   
      for(int i = 4; i< length ; i++) {
         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
      }
      return password;
   }
}
