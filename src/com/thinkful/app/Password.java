package com.thinkful.app;


public class Password {
    public static void main (String[] args) {
        int length = 0;
        System.out.println(pWord(length));
    }
    static char[] pWord(int len) {
        System.out.println("Generating password using random() : ");
        System.out.print("Your new password is : "); 
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
        String Small_chars = "abcdefghijklmnopqrstuvwxyz"; 
        String numbers = "0123456789"; 
        String symbols = "!@#$%^&*_=+-/.?<>)"; 
  
        String values = Capital_chars + Small_chars + 
                        numbers + symbols;

        Random rndm_method = new Random(); 

        char[] password = new char[len]; 

        for (int i = 0; i < len; i++) 
        { 
            password[i] = 
              values.charAt(rndm_method.nextInt(values.length())); 
  
        } 
        return password; 
    }

}