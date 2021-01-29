package org.academiadecodigo.carcrash.field;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.ScreenCharacterStyle;
import com.googlecode.lanterna.screen.ScreenWriter;
import com.googlecode.lanterna.terminal.Terminal;
import org.academiadecodigo.carcrash.cars.Car;

public final class Field {

    private static int width;
    private static int height;

    // Used to write to screen
    private static Screen screen;

    // Screen wrapper that preserves default options
    private static ScreenWriter screenWriter;

    //This class is not supposed to be instantiated
    private Field() {
    }

    /**
     * Initializes the Screen
     * @param width screen width
     * @param height screen height
     */
    public static void init(int width, int height) {

        // Create the GUI
        screen = TerminalFacade.createScreen();

        // Set field size
        Field.width = width;
        Field.height = height;
        screen.setCursorPosition(null);
        screen.getTerminal().getTerminalSize().setColumns(width);
        screen.getTerminal().getTerminalSize().setRows(height);

        // Default screen writing options
        screenWriter = new ScreenWriter(screen);
        screenWriter.setBackgroundColor(Terminal.Color.BLUE);
        screenWriter.setForegroundColor(Terminal.Color.WHITE);

        screen.startScreen();

    }

    /**
     * Displays a group of cars in the screen
     * @param cars an array of cars
     */
    public static void draw(Car[] cars) {

        screen.clear();

        for (Car c : cars) {

            if (!c.isCrashed()) {
                screenWriter.drawString(c.getPos().getCol(), c.getPos().getRow(), c.toString());
            } else {
                screen.putString(c.getPos().getCol(), c.getPos().getRow(), c.toString(), Terminal.Color.WHITE, Terminal.Color.RED, ScreenCharacterStyle.Blinking);
            }

        }

        screen.refresh();

    }

    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }
}
