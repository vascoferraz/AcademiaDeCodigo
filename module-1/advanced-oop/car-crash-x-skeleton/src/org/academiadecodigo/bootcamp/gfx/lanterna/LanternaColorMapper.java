package org.academiadecodigo.bootcamp.gfx.lanterna;

import com.googlecode.lanterna.terminal.Terminal;
import org.academiadecodigo.bootcamp.grid.GridColor;

import java.util.EnumMap;
import java.util.Map;


/**
 * Utility class to map Grid colors to Lanterna terminal colors
 */
public class LanternaColorMapper {

    private static final Terminal.Color colors[] = {
            Terminal.Color.RED,
            Terminal.Color.GREEN,
            Terminal.Color.BLUE,
            Terminal.Color.MAGENTA,
            Terminal.Color.BLACK
    };

    public static Terminal.Color getColor(GridColor color) {

        Terminal.Color terminalColor = null;

        switch (color) {
            case RED:
                terminalColor = colors[0];
                break;
            case GREEN:
                terminalColor = colors[1];
                break;
            case BLUE:
                terminalColor = colors[2];
                break;
            case MAGENTA:
                terminalColor = colors[3];
                break;
            case NOCOLOR:
                terminalColor = colors[4];
                break;
            default:
                System.out.println("something went very wrong...");
        }

        return terminalColor;
    }
}
