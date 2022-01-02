package com.shpp.p2p.cs.nburianovata.assignment2;

import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/**
 * Draws a caterpillar consisting of green circles
 */
public class Assignment2Part6 extends WindowProgram {

    public static final int APPLICATION_WIDTH = 600;
    public static final int APPLICATION_HEIGHT = 300;
    private static final int DIAMETER_CIRCLE = 100;
    private static final int COUNT_CIRCLES = 10;
    private static final int POSITION_FIRST_CIRCLE_X = 20;
    private static final int POSITION_FIRST_CIRCLE_Y = 100;

    public void run() {

        /** first circle */
        GOval c = createOval(POSITION_FIRST_CIRCLE_X, POSITION_FIRST_CIRCLE_Y);
        add(c);

        for (int i = 0; i < (COUNT_CIRCLES - 1); i++) {
            int step = DIAMETER_CIRCLE / 2;
            if (i % 2 == 0) {
                /** circle get up */
                c = createOval(c.getX() + step, c.getY() - step);
                add(c);
            } else {
                /** circle get down*/
                c = createOval(c.getX() + step, c.getY() + step);
                add(c);
            }
        }
    }

    /**
     * Create a colored oval with positions x, y
     */
    private GOval createOval(double x, double y) {
        GOval res = new GOval(x, y, DIAMETER_CIRCLE, DIAMETER_CIRCLE);
        setColorOval(res, Color.RED);
        fillOval(res, Color.GREEN);
        return res;
    }

    /**
     * Internal color of the oval
     */
    private void fillOval(GOval res, Color color) {
        res.setFillColor(color);
        res.setFilled(true);
    }

    /**
     * Color of the oval shell
     */
    private void setColorOval(GOval res, Color color) {
        res.setColor(color);
    }
}
