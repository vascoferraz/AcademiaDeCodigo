package org.academiadecodigo.asynctomatics.mapeditor;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class KeyboardListener implements KeyboardHandler {


    MapEditor mapEditor;

    public void setup(MapEditor mapEditor) {

        this.mapEditor = mapEditor;

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

        // Event of pressing the S
        KeyboardEvent sPressed = new KeyboardEvent();
        sPressed.setKey(KeyboardEvent.KEY_S);
        sPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(sPressed);

        // Event of releasing the S
        KeyboardEvent sReleased = new KeyboardEvent();
        sReleased.setKey(KeyboardEvent.KEY_S);
        sReleased.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboard.addEventListener(sReleased);

        // Event of pressing the L
        KeyboardEvent lPressed = new KeyboardEvent();
        lPressed.setKey(KeyboardEvent.KEY_L);
        lPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(lPressed);

        // Event of releasing the L
        KeyboardEvent lReleased = new KeyboardEvent();
        lReleased.setKey(KeyboardEvent.KEY_L);
        lReleased.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboard.addEventListener(lReleased);

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

    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_UP)    { System.out.println("UP KEY    : Pressed"); }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_DOWN)  { System.out.println("DOWN KEY  : Pressed"); }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT) { System.out.println("RIGHT KEY : Pressed"); }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT)  { System.out.println("LEFT KEY  : Pressed"); }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_SPACE) { System.out.println("SPACE KEY : Pressed"); }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_C)     { System.out.println("C KEY     : Pressed"); }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_S)     { System.out.println("S KEY     : Pressed"); }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_L)     { System.out.println("L KEY     : Pressed"); }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_Q)     { System.out.println("Q KEY     : Pressed"); }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_UP)    { mapEditor.moveUP();    System.out.println("UP KEY    : Released"); }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_DOWN)  { mapEditor.moveDown();  System.out.println("DOWN KEY  : Released"); }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT) { mapEditor.moveRight(); System.out.println("RIGHT KEY : Released"); }
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT)  { mapEditor.moveLeft();  System.out.println("LEFT KEY  : Released"); }

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_SPACE) {
            System.out.println(mapEditor.returnX() + " | " + mapEditor.returnY());
            mapEditor.paintCells(mapEditor.returnX(), mapEditor.returnY());
            System.out.println("SPACE KEY : Released");
        }

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_C) { mapEditor.deleteAll(); System.out.println("C  : Released"); }

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_S) { mapEditor.save(); System.out.println("S  : Released"); }

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_L) { mapEditor.load(); System.out.println("L  : Released"); }

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_Q) { System.exit(0); }


    }
}


