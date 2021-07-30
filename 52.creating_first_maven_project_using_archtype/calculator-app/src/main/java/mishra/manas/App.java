package mishra.manas;

import org.apache.commons.lang3.math.NumberUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Addition addition = new Addition();
        System.out.println( "1 + 1 = " + addition.add(1, 1) );
        double n = NumberUtils.toDouble("12321");
        System.out.println(n);
    }

}
