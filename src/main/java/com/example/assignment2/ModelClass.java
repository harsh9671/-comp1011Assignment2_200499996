package com.example.assignment2;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ModelClass {
   String userWord;

   public ModelClass(String userWord){
      this.userWord = userWord;
   }

   public String isWordValid(String userWord){

      if(userWord.length()<2){
         return String.format("Word is less than 2 letters.");
      }
      if(userWord.length()>8){
         return String.format("Word is too long (more than 8 characters).");
      }
      else if (!userWord.contains("A") && !userWord.contains("E") && !userWord.contains("I")
              && !userWord.contains("O") && !userWord.contains("U") && !userWord.contains("Y")) {
              return    String.format("Word does not include vowel.");
      }
     else if(HelloController.newWordDisplay.contains(userWord)){
        return String.format("Duplicate words.");
     }


     return "";
   }


}
