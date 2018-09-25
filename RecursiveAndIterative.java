import java.lang.*;
public class RecursiveAndIterative {
    public RecursiveAndIterative()
    {
        int length;
    }
    public static int[] iterative(int num)
    {
        int i;
        String str = Integer.toString(num);
        int []intarray = new int[str.length()];
        for(i = str.length(); i > 0; i--)
        {
            char a = str.charAt(i - 1);
            intarray[i - 1] = Integer.parseInt(Character.toString(a));
        }
        int b = intarray.length - 1;
        for(i = 0; i < intarray.length && i != b; i++, b--)
        {
            int temp;
            temp = intarray[i];
            intarray[i] = intarray[b];
            intarray[b] = temp;
        }
        return intarray;
    }
    public static int recursive(int num)
    {
        int div = 10;
        if(num % div == num)
            return num;
        else
        {
            int integer = (num % div);
            num = num / div;
            return integer * (int)Math.pow(10,Integer.toString(num).length()) + recursive(num);
        }

    }
    public static void main(String[] args)
    {
        for(int i = 0; i < iterative(10086).length; i++)
            System.out.print(iterative(10086)[i]);
        System.out.print(recursive(10086));


    }
}
