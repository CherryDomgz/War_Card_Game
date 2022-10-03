/**
* The War2 class is a modified War class application
* When a tie is declared, each player "puts down 10 cards each" and compares the 11th card to see if there is a clear winner
*
*@author Cherry Dominguez
*@version 1.0
*@since 2022-02-21
*/

public class War2
{   
   //Set up 2 Card Classes
   public Card computerPlayer;
   public Card humanPlayer;
   
   /**
   * Constructor for War2
   * Constructor instantiated and accessed
   */
   public War2 () 
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
      
      //Set the data back to the War2 object
      computerPlayer = computerCard;
      humanPlayer = humanCard; 
   }// end of War2 Constructor
   
   
   /**
   * warBegins method
   * Output the War2 data to the console.
   */
   public void warBegins ()
   {
      int cards;
      int computerSuit = 1;
      final int WAR_CARDS = 11;
      final int HIGHEST_VALUE = 13;
      final int LOWEST_VALUE = 1;
      final int HIGHEST_SUIT = 4;
           
      System.out.println ("COMPUTER PLAYER: " + computerPlayer.getRank() + 
                        " of " + computerPlayer.getSuitName());
      System.out.println ("HUMAN PLAYER: " + humanPlayer.getRank() +  
                        " of " + humanPlayer.getSuitName());
                        
      if (computerPlayer.getValue() == humanPlayer.getValue())
            System.out.println ("RESULT: Tie" + "\n\n" + "WAR IS CALLED!!!");
      else 
         if (computerPlayer.getValue() < humanPlayer.getValue())
            System.out.println ("RESULT: Human Player Wins");
         else                 
            System.out.println ("RESULT: Computer Player Wins");
            
            //War is called when a tie is declared
            while (computerPlayer.getValue() == humanPlayer.getValue())
            {
               //Displays 10 cards each player in random
               for (cards = 1; cards < WAR_CARDS; ++cards)
               {
                  //randomly pick the value of the rank of each card.
                  computerPlayer.setValue ((int)(Math.random() * 100) % HIGHEST_VALUE + LOWEST_VALUE);
                  humanPlayer.setValue ((int)(Math.random() * 100) % HIGHEST_VALUE + LOWEST_VALUE);
            
                  //randomly pick the suit of each card.
                  computerPlayer.setSuit ((int)(Math.random() * 100) % HIGHEST_SUIT + LOWEST_VALUE);
                  humanPlayer.setSuit ((int)(Math.random() * 100) % HIGHEST_SUIT + LOWEST_VALUE);
      
                  //To make sure that two cards dealt are not the same
                  if (computerPlayer == humanPlayer)
                  {
                     computerSuit = computerSuit + 1;
                     if (computerSuit > 4)
                        computerSuit = LOWEST_VALUE;   
                  }

                  System.out.println ("Computer player card is " + computerPlayer.getRank() + 
                        " of " + computerPlayer.getSuitName() + 
                        ". Human player card is " + humanPlayer.getRank() +  
                        " of " + humanPlayer.getSuitName() + ". The result is discarded."); 
               }//end of for loop
               
               //Displays the 11th card and decides who wins
               System.out.println ("\n" + "COMPUTER PLAYER: " + computerPlayer.getRank() + 
                        " of " + computerPlayer.getSuitName());
               System.out.println ("HUMAN PLAYER: " + humanPlayer.getRank() +  
                        " of " + humanPlayer.getSuitName());
                                   
               if (computerPlayer.getValue() == humanPlayer.getValue())
                  System.out.println ("RESULT: Tie" + "\n\n" + "WAR IS CALLED!!!");
               else 
                  if (computerPlayer.getValue() < humanPlayer.getValue())
                     System.out.println ("RESULT: Human Player Wins");
                  else                 
                     System.out.println ("RESULT: Computer Player Wins");
            }//end of while loop                
    }//end of warBegins method


   /**
   * Main method
   * @param args the command line arguments
   */
   public static void main (String [] args)
   {
      War2 playerCards = new War2();
      playerCards.warBegins(); 
   }//end of main method
       
}//end of class War2
