package com.thinkful.app.playing_cards;

import java.util.ArrayList;
import java.util.Comparator;

public class Deck {

  private ArrayList<PlayingCards> deck;

  private Comparator<PlayingCards> bySuite = (PlayingCards a, PlayingCards b) -> a.getSuite()
      .compareTo(b.getSuite());
  private Comparator<PlayingCards> byValue = (PlayingCards a, PlayingCards b) -> a.getNumber()
      .compareTo(b.getNumber());

  public void sortByNumber() {
    this.deck.sort(byValue);
  }

  public void sortBySuite() {
    this.deck.sort(bySuite);
  }

  public ArrayList<PlayingCards> getDeck() {
    return deck;
  }

  public void setDeck(ArrayList<PlayingCards> deck) {
    this.deck = deck;
  }


}