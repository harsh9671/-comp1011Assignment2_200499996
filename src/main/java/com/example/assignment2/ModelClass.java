package com.example.assignment2;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ModelClass {
   String userWord;

   HashMap<Character, Integer> letterCounts = new HashMap<Character, Integer>();



   public ModelClass(String userWord){
      this.userWord = userWord;
   }


   public void TotalLetters() {
      // Initializing the letter counts to their default values

      letterCounts.put('A', 9);
      letterCounts.put('B', 2);
      letterCounts.put('C', 2);
      letterCounts.put('D', 4);
      letterCounts.put('E', 12);
      letterCounts.put('F', 2);
      letterCounts.put('G', 3);
      letterCounts.put('H', 2);
      letterCounts.put('I', 8);
      letterCounts.put('J', 1);
      letterCounts.put('K', 1);
      letterCounts.put('L', 4);
      letterCounts.put('M', 2);
      letterCounts.put('N', 6);
      letterCounts.put('O', 8);
      letterCounts.put('P', 2);
      letterCounts.put('Q', 1);
      letterCounts.put('R', 6);
      letterCounts.put('S', 4);
      letterCounts.put('T', 6);
      letterCounts.put('U', 4);
      letterCounts.put('V', 2);
      letterCounts.put('W', 2);
      letterCounts.put('X', 1);
      letterCounts.put('Y', 2);
      letterCounts.put('Z', 1);




   }



}
