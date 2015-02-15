/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diving;

import java.util.Scanner;

/**
 *
 * @author neliloghmani
 */
public class Diving {

    /**
     * @param args the command line arguments
     */
    Scanner kbd = new Scanner(System.in);
    double[] scores = new double [7]; // declares array and tells how many integers
    double sum =  0;
    double difficulty;
        double finalscore;
        int index;
        
   //This method helps you find the sum of all scores
    private  double inputAllScores(double scores [])         
    {
       for(int i=0; scores.length >= i ; i++) //index must be greater or equal to 7
        {
            sum = scores[i] + sum; // score of the index + previous sum
        }

        return sum;
    }
    // This method allows you to input the scores for every judge
     private  double [] inputValidScore(double scores [])
     {
        
        System.out.println("Enter " + scores.length + " scores.");
         
         scores[0]  = kbd.nextDouble();
         scores[1]  = kbd.nextDouble();
         scores[2]  = kbd.nextDouble();      // allows you to enter the scores
         scores[3]  = kbd.nextDouble();
         scores[4]  = kbd.nextDouble();
         scores[5]  = kbd.nextDouble();
         scores[6]  = kbd.nextDouble();
         
        return scores;
         
         
     }
     
     //This method allows you to calcuate the score, including the difficulty
     private double calculateScore (double scores [], double finalscore)
     {
      finalscore = ((((sum/7) * difficulty));
        return finalscore;
     }
     
     //This method allows you to enter a degree of difficulty
     private  double inputValidDegreeOfDifficulty ()
     {
        System.out.println("Enter degree of difficulty");
        difficulty =  kbd.nextDouble();
        
        
        return difficulty;

     }
    // main method
  public static void main(String[] args) {
       
        
 
        System.out.println("The Final Score Is " + finalscore);

      
        
    }
    
}
