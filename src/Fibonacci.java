import java.util.Scanner;

public class Fibonacci {
   public static void solveFibonacci(){
        int SeriesNumber ;
        Scanner takeInput=new Scanner(System.in);

        System.out.print("Enter the length of fibonacci series : ");
        SeriesNumber=takeInput.nextInt();

        int[] num = new int[SeriesNumber];
        num[0] = 0;
        num[1] = 1;
        //number should be sum of last two numbers of Series
        for(int index=2; index < SeriesNumber; index++){
            num[index] = num[index-1] + num[index-2];
        }

        System.out.println("fibonacci series : ");
        for(int index=0; index< SeriesNumber; index++){
            System.out.print(num[index] + " ");
        }

    }
    }

