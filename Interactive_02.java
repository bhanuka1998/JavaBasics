import java.io.*;
class Interactive_02
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(isr);
        int num_1=0;
        int num_2=0;
        System.out.println("Input first number ");
        num_1=Integer.parseInt(stdin.readLine());
        System.out.println("Input second number ");
        num_2=Integer.parseInt(stdin.readLine());
        int sum=0;
        sum = num_1 + num_2;
        System.out.println("Addition is "+sum);
    }
}