package service;

import entitty.Point;

import java.util.ArrayList;

public class PointUtil {
    public static boolean checkIfPointsOnSameLine(Point point1, Point point2, Point point3, Point point4) {
        ArrayList<Double> cordinatArray = new ArrayList<>();
        cordinatArray.add(point1.getX());
        cordinatArray.add(point2.getX());
        cordinatArray.add(point3.getX());
        cordinatArray.add(point4.getX());
        ArrayList<Double> cordinatArray2 = new ArrayList<>();
        cordinatArray2.add(point1.getY());
        cordinatArray2.add(point2.getY());
        cordinatArray2.add(point3.getY());
        cordinatArray2.add(point4.getY());
        ArrayList<Double> checkIf = new ArrayList<>();
        ArrayList<Double> checkIf2 = new ArrayList<>();
        boolean x = false;
        boolean y = false;
        for (int i = 1; i < cordinatArray.size(); i++) {
            if (cordinatArray.get(i).compareTo(cordinatArray.get(i - 1)) == 0) {
                checkIf.add(cordinatArray.get(i));
                checkIf.add(cordinatArray.get(i - 1));
            }
        }
        if (checkIf.size() > 2 && (checkIf.get(1).compareTo(checkIf.get(0)) == 0 && checkIf.get(1).compareTo(checkIf.get(3)) == 0)) {
            x = true;
        }
        for (int i = 1; i < cordinatArray2.size(); i++) {
            if (cordinatArray2.get(i).compareTo(cordinatArray2.get(i - 1)) == 0) {
                checkIf2.add(cordinatArray2.get(i));
                checkIf2.add(cordinatArray2.get(i - 1));
            }
        }
        if (checkIf2.size() > 2 && (checkIf2.get(1).compareTo(checkIf2.get(0)) == 0 && checkIf2.get(1).compareTo(checkIf2.get(3)) == 0)) {
            y = true;
        }
        if (x || y) {
            return false;
        } else {

            return true;
        }
    }
}
