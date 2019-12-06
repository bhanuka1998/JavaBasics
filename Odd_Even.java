import java.io.*;
class Odd_Even
{
    public static void main(String args[]) throws IOException
    {
        int num_1 = 0;
        //int num_2 = 0;
        int count_1 = 0;
        int count_2 = 0;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(isr);
        System.out.println("Input a number ");
        num_1 = Integer.parseInt(stdin.readLine());
        while(num_1>=0)
        {
            if(num_1%2 == 0)
            {
                count_1++;
            }
            else
            {
                count_2++;
            }
            System.out.println("Input a number ");
            num_1 = Integer.parseInt(stdin.readLine());
        }
        System.out.println("No. of odd numbers "+count_2);
        System.out.println("No. of even nembers "+count_1);
    }
}