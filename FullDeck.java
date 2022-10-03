/**
* The FullDeck class is an application that create an array of 52 Card objects.
* It assign a different value to each Card and display it.
*
*@author Cherry Dominguez
*@version 1.0
*@since 2022-03-14
*/

public class FullDeck 
{

   int value, suit;
   int deckCards;
   final int LOWEST_VALUE = 1;
   final int NUMBER_OF_CARDS = 52;
   private Card [] cardArray;
   
   /**
   * Constructor for FullDeck
   * Array initialized and declared
   */
   public FullDeck () 
   {
   
      cardArray = new Card [NUMBER_OF_CARDS];
      
   }//end of FullDeck () constructor
   
   /**
   * getCardArray() is the getter method for Card()
   * @return the cardArray
   */
   public Card [] getCardArray() 
   {
      return cardArray;
   }

   /**
   * setCardArray() is the setter method for Card()
   * @param cardArray the cardArray to set
   */
   public void setCardArray(Card [] cardArray) 
   {
      this.cardArray = cardArray;
   }
   
   /**
   * displayCards () method
   * Output the FullDeck to the console
   */
   public void displayCards ()  
   {
   
      value = 1;
      suit = 1;
      
      //loop that executes 52 times and assign a different value to each Card
      for (deckCards = 0; deckCards < NUMBER_OF_CARDS; ++deckCards) {
      
         //allocate memory for each array element
         cardArray [deckCards] = new Card ();     
         cardArray [deckCards].setValue (value);
         cardArray [deckCards].setSuit (suit);
                     
         //display
         System.out.println (cardArray [deckCards].getRank() + " of " + cardArray [deckCards].getSuitName());
         
         //after output, card value increase by 1
         ++value;
         
         //to move to the next suit/suitName after displaying all value/ranks
         if (value > cardArray [deckCards].HIGHEST_VALUE) 
         {
            ++suit;
            value = LOWEST_VALUE;
         }  
      }     
   }//end of displayCards () method
   
   /**
   * Main method
   * @param args the command line arguments
   */
   public static void main (String [] args) 
   {
      FullDeck playerCards = new FullDeck();
      playerCards.displayCards(); 
      
   }//end of main method

         
}//end of FullDeck Class