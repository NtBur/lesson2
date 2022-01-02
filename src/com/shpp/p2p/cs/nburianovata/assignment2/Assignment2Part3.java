package com.shpp.p2p.cs.nburianovata.assignment2;

import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/**
 * The program creates a cat's paw prints
 */

public class Assignment2Part3 extends WindowProgram {
    /* Constants controlling the relative positions of the
     * three toes to the upper-left corner of the pawprint.
     *
     * (Yes, I know that actual pawprints have four toes.
     * Just pretend it's a cartoon animal. ^_^)
     */
    private static final double FIRST_TOE_OFFSET_X = 0;
    private static final double FIRST_TOE_OFFSET_Y = 20;
    private static final double SECOND_TOE_OFFSET_X = 30;
    private static final double SECOND_TOE_OFFSET_Y = 0;
    private static final double THIRD_TOE_OFFSET_X = 60;
    private static final double THIRD_TOE_OFFSET_Y = 20;

    /* The position of the heel relative to the upper-left
     * corner of the pawprint.
     */
    private static final double HEEL_OFFSET_X = 20;
    private static final double HEEL_OFFSET_Y = 40;

    /* Each toe is an oval with this width and height. */
    private static final double TOE_WIDTH = 20;
    private static final double TOE_HEIGHT = 30;

    /* The heel is an oval with this width and height. */
    private static final double HEEL_WIDTH = 40;
    private static final double HEEL_HEIGHT = 60;

    /* The default width and height of the window. These constants will tell Java to
     * create a window whose size is *approximately* given by these dimensions. You should
     * not directly use these constants in your program; instead, use getWidth() and
     * getHeight(), which return the *exact* width and height of the window.
     */
    public static final int APPLICATION_WIDTH = 270;
    public static final int APPLICATION_HEIGHT = 220;

    public void run() {
        drawPawprint(20, 20);
        drawPawprint(180, 70);
    }

    /**
     * Draws a pawprint. The parameters should specify the upper-left corner of the
     * bounding box containing that pawprint.
     *
     * @param x The x coordinate of the upper-left corner of the bounding box for the pawprint.
     * @param y The y coordinate of the upper-left corner of the bounding box for the pawprint.
     */
    private void drawPawprint(double x, double y) {
        /** Create bounding box */
        GRect r = new GRect(x, y, getWidth(), getHeight());

        /** Create three toes */
        drawPartHeel(r.getX() + FIRST_TOE_OFFSET_X, r.getY() + FIRST_TOE_OFFSET_Y, TOE_WIDTH, TOE_HEIGHT);
        drawPartHeel(r.getX() + SECOND_TOE_OFFSET_X, r.getY() + SECOND_TOE_OFFSET_Y, TOE_WIDTH, TOE_HEIGHT);
        drawPartHeel(r.getX() + THIRD_TOE_OFFSET_X, r.getY() + THIRD_TOE_OFFSET_Y, TOE_WIDTH, TOE_HEIGHT);

        /** Create heel */
        drawPartHeel(r.getX() + HEEL_OFFSET_X, r.getY() + HEEL_OFFSET_Y, HEEL_WIDTH, HEEL_HEIGHT);

    }

    /**
     * Create part of the heel
     */
    private void drawPartHeel(double xPart, double yPart, double widthPart, double heightPart) {
        GOval o = new GOval(xPart, yPart, widthPart, heightPart);
        fillColorOval(o, Color.BLACK);
        add(o);
    }

    /**
     * Fills the part with color
     */
    private void fillColorOval(GOval o, Color color) {
        o.setFillColor(color);
        o.setFilled(true);
        o.setColor(color);
    }

}
