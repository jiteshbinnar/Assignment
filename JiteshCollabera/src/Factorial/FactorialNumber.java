package Factorial;

public class FactorialNumber
{
        public static long factorial( int num )
        {
            if( num <= 1 )
                return 1;
            else
                return num * factorial( num - 1 );
        }
        public static void main( String [ ] args )
        {
            for( int i = 1; i <= 10; i++ )
                System.out.println( factorial( i ) );
        }
    }

