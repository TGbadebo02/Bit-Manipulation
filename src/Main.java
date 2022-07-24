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
        int answer=0;
        int multiplier =1;
        String symbols = "0123456789ABCDEF";
        while(input!=0)
        {
            answer = (input%10) * multiplier + answer;
            input=input/10;
            multiplier = multiplier * base;
        }
        return answer;
    }
}
