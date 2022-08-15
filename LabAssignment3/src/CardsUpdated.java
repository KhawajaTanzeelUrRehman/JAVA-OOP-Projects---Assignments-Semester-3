public class CardsUpdated {// Making the main class of the program.
    public static void main(String[] args){// Making the main function of the program. 
        String [] suit = { "Clubs", "Diamonds", "Hearts", "Spades"};// Making an array of the type of the cards.
        String [] rank ={"2", "3", "4", "5", "6", "7", "8", "9", "10"//Making an array of the power(rank) of the card.
                         , "Jack", "Queen", "King", "Ace"};
        for(int i = 0; i < suit.length; i++)
            for(int j = 0; j < rank.length; j++)// Using nested loop to print all the cards.
                System.out.printf("%s of %s\n", rank[j],suit[i]);// printing the cards
    }
}
