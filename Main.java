import java.util.Scanner;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int base = sc.nextInt();
        int bitManip = convertDecIMAL(num,basse);

    }


    public static int convertDecIMAL(int input, int base){
        int answer=0;
        int multiplier =1;
        String symbols = "0123456789ABCDEF";
        while(input!=0)
        {
            answer = (input%10)*multiplier+answer;
            input=input/10;
            multiplier=multipler*base;
        }
    }
    return answer;
}
