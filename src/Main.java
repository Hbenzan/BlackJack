import java.awt.*;

public class Main {
    public Card [] deck; //declare array of cards
    public static void main(String[] args) {
        new Main();
    }

    public Main (){
        System.out.println("game starting!");


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

    }

    public void printDeck(){
        for (int i= 0; i<= 51; i++) {
            deck[i].printCard();
        }
    }
}
