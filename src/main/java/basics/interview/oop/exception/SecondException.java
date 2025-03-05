package basics.interview.oop.exception;

public class SecondException extends Exception
{
    public SecondException(String message)
    {
        System.err.println("SecondException");
    }
}
