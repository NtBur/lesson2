package com.shpp.p2p.cs.nburianovata.assignment2;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.graphics.GRectangle;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;


/**
 * Draws a block of black squares with white spaces
 */

public class Assignment2Part5 extends WindowProgram {
    public static final int APPLICATION_WIDTH = 600;
    public static final int APPLICATION_HEIGHT = 600;


    /* The number of rows and columns in the grid, respectively. */
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 6;

    /* The width and height of each box. */
    private static final double BOX_SIZE = 40;

    /* The horizontal and vertical spacing between the boxes. */
    private static final double BOX_SPACING = 10;

    public void run() {

        /** Grid in the center of the window */

        createGrid(getWidth() / 2 - (NUM_COLS * (BOX_SIZE + BOX_SPACING)) / 2,
                getHeight() / 2 - (NUM_ROWS * (BOX_SIZE + BOX_SPACING)) / 2);

    }


    /**
     * Create black cells of a grid with intervals
     */

    private void createGrid(double x, double y) {

        /** Create a grid  */
        GRect r = new GRect(x, y, getWidth(), getHeight());

        /** Create  cells */
        for (int i = 0; i < NUM_COLS; i++) {
            for (int j = 0; j < NUM_ROWS; j++) {
                GRect res = new GRect(
                        r.getX() + (i * (BOX_SIZE + BOX_SPACING)),
                        r.getY() + (j * (BOX_SIZE + BOX_SPACING)),
                        BOX_SIZE,
                        BOX_SIZE);

                fillRect(res, Color.BLACK);

                add(res);
            }
        }
    }

    /**
     * Fills color of the cell
     */
    private void fillRect(GRect r, Color color) {
        r.setFillColor(color);
        r.setFilled(true);
        r.setFillColor(color);
    }
}
