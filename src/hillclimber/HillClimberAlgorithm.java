package hillclimber;

import java.util.Scanner;

/**
 * HCI312A Hill Climber Lab01 Java Portion
 * @author Alberto Beltran
 */
public class HillClimberAlgorithm
{
    /**
     * The number of cycles to generate random vectors.
     */
    public int MAX = 0; // the number of cycles
    /**
     * The number of random vectors to generate.
     */
    private int N = 0; // the number of vectors
    /** Hill Climber Algorithm
     * Take a vector, then generate N random vectors and apply the function
     * (x1^2 + x2^2 + x3^2) to each to find the true mininum function random
     * vector closest to the Desired Function Value.
     */
    public void climber()
    {
        Scanner keyboard = new Scanner(System.in);

        //calls the desiredVector() method to create a desired vector.
        DesiredVector aDesiredVector = new DesiredVector();
        aDesiredVector.desiredVector();

        System.out.println("Enter the number of times to cycle through. ");
        MAX = keyboard.nextInt();
        System.out.println("Enter Number of Random Vectors to create");
        N = keyboard.nextInt();

        // calls the randomVector() method to generate random Vectors
        for ( int k = 0; k < MAX; k++ )
        {
            RandomVectorGenerator aRandomGenerator = new RandomVectorGenerator();
            aRandomGenerator.randomVector(N);
        }

        System.out.format("    f(v_c) 'Desired Function Value' = %.2f%n%n",
          aDesiredVector.getDesiredFunctionValue());

    }

}
