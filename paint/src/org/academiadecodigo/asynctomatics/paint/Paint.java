package org.academiadecodigo.asynctomatics.paint;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.util.Arrays;

public class Paint {

   private Rectangle canvas;
   private Rectangle cells;
   private Rectangle[][] matrix;
   private boolean[][] isFilled;

   private int canvasWidth;
   private int canvasHeight;
   private int x;
   private int y;
   private static final int CELLSIZE = 10;

   private FileSave fileSave;


   public Paint() {

      canvasWidth = 200;
      canvasHeight = 200;
      x=10;
      y=10;

      KeyboardListener keyboard = new KeyboardListener();
      keyboard.setup(this);

      canvas = new Rectangle(10, 10, canvasWidth, canvasHeight);
      canvas.draw();
      drawCellsBorders();


      cells = new Rectangle(10,10,10,10);
      cells.setColor(Color.RED);
      cells.draw();

      fileSave = new FileSave();

      matrix = new Rectangle[20][20];
      isFilled = new boolean[20][20];
      initMatrix();


   }




   public void drawCellsBorders() {

      for (int i = 1 ; i < 20 ; i++) {

         for (int j = 1 ; j < 20 ; j++) {

            Rectangle cell = new Rectangle(i * 10, j * 10, 20, 20);
            cell.draw();
         }
      }
   }

   public void initMatrix() {

      for (int i = 0 ; i < 20 ; i++) {

         for (int j = 0 ; j < 20 ; j++) {

            matrix[i][j] = new Rectangle();
            matrix[i][j].setColor(Color.RED);
            isFilled[i][j] = false;
            //System.out.println(matrix[i][j]);
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
         matrix[x - 1][y - 1] = new Rectangle(x * CELLSIZE, y * CELLSIZE, 10, 10);
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

      for (int i = 0 ; i < 20 ; i++) {

         for (int j = 0 ; j < 20 ; j++) {

           matrix[i][j].delete();
           isFilled[i][j] = false;
            System.out.println(matrix[i][j]);
         }
      }
   }


   public int returnX() { return x/CELLSIZE; }

   public int returnY() {
      return y/CELLSIZE;
   }

   public boolean[][] save() {

      System.out.println("save");
      fileSave.fileSave(Arrays.toString(isFilled));

      return isFilled;
   }






}




