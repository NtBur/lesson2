package com.shpp.p2p.cs.nburianovata.assignment2;

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/**
 * White rectangle superimposed on four black circles
 */

public class Assignment2Part2 extends WindowProgram {

    public static final int APPLICATION_WIDTH = 300;
    public static final int APPLICATION_HEIGHT = 300;
    public static final int RADIUS_BALL = 50;
    public static final int DIAMETER_BALL = RADIUS_BALL*2;

    public void run() {

        drawCircle(0, 0);//northwest corner
        drawCircle(0, getHeight() - DIAMETER_BALL);//northeast corner
        drawCircle(getWidth() - DIAMETER_BALL, 0);//southwest corner
        drawCircle(getWidth() - DIAMETER_BALL, getHeight() - DIAMETER_BALL);//southeast corner
        drawSquare(getWidth(), getHeight());//center
    }

    /**
     * draws a black circle
     *
     * @ param x, y - position of the circle
     */
    private void drawCircle(double x, double y) {
        GOval o = new GOval(x, y, DIAMETER_BALL, DIAMETER_BALL);
        o.setFilled(true);
        o.setFillColor(Color.BLACK);
        add(o);
    }

    /**
     * draws a black square
     *
     * @ param x, y - position of the square
     */
    private void drawSquare(double x, double y) {
        GRect r = new GRect(
                RADIUS_BALL,
                RADIUS_BALL,
                x - DIAMETER_BALL,
                y - DIAMETER_BALL);
        r.setColor(Color.WHITE);
        r.setFilled(true);
        r.setFillColor(Color.WHITE);
        add(r);
    }
}
