package entitty;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import service.PointUtil;
import service.QuadrangleService;

public class Quadrangle {
    private static final Logger loggerQuadrangle = LogManager.getLogger(Quadrangle.class);
    private int id;
    private double side1;
    private double side2;
    private double side3;
    private double side4;
    private double diagonal1;
    private double diagonal2;
    Point point1;
    Point point2;
    Point point3;
    Point point4;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSide1() {

        side1 = (Math.sqrt((point2.getX() - point1.getX()) * (point2.getX() - point1.getX()) + (point2.getY() - point1.getY()) * (point2.getY() - point1.getY())));
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        side2 = (Math.sqrt((point3.getX() - point2.getX()) * (point3.getX() - point2.getX()) + (point3.getY() - point2.getY()) * (point3.getY() - point2.getY())));

        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        side3 = (Math.sqrt((point4.getX() - point3.getX()) * (point4.getX() - point3.getX()) + (point4.getY() - point3.getY()) * (point4.getY() - point3.getY())));
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide4() {
        side4 = (Math.sqrt((point1.getX() - point4.getX()) * (point1.getX() - point4.getX()) + (point1.getY() - point4.getY()) * (point1.getY() - point4.getY())));
        return side4;
    }

    public void setSide4(double side4) {
        this.side4 = side4;
    }

    public double getDiagonal1() {
        diagonal1 = (Math.sqrt((point3.getX() - point1.getX()) * (point3.getX() - point1.getX()) + (point3.getY() - point1.getY()) * (point3.getY() - point1.getY())));
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {

        this.diagonal1 = diagonal1;
    }

    public double getDiagonal2() {
        diagonal2 =(Math.sqrt((point4.getX() - point2.getX()) * (point4.getX() - point2.getX()) + (point4.getY() - point2.getY()) * (point4.getY() - point2.getY())));
        return diagonal2;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public Point getPoint4() {
        return point4;
    }

    public void setPoint4(Point point4) {
        this.point4 = point4;
    }

    @Override
    public String toString() {
        return "Quadrangle{" +
                "id=" + id +
                ", side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", side4=" + side4 +
                ", diagonal1=" + diagonal1 +
                ", diagonal2=" + diagonal2 +
                ", point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                ", point4=" + point4 +
                '}';
    }

    public Quadrangle(Point point1, Point point2, Point point3, Point point4) {
        loggerQuadrangle.info("Создаем четырехугольник");
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
       if( PointUtil.checkIfPointsOnSameLine(point1, point2, point3, point4)){
           loggerQuadrangle.info("Четырехугольник создан");
       }
       else {
           loggerQuadrangle.error("Четырехугольник не создан! Неверные координаты");

       }
    }
}
