import java.util.Scanner;
public class Main {
    public static void main(String [] args)
    {
       // System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        System.out.println("Enter your base number: ");
        int base = sc.nextInt();
        int bitManip = convertDecIMAL(num, base);
        System.out.println("Conversion = " + bitManip);

    }


    public static int convertDecIMAL(int input, int base){
        int answer=0;//this variable is created to store the result
        int multiplier =1;//the multipying variable
        String symbols = "0123456789ABCDEF";//these are the symbols that are used for the bit maipulation/
        while(input!=0)// a while loop, to loop the the program until the condition is no longer met
        {  // here is the overall calculation of the bit manipulation.
            answer = (input%10) * multiplier + answer;
            input=input/10;
            multiplier = multiplier * base;
        }
        //the return statement for the answer at the end of the loop
        return answer;
    }
}
