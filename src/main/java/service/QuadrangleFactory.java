package service;

import entitty.Point;
import entitty.Quadrangle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class QuadrangleFactory {




    public Quadrangle generateQuadrangle(Point point1, Point point2, Point point3, Point point4) throws FileNotFoundException {

        return new Quadrangle(point1, point2, point3, point4);
    }


    public static void main(String[] args) throws FileNotFoundException {
        PointUtil pointUtil = new PointUtil();
        QuadrangleFactory quadrangleFactory = new QuadrangleFactory();
        QuadrangleService quadrangleService = new QuadrangleService();
        PointFactory pointFactory = new PointFactory();
        ArrayList<Point> points = pointFactory.getArrayOfPoints(new File("C:\\Users\\Pavel\\Desktop\\stream.txt"));
        System.out.println(quadrangleService.checkIfQadrangleIsSqare( quadrangleFactory.generateQuadrangle(points.get(0), points.get(1), points.get(2), points.get(3))));
        System.out.println(quadrangleService.calculateQadrangleSquare(quadrangleFactory.generateQuadrangle(points.get(0), points.get(1), points.get(2), points.get(3))));
        System.out.println(quadrangleService.calculateQadranglePerimeter(quadrangleFactory.generateQuadrangle(points.get(0), points.get(1), points.get(2), points.get(3))));

        System.out.println();
    }
}