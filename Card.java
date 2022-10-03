/**
*The Card class refers to playing cards, such as Solitaire, Hearts, and Poker.
*Fields include suit, value, suitName, and rank.
*The suit can be spades, hearts, diamonds, or clubs.
*The integer data field has the highest value of 13, and the lowest of 1.
*Some of the values are modified to ranks, such as Ace for "1", Jack for "11", Queen for "12", and King for "13" 
*
*@author Cherry Dominguez
*@version 2.0
*@since 2022-02-22
*/

public class Card
{
   /**
   * Instance variables
   */
   private int suit;
   private int value;
   private String suitName;
   private String rank;
   final int LOWEST_VALUE = 1;
   final int HIGHEST_VALUE = 13;
   final int HIGHEST_SUIT = 4;
     
   /**
   * Default Constructor 
   */
   public Card () 
   {
      setSuit (1);
      setValue (1);
   }
   
    /**
   * Constructor with suits & values
   * @param suits
   * @param values
   */
   public Card (int suits, int values)
   {
      setSuit (suits);
      setValue (values);
   }
         
   /**
   * The getter for the card suit
   * @return the suit
   */
   public int getSuit ()
   {
      return suit;
   }
   
   /**
   * The getter for the card value
   * @return the value
   */  
   public int getValue ()
   {
      return value;
   }
   
   /**
   * The getter for the card suitName
   * @return the suitName
   */
   public String getSuitName ()
   {
      return suitName;
   }
   
   /**
   * The getter for the card rank
   * @return the rank
   */
   public String getRank ()
   {
      return rank;
   }
   
   /**
   * The setter for the card suit
   * @param suits The suit to set
   */
   public void setSuit (int suits)
   {
      if (suits >= LOWEST_VALUE && suits <= HIGHEST_SUIT)
         suit = suits;
      else
         suit = LOWEST_VALUE;
 
      switch (suit)
      {
         case 1: suitName = "Spades"; break;         
         case 2: suitName = "Hearts"; break;
         case 3: suitName = "Diamonds"; break;
         case 4: suitName = "Clubs"; break;  
      }   
   }
   
   /**
   * The setter for the card value
   * @param values The value to set
   */
   public void setValue (int values)
   {
      if (values >= LOWEST_VALUE && values <= HIGHEST_VALUE)
         value = values;
      else
         value = LOWEST_VALUE;
       
      switch (value)
      {
         case 1: rank = "Ace"; break;         
         case 11: rank = "Jack"; break;
         case 12: rank = "Queen"; break;
         case 13: rank = "King"; break;
         default: rank = Integer.toString (value); break;   
      }
   }  
}

