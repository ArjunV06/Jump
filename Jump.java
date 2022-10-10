import java.util.*;
import java.io.*;
public class Jump
{
    public static void main(String [] args) throws IOException
    {
        Scanner in = new Scanner(new File("jump.dat"));
        int limit = in.nextInt();
        for(int i = 0; i<limit; i++)
        {
            jumpCalculate(in.nextInt());

        }

    }

    public static void jumpCalculate(int input)
    {
        int in = input;
        if((input%11==0) && (input%2==1))
        {
            System.out.println(input + " was a \"jump\" year.");
        }
        else
        {
            System.out.println(input + " was not a \"jump\" year.");
        }
    }
}