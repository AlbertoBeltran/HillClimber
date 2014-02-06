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
public class DesiredVector
{
    /**
     * first point of desired vector.
     */
    private double xOfDesiredFunctionValue = 0; // first point of desired vector
    /**
     * Second point of desired vector.
     */
    private double yOfDesiredFunctionValue = 0; // second point of desired vector
    /**
     * Third point of desired vector.
     */
    private double zOfDesiredFunctionValue = 0; // third point of desired vector
    /**
     * The function applied to the vector of the three values supplied by the user.
     */
    private double DESIRED_FUNCTION_VALUE = 0.0; // function (v_c) - desired value to reach by vectors

    /**
     * Takes xOfDesiredFunctionValue, yOfDesiredFunctionValue, and zOfDesiredFunctionValue
     * from a user and gives DESIRED_FUNCTION_VALUE.
     */
    public void desiredVector()
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter 3 points, an x, y, & z (between -10 & 15), " +
          "to create a Desired Vector.\n" +
          "Hit enter after every point");
        xOfDesiredFunctionValue = keyboard.nextDouble();
        yOfDesiredFunctionValue = keyboard.nextDouble();
        zOfDesiredFunctionValue = keyboard.nextDouble();
        DESIRED_FUNCTION_VALUE = ( xOfDesiredFunctionValue ) * ( xOfDesiredFunctionValue ) +
          ( yOfDesiredFunctionValue ) * ( yOfDesiredFunctionValue ) +
          ( zOfDesiredFunctionValue ) * ( zOfDesiredFunctionValue );
        //System.out.format ("Desired Function Value = %.2f%n%n", DESIRED_FUNCTION_VALUE);

    }
    /**
     * Gets desired function value.
     * @return DESIRED_FUNCTION_VALUE
     */
    public double getDesiredFunctionValue()
    {
        return DESIRED_FUNCTION_VALUE;
    }
}
