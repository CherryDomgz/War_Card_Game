/**
* The War class is an application that randomly deals two cards - one for the computer and one for the human player - and determines the higher card.
* It displays a message indicating whether the cards are equal, computer won, or the player won.
* Methods include displayCards and main. 
* A random number was generated for each card's suit and value.
*
*@author Cherry Dominguez
*@version 1.0
*@since 2022-02-21
*/

public class War
{   
   //Set up 2 Card Classes
   public Card computerPlayer;
   public Card humanPlayer;
   
   /**
   * Constructor for War
   * Constructor instantiated and accessed
   */
   public War () 
   { 
      int computerValue, computerSuit;
      int humanValue, humanSuit;
      final int HIGHEST_VALUE = 13;
      final int LOWEST_VALUE = 1;
      final int HIGHEST_SUIT = 4;

      Card computerCard = new Card ();
      Card humanCard = new Card ();
      
      //randomly pick the value of the rank of each card.
      computerValue = ((int)(Math.random() * 100) % HIGHEST_VALUE + LOWEST_VALUE);
      humanValue = ((int)(Math.random() * 100) % HIGHEST_VALUE + LOWEST_VALUE);
      
      computerCard.setValue (computerValue);
      humanCard.setValue (humanValue);
      
      //randomly pick the suit of each card.
      computerSuit = ((int)(Math.random() * 100) % HIGHEST_SUIT + LOWEST_VALUE);
      humanSuit = ((int)(Math.random() * 100) % HIGHEST_SUIT + LOWEST_VALUE);
            
      //To make sure that two cards dealt are not the same
      if (computerValue == humanValue && computerSuit == humanSuit)
      {
         computerSuit = computerSuit + 1;
         if (computerSuit > 4)
            computerSuit = LOWEST_VALUE;   
      }
      
      computerCard.setSuit (computerSuit);
      humanCard.setSuit (humanSuit);
      
      //Set the data back to the War object
      computerPlayer = computerCard;
      humanPlayer = humanCard;      
   }// end of War Constructor
   
   
   /**
   * displayCards method
   * Output the War data to the console.
   */
   public void displayCards ()
   {
      System.out.println ("COMPUTER PLAYER: " + computerPlayer.getRank() + 
                        " of " + computerPlayer.getSuitName());
      System.out.println ("HUMAN PLAYER: " + humanPlayer.getRank() +  
                        " of " + humanPlayer.getSuitName());
                        
      if (computerPlayer.getValue() == humanPlayer.getValue())                 
         System.out.println ("RESULT: Tie");
      else 
         if (computerPlayer.getValue() > humanPlayer.getValue())
            System.out.println ("RESULT: Computer Player Wins");
         else 
            System.out.println ("RESULT: Human Player Wins");                              
    }//end of displayCard method


   /**
   * Main method
   * @param args the command line arguments
   */
   public static void main (String [] args)
   {
      War playerCards = new War();
      playerCards.displayCards(); 
   }//end of main method
       
}//end of class War
