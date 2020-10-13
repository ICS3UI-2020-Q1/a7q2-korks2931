import java.util.Scanner; 
/**
 * This program will give the factors of the given number 
 * @author Sevde
 */
public class Main {
  // A method to find the factors of a number 
  public static void numberFactors (int numberUser){
   // make a for loop to print out the factors of the number 
    for ( int i = 1; i <= numberUser; i++){
     int remainder = numberUser % i;
     // make an if statemnt to find which numbers have remainder of 0
     if (remainder == 0){
       System.out.println(i);
     }
    }
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input 
    Scanner input= new Scanner(System.in);
    // variable for the user input number 
    int userNumber = input.nextInt();
    // tell the user what number print out what factors 
    System.out.println("factors(" + userNumber + ") would print out the numbers");
    // do the method
    numberFactors(userNumber) ;
    
  }
}
