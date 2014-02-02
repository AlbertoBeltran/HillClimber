package hillclimber;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Alberto Beltran
 */
public class RandomVectorGenerator
{
    private int N = 0; // number of vectors
    private double fvc = 0; // function of v_c
    private double vNew = 0; // smallest value of vector
    private double xOfRandomVector = 0.0; // first point of random vector
    private double yOfRandomVector = 0.0; // second point of random vector
    private double zOfRandomVector = 0.0; // third point of random vectors

    public void randomVector()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Number of Random Vectors to create");
        N = keyboard.nextInt();

        //test to check for keyboard input
        System.out.println("Number of random vectors is " + N + "\n");
        // loop to process random vector functions
        double[] array;
        array = new double[N];

        for ( int t = 0; t < N; t++ )
        {
            //random number generator between -10 and 15
            xOfRandomVector = -10 + ( Math.random() * ( ( 15 - ( -10 ) ) ) );
            //println to test output
            System.out.println("The random x is " + xOfRandomVector);

            yOfRandomVector = -10 + ( Math.random() * ( ( 15 - ( -10 ) ) ) );
            //println to test output
            System.out.println("The random y is " + yOfRandomVector);

            zOfRandomVector = -10 + ( Math.random() * ( ( 15 - ( -10 ) ) ) );
            //println to test output
            System.out.println("The random z is " + zOfRandomVector);

            fvc = ( ( xOfRandomVector ) * ( xOfRandomVector ) ) +
              ( ( yOfRandomVector ) * ( yOfRandomVector ) ) + ( ( zOfRandomVector ) *
              ( zOfRandomVector ) );
            System.out.format("#%d Vector Value = %.2f%n%n", t + 1, fvc);

            array[t] = fvc;

        }
        System.out.println(Arrays.toString(array));
        double min = array[0];
        for ( int j = 1; j < array.length; j++ )
        {
            if ( array[j] < min )
            {
                min = array[j];
            }
        }
        if ( vNew < min )
        {
            vNew = min;
        }

        System.out.println("Min is " + min);
        System.out.println("vNew is " + vNew);

    }
}
