/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hillclimber;
/**
 *
 * @author Win7Turbo
 */
public class RandomVectorGenerator
{
    private int N = 0; // number of vectors
    private double fvc = 0; // function of v_c
    private double xOfRandomVertex = 0.0; // first point of random vector
    private double yOfRandomVertex = 0.0; // second point of random vector
    private double zOfRandomVertex = 0.0; // third point of random vectors

    public void randomVortex()
    {
    java.util.Scanner keyboard = new java.util.Scanner(java.lang.System.in);
        java.lang.System.out.println("Enter Number of Random Vectors to create");
        N = keyboard.nextInt();

        //test to check for keyboard input
        java.lang.System.out.println("Number of random vectors is " + N + "\n");
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
            * */
            t++;
        }

        }
}
