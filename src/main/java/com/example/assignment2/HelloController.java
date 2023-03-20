package com.example.assignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HelloController {
   String newWordDisplay = "";

   ArrayList<String> newAddedWordList = new ArrayList<String>();
   @FXML
   TextField userInput;
   @FXML
   TextArea storeWords;
   @FXML
   Text errorMsg;
   @FXML
   Label point;
   @FXML
   Button A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, submit;
   @FXML
   Text counterA,counterB,counterC,counterD,counterE,counterF,counterG,counterH,counterI,counterJ,counterK,counterL,
           counterM,counterN,counterO,counterP,counterQ,counterR,counterS,counterT,counterU,counterV,counterW,counterX,counterY,
           counterZ;

   @FXML
   public void bA (ActionEvent event) {
      userInput.setText(userInput.getText() + "A");
   }
   @FXML
   public void bB (ActionEvent event) {
      userInput.setText(userInput.getText() + "B");
   }
   @FXML
   public void bC (ActionEvent event) {
      userInput.setText(userInput.getText() + "C");
   }
   @FXML
   public void bD (ActionEvent event) {
      userInput.setText(userInput.getText() + "D");
   }
   @FXML
   public void bE (ActionEvent event) {
      userInput.setText(userInput.getText() + "E");
   }
   @FXML
   public void bF (ActionEvent event) {
      userInput.setText(userInput.getText() + "F");
   }
   @FXML
   public void bG (ActionEvent event) {
      userInput.setText(userInput.getText() + "G");
   }
   @FXML
   public void bH (ActionEvent event) {
      userInput.setText(userInput.getText() + "H");
   }
   @FXML
   public void bI (ActionEvent event) {
      userInput.setText(userInput.getText() + "I");
   }
   @FXML
   public void bJ (ActionEvent event) {
      userInput.setText(userInput.getText() + "J");
   }
   @FXML
   public void bK (ActionEvent event) {
      userInput.setText(userInput.getText() + "K");
   }
   @FXML
   public void bL (ActionEvent event) {
      userInput.setText(userInput.getText() + "L");
   }
   @FXML
   public void bM (ActionEvent event) {
      userInput.setText(userInput.getText() + "M");
   }
   @FXML
   public void bN (ActionEvent event) {
      userInput.setText(userInput.getText() + "N");
   }
   @FXML
   public void bO (ActionEvent event) {
      userInput.setText(userInput.getText() + "O");
   }
   @FXML
   public void bP (ActionEvent event) {
      userInput.setText(userInput.getText() + "P");
   }
   @FXML
   public void bQ (ActionEvent event) {
      userInput.setText(userInput.getText() + "Q");
   }
   @FXML
   public void bR (ActionEvent event) {
      userInput.setText(userInput.getText() + "R");
   }
   @FXML
   public void bS (ActionEvent event) {
      userInput.setText(userInput.getText() + "S");
   }
   @FXML
   public void bT (ActionEvent event) {
      userInput.setText(userInput.getText() + "T");
   }
   @FXML
   public void bU (ActionEvent event) {
      userInput.setText(userInput.getText() + "U");
   }
   @FXML
   public void bV (ActionEvent event) {
      userInput.setText(userInput.getText() + "V");
   }
   @FXML
   public void bW (ActionEvent event) {
      userInput.setText(userInput.getText() + "W");
   }
   @FXML
   public void bX (ActionEvent event) {
      userInput.setText(userInput.getText() + "X");
   }
   @FXML
   public void bY (ActionEvent event) {
      userInput.setText(userInput.getText() + "Y");
   }
   @FXML
   public void bZ (ActionEvent event) {
      userInput.setText(userInput.getText() + "Z");
   }


   @FXML
   public void onClick (ActionEvent event) {
      String userWord = userInput.getText().toUpperCase();
      StoredWord(userWord);
      userInput.setText("");
      ModelClass modelClass = new ModelClass(userWord);
      int pointValue = calculatePoint(userWord);
      point.setText(String.valueOf(pointValue));
   }

   public void StoredWord(String word){
      if (newAddedWordList.size() == 0) {
         newWordDisplay = word;
      }
      // if previous words list has at least one word,
      // previous world + ", " + new word
      else {
         newWordDisplay = newWordDisplay + ", " + userInput.getText().toUpperCase();
      }

      newAddedWordList.add(userInput.getText().toUpperCase());

      // display all words
       storeWords.setText(newWordDisplay);


   }
   private int calculatePoint(String word) {
      Map<Character, Integer> pointOfLetter = new HashMap<Character, Integer>();
      pointOfLetter.put('A', 1);
      pointOfLetter.put('B', 3);
      pointOfLetter.put('C', 3);
      pointOfLetter.put('D', 2);
      pointOfLetter.put('E', 1);
      pointOfLetter.put('F', 4);
      pointOfLetter.put('G', 2);
      pointOfLetter.put('H', 4);
      pointOfLetter.put('I', 1);
      pointOfLetter.put('J', 8);
      pointOfLetter.put('K', 5);
      pointOfLetter.put('L', 1);
      pointOfLetter.put('M', 3);
      pointOfLetter.put('N', 1);
      pointOfLetter.put('O', 1);
      pointOfLetter.put('P', 3);
      pointOfLetter.put('Q', 10);
      pointOfLetter.put('R', 1);
      pointOfLetter.put('S', 1);
      pointOfLetter.put('T', 1);
      pointOfLetter.put('U', 1);
      pointOfLetter.put('V', 4);
      pointOfLetter.put('W', 4);
      pointOfLetter.put('X', 8);
      pointOfLetter.put('Y', 4);
      pointOfLetter.put('Z', 10);
      int pointValue = 0;
      for (int i = 0; i < word.length(); i++) {
         char letter = word.charAt(i);
         pointValue += pointOfLetter.get(letter);
      }
      return pointValue;
   }



}