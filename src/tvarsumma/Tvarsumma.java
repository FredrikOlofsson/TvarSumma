package tvarsumma;

import java.util.Scanner;

public class Tvarsumma {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please Provide a number : ");
        int number = input.nextInt();
        int total = tvarSum(number);
        System.out.println("The sum of all digits added together seperatly is: = " + total);
        if (total%3 == 0) System.out.println("The number is devisible by three!");
    }
    
    /**
     * Calculates the sum of each digit in the number you give to the function
     * @param num positive int number.
     * @return the sum of each number in the integer added together.
     */
    public static int tvarSum(int num){
        if (num < 10){
            return num;
        }
        int lastNum = num%10;
        int tempNumC = tvarSum((num-lastNum)/10);
        
        return lastNum+tempNumC;
        
    } 
}