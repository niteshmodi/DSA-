// 1. You've to display the digits of a number.
// 2. Take as input "n", the number for which digits have to be displayed.
// 3. Print the digits of the number line-wise



import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           
           int n = in.nextInt();
           int digits = countDigits(n);
           int tens= 1;
           for (int i =0; i<digits-1; i++){
               tens= tens * 10;
           }
           
           while (tens> 0) {
               System.out.println(n/tens);
               n = n % tens;
               tens = tens/10;
           }
           
     }
     
     
     static int countDigits(int n){
         int count = 0 ;
         while(n>0){
            n = n/10;
             count++;
         }
         return count;
     }
    }