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
private int MAX = 0;
private int N = 0;
private double x1 = 0.0;
private double x2 = 0.0;
private double x3 = 0.0;
private double fvc = 0.0;



    public void climber()
    {
       Scanner keyboard = new Scanner(System.in);
       System.out.println ("Enter Number of Times to Process ");
       MAX = keyboard.nextInt();

       //test to check for keyboard input
       System.out.println( "MAX is " + MAX );

       //random number generator between -10 and 15
       x1 = -10 + (Math.random() * ((15 - (-10)) + 1));
       System.out.println("The random x1 is " + x1);

       x2 = -10 + (Math.random() * ((15 - (-10)) + 1));
       System.out.println("The random x2 is " + x2);

       x3 = -10 + (Math.random() * ((15 - (-10)) + 1));
       System.out.println("The random x3 is " + x3);

       fvc = ((x1)*(x1)) + ((x2)*(x2)) + ((x3)*(x3));
       System.out.format ("f(vc) = %.2f%n", fvc);
    }

    }

