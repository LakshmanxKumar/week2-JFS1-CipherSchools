package week2;
import java.util.*;
public class Code5 {
	
	
	 int num1,num2,result;
     Scanner sc=new Scanner(System.in);

     void Calculate() {
         try {
         System.out.println("Enter 1st no : ");
         num1=sc.nextInt();
         System.out.println("Enter 2nd no : ");
         num2=sc.nextInt();
                 
         if(num2==0) {
                 throw new ArithmeticException();
         }
         result=num1/num2;
         }

         catch(InputMismatchException ime) {
             //this block executes only if any error occurs at try block.
             System.out.println("Ouch!!! Exception detected.");
         }
         catch(ArithmeticException ae) {
             //this block executes only if any error occurs at try block.
             System.out.println("Ouch!!! Exception detected.");
         }
         finally{
             System.out.println("The division is : "  + result);
         }
         //try is a block of code that we think has probability to throw error at runtime.

         
     }
     public static void main(String[] args) {
         Code5 obj=new Code5();
         obj.Calculate();
     }


}
