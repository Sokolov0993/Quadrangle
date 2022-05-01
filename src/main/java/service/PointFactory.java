package service;

import entitty.Point;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PointFactory {
    File file = new File("C:\\Users\\Pavel\\Desktop\\stream.txt");

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public ArrayList<Double> getArrayOfDoubles(File file) throws FileNotFoundException {
        this.file = file;
        Scanner scanner = new Scanner(file);
        ArrayList<Double> pointArray = new ArrayList<>();
        while (scanner.hasNextDouble()) {
            pointArray.add(scanner.nextDouble());
        }
        return pointArray;
    }
    public ArrayList<Point> getArrayOfPoints(File file) throws FileNotFoundException {
        this.file = file;
        ArrayList<Double> myArray = getArrayOfDoubles(file);
        ArrayList<Point> pointArraylist = new ArrayList<>();
        for (int o = 0; o < getArrayOfDoubles(file).size(); o += 2) {
            pointArraylist.add(new Point(myArray.get(o), myArray.get(o + 1)));

        }
        return pointArraylist;
    }

    public static void main(String[] args) throws FileNotFoundException {
        PointFactory pointFactory = new PointFactory();
        System.out.println(pointFactory.getArrayOfDoubles(new File("C:\\Users\\Pavel\\Desktop\\stream.txt")));
        System.out.println(pointFactory.getArrayOfDoubles(new File("C:\\Users\\Pavel\\Desktop\\stream.txt")));
    }
}
