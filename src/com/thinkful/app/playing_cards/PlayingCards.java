package com.thinkful.app.playing_cards;

public class PlayingCards {
    private Suite suite;
    private Number number;

  PlayingCards(Suite suite, Number number) {
    this.suite = suite;
    this.number = number;
  }

  public Suite getSuite() {
    return suite;
  }

  public void setSuite(Suite suite) {
    this.suite = suite;
  }

  public Number getNumber() {
    return number;
  }

  public void setNumber(Number number) {
    this.number = number;
  }

  public enum Suite {
    HEARTS,
    SPADES,
    CLUBS,
    DIAMONDS
  }

  public enum Number {
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING,
    ACE
  }
}