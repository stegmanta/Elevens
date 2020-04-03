1. 3X3 set of cards to stack ontop of eachother, A way to tell you have no moves remaining, Knowing the cards that you have.

2.
a multidimensional array for the board
a method that adds remaining card to see if there are any moves left

3. Yes the code given is what I would have needed to complete the games algorithim except a few exceptions someone could use to break the game that aren't finished.


4. 

    a. The dealMyCards() method is called in the Elevens board constructor as well as when a newGame() is created.

    b. The anotherplayispoissible method should probably use the containsPairSum11 and containsJQK methods. As well as the replaceSelectedCards.

    c. The returned list would most likely include.
    j,6,2,a,4

    d.
    public static printCards(ElevensBoard board) { 
        List<Integer> cIndexes = board.cardIndexes(); 
        for( j = 0; j< cIndexes.getSize(); j++){
            p = cards.getCard();
            System.out.print("At index" + j "the card is" + p);
        }
    }

    e. The replace selected cards should so it knows the order in which to replace the cards in and where to put them.

 
 