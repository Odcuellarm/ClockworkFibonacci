import java.lang.Math;
import java.util.*;
import java.math.BigDecimal; 
import java.math.BigInteger;  

public class CloclworkFibonacci{

   public static void main (String []args){
   
   double goldMean =  1.618033988749895;
   double inverseGold = -0.6180339887498948;
   List<BigInteger> fibonacciNumbers = new ArrayList<BigInteger>();
 
   
   System.out.println("********* YOUR FIRST 100 FIBONACCI NUMBERS *********");
   
   //Calculates the first 100 fibonacci numbers
   for(int i = 1; i < 101; i++){
    
      //Binet's Formula
      BigDecimal bigFibonacci = new BigDecimal( 
         (Math.pow(goldMean, i) - Math.pow(inverseGold, i)) / Math.sqrt(5)  
      );
      
      //The number is added to the list
      fibonacciNumbers.add(bigFibonacci.toBigInteger());
      
   }
   
   //Prints to the console the firt 100 fibonacci numbers
   for (int i = 0; i < fibonacciNumbers.size(); i++){
         System.out.println(fibonacciNumbers.get(i));
   }
   
   //Finds the fibonacci numbers that are multiples of 5
   System.out.println("********* FIBONACCI MULTIPLES OF 5 ************");
   
   for (int i = 0; i < fibonacciNumbers.size(); i++){
      
      if(fibonacciNumbers.get(i).mod(BigInteger.valueOf(5)) == BigInteger.valueOf(0)){
         System.out.println(fibonacciNumbers.get(i));
      }
   }
   
   //Finds the fibonacci numbers that are multiples of 7
   System.out.println("********* FIBONACCI MULTIPLES OF 7 ************");
   
   for (int i = 0; i < fibonacciNumbers.size(); i++){
      
      if(fibonacciNumbers.get(i).mod(BigInteger.valueOf(7)) == BigInteger.valueOf(0)){
         System.out.println(fibonacciNumbers.get(i));
      }
   }
   
   }//End of main
   
}//End of ClockworkFibonnaci