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
public class HillClimberAlgorithm
{
    private int MAX = 0; // number of times to process
    //private int N = 0; // number of vectors
    //private double fvc = 0; // function of v_c
    private double vNew = 0; // value of smallest random vector function
    //private double xOfDesiredFunctionValue = 0; // first point of desired vector
    //private double yOfDesiredFunctionValue = 0; // second point of desired vector
    //private double zOfDesiredFunctionValue = 0; // third point of desired vector
    //private double xOfRandomVertex = 0.0; // first point of random vector
    //private double yOfRandomVertex = 0.0; // second point of random vector
    //private double zOfRandomVertex = 0.0; // third point of random vectors
    //private double DESIRED_FUNCTION_VALUE = 0.0; // function (v_c) - desired value to reach by vectors
    private double numToCompare1 = 0;
    private double numToCompare2 = 0;

    /* Hill Climber Algorithm
     * Take a vector, then generate N random vectors and apply the function
     * (x1^2 + x2^2 + x3^2) to each to find the true mininum function random
     * vector closest to the Desired Function Value.
     */
    public void climber()
    {
        //Scanner keyboard = new Scanner (System.in);

       /*
        System.out.println("Enter Number of Random Vectors");
        N = keyboard.nextInt();

        //test to check for keyboard input
        System.out.println("Number of random vectors is " + N + "\n");
        */

        DesiredVector aDesiredVector = new DesiredVector();
        aDesiredVector.desiredVector();

        /*
        System.out.println("Enter 3 points (between -10 & 15) to create a Desired Vector.\n" +
          "Hit enter after every point");
        xOfDesiredFunctionValue = keyboard.nextDouble();
        yOfDesiredFunctionValue = keyboard.nextDouble();
        zOfDesiredFunctionValue = keyboard.nextDouble();
        DESIRED_FUNCTION_VALUE = ( xOfDesiredFunctionValue ) * ( xOfDesiredFunctionValue ) +
          ( yOfDesiredFunctionValue ) * ( yOfDesiredFunctionValue ) +
          ( zOfDesiredFunctionValue ) * ( zOfDesiredFunctionValue );
        //System.out.format ("Desired Function Value = %.2f%n%n", DESIRED_FUNCTION_VALUE);
        */

        // calls the randomeVortex() method to generate random Vortex
        RandomVectorGenerator aRandomGenerator = new RandomVectorGenerator();
        aRandomGenerator.randomVector();

        /*
        // loop to process random vector functions
        int t = 0;
        while ( t < N )
        {
            //random number generator between -10 and 15
            xOfRandomVertex = -10 + ( Math.random() * ( ( 15 - ( -10 ) ) + 1 ) );
            //println to test output
            System.out.println("The random x1 is " + xOfRandomVertex);

            yOfRandomVertex = -10 + ( Math.random() * ( ( 15 - ( -10 ) ) + 1 ) );
            //println to test output
            System.out.println("The random x2 is " + yOfRandomVertex);

            zOfRandomVertex = -10 + ( Math.random() * ( ( 15 - ( -10 ) ) + 1 ) );
            //println to test output
            System.out.println("The random x3 is " + zOfRandomVertex);


            fvc = ( ( xOfRandomVertex ) * ( xOfRandomVertex ) ) +
              ( ( yOfRandomVertex ) * ( yOfRandomVertex ) ) + ( ( zOfRandomVertex ) *
              ( zOfRandomVertex ) );
            System.out.format("#%d Vector Value = %.2f%n%n", t + 1, fvc);

            /*
            if (DESIRED_FUNCTION_VALUE == fvc){
                vNew = fvc;
            }
            else{
                vNew =
            }

            t++;

        }*/
        System.out.format("Desired Function Value = %.2f%n%n",
          aDesiredVector.getDesiredFunctionValue());

    }
}
