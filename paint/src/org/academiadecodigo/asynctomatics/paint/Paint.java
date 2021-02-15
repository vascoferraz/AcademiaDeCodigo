package org.academiadecodigo.asynctomatics.paint;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Paint {

   private Rectangle canvas;
   private Rectangle cells;
   private Rectangle[][] matrix;
   private boolean[][] isFilled;

   private int x=10;
   private int y=10;
   private static final int PADDING = 10;


   public Paint() {
      KeyboardListener keyboard = new KeyboardListener();
      keyboard.setup(this);

      canvas = new Rectangle(10, 10, 200, 200);
      canvas.draw();
      drawCellsBorders();


      cells = new Rectangle(10,10,10,10);
      cells.setColor(Color.RED);
      cells.draw();

      matrix = new Rectangle[20][20];
      isFilled = new boolean[20][20];
   }

   public void drawCellsBorders() {

      for (int i = 1 ; i < 20 ; i++) {

         for (int j = 1 ; j < 20 ; j++) {

            Rectangle cell = new Rectangle(i * 10, j * 10, 20, 20);
            cell.draw();
         }
      }
   }


   public void moveUP() {

      if (cells.getY() == 10) {
         cells.translate(0, 0);
         System.out.println("X: " + x);
         System.out.println("Y: " + y);
      }

      else {
         cells.translate(0, -10);
         x = cells.getX();
         y = cells.getY();
         System.out.println("X: " + x);
         System.out.println("Y: " + y);

      }
   }

   public void moveDown() {

      if (cells.getY() == 200) {
         cells.translate(0, 0);
         System.out.println("X: " + x);
         System.out.println("Y: " + y);
      }

      else {
         cells.translate(0, +10);
         x = cells.getX();
         y = cells.getY();
         System.out.println("X: " + x);
         System.out.println("Y: " + y);
      }
   }

   public void moveLeft() {

      if (cells.getX() == 10) {
         cells.translate(0, 0);
         System.out.println("X: " + x);
         System.out.println("Y: " + y);
      }

      else {
         cells.translate(-10, 0);
         x = cells.getX();
         y = cells.getY();
         System.out.println("X: " + x);
         System.out.println("Y: " + y);
      }
   }

   public void moveRight() {

      if (cells.getX() == 200) {
         cells.translate(0, 0);
         System.out.println("X: " + x);
         System.out.println("Y: " + y);
      }

      else {
         cells.translate(10, 0);
         x = cells.getX();
         y = cells.getY();
         System.out.println("X: " + x);
         System.out.println("Y: " + y);
      }
   }


   public void paintCells(int x, int y) {

      if (isFilled[x-1][y-1] == false) {
         matrix[x - 1][y - 1] = new Rectangle(x * PADDING, y * PADDING, 10, 10);
         matrix[x - 1][y - 1].setColor(Color.RED);
         matrix[x - 1][y - 1].draw();
         matrix[x - 1][y - 1].setColor(Color.GREEN);
         matrix[x - 1][y - 1].fill();
         isFilled[x - 1][y - 1] = true;
         System.out.println(cells.getX());
         System.out.println(cells.getY());
      }
      else {
         matrix[x - 1][y - 1].delete();
         isFilled[x - 1][y - 1] = false;
         System.out.println(cells.getX());
         System.out.println(cells.getY());
      }
   }

   public void deleteAll(){

      for (int i = 1 ; i < 20 ; i++) {

         for (int j = 1 ; j < 20 ; j++) {

            matrix[i - 1][j - 1] = new Rectangle();
            matrix[i - 1][j - 1].setColor(Color.BLUE);
            matrix[i - 1][j - 1].draw();
            isFilled[i - 1][j - 1] = false;
         }
      }
   }



   public int returnX() {
      return x/PADDING;
   }

   public int returnY() {
      return y/PADDING;
   }





}




