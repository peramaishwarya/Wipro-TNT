public class Card implements Comparable<Card> {

    private char symbol;
    private int number;
    public Card(char symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }
    public char getSymbol() {
        return symbol;
    }
    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(Card c) {
        return Character.compare(this.symbol, c.symbol);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Card))
            return false;
        Card c = (Card) obj;
        return symbol == c.symbol;
    }

    @Override
    public int hashCode() {
        return Character.hashCode(symbol);
    }
}