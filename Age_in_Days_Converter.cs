using System;

class Program
{
    static void Main(string[] args)
    {
        Console.Write("Enter your age in years: ");
        int years = Convert.ToInt32(Console.ReadLine());
        int days = years * 365;
        Console.WriteLine("Your age in days is: " + days);
        Console.ReadKey();
    }
}