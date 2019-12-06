import java.io.*;
class Interactive_3
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(isr);
        int num_1 = 0;
        int total = 0;
        double avg = 0;
        int count = 0;
        System.out.println("Input a number ");
        num_1 = Integer.parseInt(stdin.readLine());
        while (num_1>0)
        {
            total+=num_1;
            count++;
            avg = total/(double)count;
            System.out.println("Input a number ");
            num_1 = Integer.parseInt(stdin.readLine());
        }
        System.out.println("Total is "+total);
        System.out.println("Average is "+avg);
    }
}