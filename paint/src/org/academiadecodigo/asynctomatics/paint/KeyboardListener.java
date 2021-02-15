package org.academiadecodigo.asynctomatics.paint;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class KeyboardListener implements KeyboardHandler {


    Paint paint;


    public void setup(Paint paint) {

        this.paint = paint;

        Keyboard keyboard = new Keyboard(this);

        // Event of pressing the UP arrow
        KeyboardEvent upArrowPressed = new KeyboardEvent();
        upArrowPressed.setKey(KeyboardEvent.KEY_UP);
        upArrowPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(upArrowPressed);

        // Event of releasing the UP arrow
        KeyboardEvent upArrowReleased = new KeyboardEvent();
        upArrowReleased.setKey(KeyboardEvent.KEY_UP);
        upArrowReleased.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboard.addEventListener(upArrowReleased);

        // Event of pressing the DOWN arrow
        KeyboardEvent downArrowPressed = new KeyboardEvent();
        downArrowPressed.setKey(KeyboardEvent.KEY_DOWN);
        downArrowPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(downArrowPressed);

        // Event of releasing the DOWN arrow
        KeyboardEvent downArrowReleased = new KeyboardEvent();
        downArrowReleased.setKey(KeyboardEvent.KEY_DOWN);
        downArrowReleased.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboard.addEventListener(downArrowReleased);

        // Event of pressing the LEFT arrow
        KeyboardEvent leftArrowPressed = new KeyboardEvent();
        leftArrowPressed.setKey(KeyboardEvent.KEY_LEFT);
        leftArrowPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(leftArrowPressed);

        // Event of releasing the LEFT arrow
        KeyboardEvent leftArrowReleased = new KeyboardEvent();
        leftArrowReleased.setKey(KeyboardEvent.KEY_LEFT);
        leftArrowReleased.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboard.addEventListener(leftArrowReleased);

        // Event of pressing the RIGHT arrow
        KeyboardEvent rightArrowPressed = new KeyboardEvent();
        rightArrowPressed.setKey(KeyboardEvent.KEY_RIGHT);
        rightArrowPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(rightArrowPressed);

        // Event of releasing the RIGHT arrow
        KeyboardEvent rightArrowReleased = new KeyboardEvent();
        rightArrowReleased.setKey(KeyboardEvent.KEY_RIGHT);
        rightArrowReleased.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboard.addEventListener(rightArrowReleased);

        // Event of pressing the SPACE
        KeyboardEvent spacePressed = new KeyboardEvent();
        spacePressed.setKey(KeyboardEvent.KEY_SPACE);
        spacePressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(spacePressed);

        // Event of releasing the SPACE
        KeyboardEvent spaceReleased = new KeyboardEvent();
        spaceReleased.setKey(KeyboardEvent.KEY_SPACE);
        spaceReleased.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboard.addEventListener(spaceReleased);

        // Event of pressing the Q
        KeyboardEvent qPressed = new KeyboardEvent();
        qPressed.setKey(KeyboardEvent.KEY_Q);
        qPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(qPressed);

        // Event of releasing the Q
        KeyboardEvent qReleased = new KeyboardEvent();
        qReleased.setKey(KeyboardEvent.KEY_Q);
        qReleased.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboard.addEventListener(qReleased);

        // Event of pressing the C
        KeyboardEvent cPressed = new KeyboardEvent();
        cPressed.setKey(KeyboardEvent.KEY_C);
        cPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(cPressed);

        // Event of releasing the C
        KeyboardEvent cReleased = new KeyboardEvent();
        cReleased.setKey(KeyboardEvent.KEY_C);
        cReleased.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboard.addEventListener(cReleased);


    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKey() == 38) { System.out.println("UP KEY    : Pressed"); }
        if (keyboardEvent.getKey() == 40) { System.out.println("DOWN KEY  : Pressed"); }
        if (keyboardEvent.getKey() == 39) { System.out.println("RIGHT KEY : Pressed"); }
        if (keyboardEvent.getKey() == 37) { System.out.println("LEFT KEY  : Pressed"); }
        if (keyboardEvent.getKey() == 32) { System.out.println("SPACE KEY : Pressed"); }
        if (keyboardEvent.getKey() == 81) { System.out.println("Q KEY     : Pressed"); }
        if (keyboardEvent.getKey() == 67) { System.out.println("C KEY     : Pressed"); }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKey() == 38) { paint.moveUP();    System.out.println("UP KEY    : Released"); }
        if (keyboardEvent.getKey() == 40) { paint.moveDown();  System.out.println("DOWN KEY  : Released"); }
        if (keyboardEvent.getKey() == 39) { paint.moveRight(); System.out.println("RIGHT KEY : Released"); }
        if (keyboardEvent.getKey() == 37) { paint.moveLeft();  System.out.println("LEFT KEY  : Released"); }

        if (keyboardEvent.getKey() == 32) {
            System.out.println(paint.returnX() + " | " + paint.returnY());
            paint.paintCells(paint.returnX(), paint.returnY());
            System.out.println("SPACE KEY : Released");
        }

        if (keyboardEvent.getKey() == 67) { paint.deleteAll(); System.out.println("C  : Released"); }


        if (keyboardEvent.getKey() == 81) { System.exit(0); }


    }
}


