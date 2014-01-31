/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hillclimber;
import java.util.Scanner;


/**
 *
 * @author Win7Turbo
 */
public class HClimberAlgo
{
private int MAX = 0; // number of times to process
private int N = 0; // number of verteces
private double x1OfDesiredVertex = 0.0; // first point of random vector
private double x2OfDesiredVertex = 0.0; // second point of random vector
private double x3OfDesiredVertex = 0.0; // third point of random vectors
private double DESIRED_FUNCTION_VALUE = 0.0; // function (v_c) - desired value to reach by vectors


    /* Hill Climber Algorithm
     * Take a vector, then generate random vectors and apply the function
     * (x1^2 + x2^2 + x3^2) to a find the true mininum vector.
     */
    public void climber()
    {
       Scanner keyboard = new Scanner(System.in);
       System.out.println ("Enter Number of Times to Process ");
       MAX = keyboard.nextInt();

       //test to check for keyboard input
       System.out.println( "MAX is " + MAX );
       int i = 0;
       while ( i < MAX)
       {

            //random number generator between -10 and 15
            x1OfDesiredVertex = -10 + (Math.random() * ((15 - (-10)) + 1));
            //println to test output
            System.out.println("The random x1 is " + x1OfDesiredVertex);

            x2OfDesiredVertex = -10 + (Math.random() * ((15 - (-10)) + 1));
            //println to test output
            System.out.println("The random x2 is " + x2OfDesiredVertex);

            x3OfDesiredVertex = -10 + (Math.random() * ((15 - (-10)) + 1));
            //println to test output
            System.out.println("The random x3 is " + x3OfDesiredVertex);


            DESIRED_FUNCTION_VALUE = ((x1OfDesiredVertex)*(x1OfDesiredVertex)) +
            ((x2OfDesiredVertex)*(x2OfDesiredVertex)) + ((x3OfDesiredVertex)*(x3OfDesiredVertex));
            System.out.format ("%d Vector Value = %.2f%n%n", i+1 , DESIRED_FUNCTION_VALUE);

            i++;
       }
    }

    }

