import java.io.*;
class Interactive_Program
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(isr);
        int num;
        System.out.println("Input a number");
        num=Integer.parseInt(stdin.readLine());
        System.out.println("Your number is "+num);
    }
}