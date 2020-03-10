package com.thinkful.app.fraction;


public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction fraction) {
        this.numerator += fraction.getNumerator();
        this.denominator += fraction.getDenominator();
        return this;
    }
    public Fraction subtract(Fraction fraction) {
        this.numerator -= fraction.getNumerator();
        this.denominator -= fraction.getDenominator();
        return this;
    }

    public int getNumerator() {
        return numerator;
      }
    
      public void setNumerator(int numerator) {
        this.numerator = numerator;
      }
    
      public int getDenomator() {
        return denomator;
      }
    
      public void setDenomator(int denomator) {
        this.denomator = denomator;
      }


}