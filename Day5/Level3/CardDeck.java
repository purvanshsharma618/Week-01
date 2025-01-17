import java.util.Random;
import java.util.Scanner;

public class CardDeck {

    // Suits and ranks of the cards
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {
        "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"
    };

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        int numOfCards = SUITS.length * RANKS.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[index++] = rank + " of " + suit; // Create card representation
            }
        }
        return deck; // Return the initialized deck
    }

    // Method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + random.nextInt(deck.length - i); // Generate random index
            // Swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck; // Return the shuffled deck
    }

    // Method to distribute the deck of n cards to x number of players
    public static String[][] distributeCards(String[] deck, int numPlayers, int cardsPerPlayer) {
        if (numPlayers * cardsPerPlayer > deck.length) {
            throw new IllegalArgumentException("Not enough cards to distribute.");
        }

        String[][] players = new String[numPlayers][cardsPerPlayer];
        int index = 0;

        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[index++]; // Assign cards to players
            }
        }
        return players; // Return the players and their cards
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (String card : players[i]) {
                System.out.print(card + ", ");
            }
            System.out.println(); // New line after each player
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the deck
        String[] deck = initializeDeck();

        // Shuffle the deck
        deck = shuffleDeck(deck);

        // Get number of players and cards per player from user
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        System.out.print("Enter the number of cards per player: ");
        int cardsPerPlayer = scanner.nextInt();

        // Distribute the cards
        String[][] players = distributeCards(deck, numPlayers, cardsPerPlayer);

        // Print the players and their cards
        printPlayersCards(players);

        // Close the scanner
        scanner.close();
    }
}