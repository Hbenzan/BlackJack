public class Player {
   public int points;
   public Card[] hand;
   public Player(){
  hand = new Card[2];
   }

   public void printHand () {
       for (int x = 0; x < hand.length; x++) {
           hand[x].printCard();
       }
       // new method that prints info for each card in the hand
       // should work for all cards in the hand no matter how many
   }

} //end of main class
