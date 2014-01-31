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
    private double fvc = 0; // function of v_c
    private double vNew = 0; // value of smallest random vector function
    private double x1_OfDesiredFunctionValue = 0; // first point of desired vector
    private double x2_OfDesiredFunctionValue = 0; // second point of desired vector
    private double x3_OfDesiredFunctionValue = 0; // third point of desired vector
    private double x1_OfRandomVertex = 0.0; // first point of random vector
    private double x2_OfRandomVertex = 0.0; // second point of random vector
    private double x3_OfRandomVertex = 0.0; // third point of random vectors
    private double DESIRED_FUNCTION_VALUE = 0.0; // function (v_c) - desired value to reach by vectors
    private double numToCompare1 = 0;
    private double numToCompare2 = 0;

    /* Hill Climber Algorithm
     * Take a vector, then generate N random vectors and apply the function
     * (x1^2 + x2^2 + x3^2) to each to find the true mininum function random
     * vector closest to the Desired Function Value.
     */
    public void climber()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Number of Random Vectors");
        N = keyboard.nextInt();

        //test to check for keyboard input
        System.out.println("Number of random vectors is " + N + "\n");

        System.out.println("Enter 3 points (between -10 & 15) to create a Desired Vector.\n" +
          "Hit enter after every point");
        x1_OfDesiredFunctionValue = keyboard.nextDouble();
        x2_OfDesiredFunctionValue = keyboard.nextDouble();
        x3_OfDesiredFunctionValue = keyboard.nextDouble();
        DESIRED_FUNCTION_VALUE = ( x1_OfDesiredFunctionValue ) * ( x1_OfDesiredFunctionValue ) +
          ( x2_OfDesiredFunctionValue ) * ( x2_OfDesiredFunctionValue ) +
          ( x3_OfDesiredFunctionValue ) * ( x3_OfDesiredFunctionValue );
        //System.out.format ("Desired Function Value = %.2f%n%n", DESIRED_FUNCTION_VALUE);


        // loop to process random vector functions
        int i = 0;
        while ( i < N )
        {
            //random number generator between -10 and 15
            x1_OfRandomVertex = -10 + ( Math.random() * ( ( 15 - ( -10 ) ) + 1 ) );
            //println to test output
            System.out.println("The random x1 is " + x1_OfRandomVertex);

            x2_OfRandomVertex = -10 + ( Math.random() * ( ( 15 - ( -10 ) ) + 1 ) );
            //println to test output
            System.out.println("The random x2 is " + x2_OfRandomVertex);

            x3_OfRandomVertex = -10 + ( Math.random() * ( ( 15 - ( -10 ) ) + 1 ) );
            //println to test output
            System.out.println("The random x3 is " + x3_OfRandomVertex);


            fvc = ( ( x1_OfRandomVertex ) * ( x1_OfRandomVertex ) ) +
              ( ( x2_OfRandomVertex ) * ( x2_OfRandomVertex ) ) + ( ( x3_OfRandomVertex ) *
              ( x3_OfRandomVertex ) );
            System.out.format("#%d Vector Value = %.2f%n%n", i + 1, fvc);

            /*
            if (DESIRED_FUNCTION_VALUE == fvc){
                vNew = fvc;
            }
            else{
                vNew =
            }
            * */
            i++;

        }
        System.out.format("Desired Function Value = %.2f%n%n", DESIRED_FUNCTION_VALUE);

    }
}
