package entitty;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Point {

    private double x;
    private double y;


    public double getX() {


        return x;
    }


    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public void setX(double x) {
        this.x = x;
    }

    public Point() {
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}




