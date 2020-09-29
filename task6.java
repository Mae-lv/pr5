package ru.mirea.pr5;

public class task6
{
    private static int recursion(int n, int var)
    {
        if (n > 1)
        {
            if (n % var != 0)
            {
                return recursion(n, var+1);
            } else if (n % var == 0)
            {
                if (var == n)
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
                return 0;
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        recursion(987654321,2);
    }
}
