/** 
* The War3 class is an application that plays 26 rounds of War, dealing a full deck with no repeated cards.
* Random card is selected and "removed" from the deck for both human and computer players
* The values of both players' cards are displayed and compared
* Then, the winner is determined
* When all the cards in deck are exhausted, a count of the number of times each player wins or ties are displayed
* Methods include displayCards(), fullDeck(), and main ().
* Note: I am really lost on how to pass FullDeck class to War3 class and I kept getting error when I access it, hence I made the fullDeck() method. 
*
*@author Cherry Dominguez
*@version 1.0
*@since 2022-03-19
*/

public class War3
{       
         
   /**
   * displayCards () method
   * Constructor instantiated and accessed
   * Output the War3 data to the console.
   */
   public void displayCards ()
   {
      final int NUMBER_OF_CARDS = 52;
      final int ROUNDS_OF_WAR = NUMBER_OF_CARDS / 2;
      Card [] cardArray = new Card [NUMBER_OF_CARDS];
      Card computerCard = new Card ();
      Card humanCard = new Card ();
      fullDeck (cardArray, NUMBER_OF_CARDS);
      
      int deckPosition, removeCard;
      int computerCardNumber, humanCardNumber;
      int computerPlayerWins = 0, humanPlayerWins = 0, ties = 0;
      int availableCards = NUMBER_OF_CARDS; 

      //randomly select and assign a number for the deck position of each players' cards
      for (deckPosition = 0; deckPosition < ROUNDS_OF_WAR; ++deckPosition)
      {        
         computerCardNumber = ((int)(Math.random() * 100) % availableCards);   
         computerCard.setSuit (cardArray[computerCardNumber].getSuit());
         computerCard.setValue (cardArray[computerCardNumber].getValue());
         
         //"remove" computer player's card from the deck
         for (removeCard = computerCardNumber; removeCard < availableCards - 1; ++removeCard)
             cardArray [removeCard] =  cardArray [removeCard + 1];
            --availableCards;
         
    
         humanCardNumber = ((int)(Math.random() * 100) % availableCards);
         humanCard.setSuit (cardArray[humanCardNumber].getSuit());
         humanCard.setValue (cardArray[humanCardNumber].getValue());
                  
         //"remove" the human player's card from the deck
         for (removeCard = humanCardNumber; removeCard < availableCards - 1; ++removeCard)
            cardArray [removeCard] = cardArray [removeCard + 1];
            --availableCards;
                 
   
      System.out.println ("Computer player card is " + computerCard.getRank() + 
                        " of " + computerCard.getSuitName() + 
                        ". Human player card is " + humanCard.getRank() +  
                        " of " + humanCard.getSuitName());
                                                
      if (computerCard.getValue() == humanCard.getValue())  
         {               
            System.out.println ("  RESULT: Tie\n");
            ++ties;
         }
      else 
         if (computerCard.getValue() > humanCard.getValue())
         {
            System.out.println ("  RESULT: Computer Player Wins\n");
            ++computerPlayerWins;
         }
         else 
         {
            System.out.println ("  RESULT: Human Player Wins\n"); 
            ++humanPlayerWins;
         }
       }  
       System.out.println("TOTAL COUNT:");
       System.out.println("  COMPUTER PLAYER won: " + computerPlayerWins + " times");
       System.out.println("  HUMAN PLAYER won: " + humanPlayerWins + " times");
       System.out.println("  GAME TIED: " + ties + " times");                         
    }//end of displayCards () method

     
   /**
   * fullDeck () Method
   * create an array of 52 Card objects
   */  
   public void fullDeck (Card [] cardArray, int NUMBER_OF_CARDS)  
   {
       int value = 1, suit = 1;
      
      //loop that executes 52 times and assign a different value to each Card
      for (int deckCards = 0; deckCards < NUMBER_OF_CARDS; ++deckCards) {
      
         //allocate memory for each array element
         cardArray [deckCards] = new Card ();     
         cardArray [deckCards].setValue (value);
         cardArray [deckCards].setSuit (suit);
                              
         // card value increase by 1
         ++value;
         
         //to move to the next suit/suitName after displaying all value/ranks
         if (value > cardArray [deckCards].HIGHEST_VALUE) 
         {
            ++suit;
            value = 1;
         }  
      }     
   }//end of fullDeck () method    
        
   /**
   * Main method
   * @param args the command line arguments
   */
   public static void main (String [] args)
   {
      War3 playerCards = new War3 ();
      playerCards.displayCards(); 
   }//end of main method
   
}//end of class War3

