package basics.interview.oop.exception;

public class ExceptionRunner
{
    public static void main(String[] args)
    {
//        catchBothExceptions();
//        tryFinally(1);
//        tryFinally(2);
//        tryFinally(3);
        killFinally();
    }

    public static void tryFinally(int var)
    {
        try
        {
            if (var == 1)
            {
                System.out.println("tryFinally: 1");
                return;
            }
            if (var == 2)
            {
                System.out.println("tryFinally: 2");
                return;
            }
            throw new RuntimeException("tryFinally: try RuntimeException");
        }
        finally
        {
            System.out.println("tryFinally: inside finally");
        }
    }

    public static void catchBothExceptions()
    {
        try
        {
            try
            {
                first();
            }
            finally
            {
                second();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    static void first() throws FirstException
    {
        System.out.println("method f()");
        throw new FirstException("");
    }

    static void second() throws SecondException
    {
        System.out.println("method s()");
        throw new SecondException("");
    }

    public static void killFinally()
    {
        System.out.println("1 If daemon works and suspended, finally will not work");
        try
        {
            System.out.println("2 System.exit(0)");
        }
        finally
        {
            System.out.println("3 Exception inside finally without try-catch");
            exc();
            System.out.println("After exception");
        }
    }

    private static void exc()
    {
        throw new RuntimeException("for instance this unhandled exception");
    }
}
