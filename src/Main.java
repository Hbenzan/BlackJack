import java.awt.*;

public class Main {
    public Card [] deck; //declare array of cards
    public Player player1; //declare a player
    public Player [] players;
    // future me needs to make an array of players called players
    public static void main(String[] args) {
        new Main();
    }

    public Main (){
        System.out.println("game starting!");

        //construct deck
        deck = new Card[52];
        // fill deck with cards
        int counter = 0;
        for (int s = 1; s<= 4; s++) {
            for (int i = 1; i <= 13; i++){
                Card c = new Card (i,s);
                deck[counter] = c;
                counter ++;
            }
        }

        shuffle();
        printDeck();
        //construct player1
        player1 = new Player();
        players = new Player[4];
        // future me needs to construct players array with 4 players
        for (int p = 0; p < 4; p++){
            players[p]= new Player();
        }
        deal();
    }


    public void shuffle (){
        //swap deck [0] with a random index deck card
        for (int x = 0; x< 52;x=x+1) {
            System.out.println(deck[0]);
            Card temp = deck[x];
            int r = (int) (Math.random() * 52);
            deck[x] = deck[r];
            deck[1] = temp;
        }
        //eventually, loop through all deck

        // swapping each card into a random index
    }
    public void deal(){
        int counter = 0;
        for (int z = 0; z < players.length; z=z+1) {
            for (int r = 0; r < player1.hand.length; r = r +1) {
                players[z].hand[r] = deck[counter];
                counter++;
            }
        }
        //edit this method to deal 2 cards to each player in the players array
        //make sure not to deal the same card twice

        //for loop that deals 2 cards to player1
   for (int i = 0; i < player1.hand.length; i++) {
       player1.hand[i] = deck[i];
   }
//print hand for each player in the players array
    player1.printHand();
    }

    public void printDeck(){
        for (int i= 0; i < deck.length; i++) {
            deck[i].printCard();
        }
    }
}
