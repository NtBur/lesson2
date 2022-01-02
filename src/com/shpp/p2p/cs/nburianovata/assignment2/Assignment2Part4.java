package com.shpp.p2p.cs.nburianovata.assignment2;

import acm.graphics.GFillable;
import acm.graphics.GLabel;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/**
 * Creating the country's flag
 */

public class Assignment2Part4 extends WindowProgram {

    public static final int APPLICATION_WIDTH = 300;
    public static final int APPLICATION_HEIGHT = 300;
    public static final int WIDTH_SQUARE = 50;
    public static final int HEIGHT_SQUARE = 150;
    public static final String COUNTRY_FLAG = "Flag of Belgium";
    public static final String FRONT = "SansSerif-20";


    public void run() {

        /* for  center the flag */
        int x = getWidth() / 2 - WIDTH_SQUARE / 2;
        int y = getHeight() / 2 - HEIGHT_SQUARE / 2;


        add(createRect(Color.BLACK, x - WIDTH_SQUARE, y));
        add(createRect(Color.YELLOW, x, y));
        add(createRect(Color.RED, x + WIDTH_SQUARE, y));

        GLabel l = new GLabel(COUNTRY_FLAG);
        l.setFont(FRONT);

        /* lower right corner label */
        double x1 = (getWidth() - l.getWidth());
        double y1 = (getHeight() - l.getDescent());
        add(l, x1, y1);
    }

    /**
     * Create a colored square with positions x, y
     */
    private GRect createRect(Color color, int x, int y) {
        GRect res = new GRect(x, y, WIDTH_SQUARE, HEIGHT_SQUARE);
        fillGRect(res, color);
        return res;
    }

    /**
     * Internal color of the square
     */
    private void fillGRect(GRect res, Color color) {
        res.setFillColor(color);
        res.setFilled(true);
        res.setColor(color);
    }
}
