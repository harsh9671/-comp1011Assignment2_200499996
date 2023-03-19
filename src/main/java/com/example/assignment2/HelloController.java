package com.example.assignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.HashMap;

public class HelloController {

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

   public void onClick(ActionEvent actionEvent) {

   }
   private HashMap<Character, Integer> letterCounts; // Map of letter -> count

   @FXML
   public void onSubmit (ActionEvent event) {
      String userWord = userInput.getText();


   }
   public void LetterBag() {
      // Initialize the letter counts to their default values
      letterCounts = new HashMap<Character, Integer>();
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