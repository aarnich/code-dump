using System;

namespace c_
{
    class Program
    {
        static void Main(string[] args)
        {
            double bmi = 1.2;
            if (bmi < 18.5)
            {
                System.Console.WriteLine("You are underweight");
            }
            else if (bmi >= 18.5 && bmi < 25)
            {
                System.Console.WriteLine("You are normal");
            }
            else
            {
                System.Console.WriteLine("You are overweight");
            }

            var shane = "gay";
            if (shane == "straight")
            {
                shane = "not gay";
            }
            System.Console.WriteLine(shane);
        }
    }
}
