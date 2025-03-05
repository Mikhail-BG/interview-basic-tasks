package basics.interview.task.string.rotationstring;

public class RotationString
{
    public static void main(String[] args)
    {
        String ex1 = "IndiaVsEngland";
        String ex2 = "EnglandIndiaVs";

        String ex3 = "IndiaVsAustralia";
        String ex4 = "AustraliaVsIndia";

        System.out.println(checkRotatation(ex1, ex2));
        System.out.println(checkRotatation(ex3, ex4));
    }

    public static boolean checkRotatation(String original, String rotation)
    {
        if (original.length() != rotation.length())
        {
            return false;
        }

        String concatenated = original + original;

        if (concatenated.contains(rotation))
        {
            return true;
        }
        return false;
    }
}
