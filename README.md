# War_Card_Game
Java Game Zone: War Card Game

INSTRUCTIONS:

WAR 

Using two card objects play a very simple version of the card game War. Deal two cards – one for the computer and one for the player – and determine the higher card, 
then display a message indicating whether the cards are equal, the computer won, or the player won. (Playing cards are considered equal when they have the same value, 
no matter what the suit is). For this game, assume the Ace (value 1) is low. Make sure that the two cards dealt are not the same card. 
For example, a deck cannot contain more than one card representing the 2 of spades. If two cards are chosen to have the same value, change the suit for one of them.

![image](https://user-images.githubusercontent.com/105072341/193649382-c7f05185-578c-407a-88d2-1c69b4d46e41.png)

WAR 2

Now modify the game using the newly modified card class so that when a tie is declared, that each player “puts down 10 cards each” and compares the 11th card to see 
if there is a clear winner. If there is a tie, repeat the process until there is a clear winner. The table below shows four typical executions. 
Recall that in this version of War, you assume that the ace is the lowest-valued card.

![image](https://user-images.githubusercontent.com/105072341/193649716-db099b84-cda3-496d-a8da-cf328845088d.png)

WAR 3

Now create a game that plays 26 rounds of War, dealing a full deck with no repeated cards. 

Some hints:

> Use the FullDeck class.
> Select a random number for the deck position of the player’s first card and 
assign the card at that array position to the player.
> Move every higher-positioned card in the deck “down” one to fill in the gap. In 
other words, if the player’s first random number is 49, select the card at 
position 49, move the card that was in position 50 to position 49, and move the 
card that was in position 51 to position 50. Only 51 cards remain in the deck 
after the player’s first card is dealt, so the available-card array is smaller by 
one.
> In the same way, randomly select a card for the computer and “remove” the
card from the deck.
> Display the values of the player’s and computer’s cards, compare their values, 
and determine the winner.
> When all the cards in the deck are exhausted, display a count of the number of
times the player wins, the number of times the computer wins, and the number 
of ties


