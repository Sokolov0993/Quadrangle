import entitty.Point;
import entitty.Quadrangle;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import service.PointFactory;
import service.PointUtil;
import service.QuadrangleFactory;
import service.QuadrangleService;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.testng.Assert.*;
import static service.PointUtil.checkIfPointsOnSameLine;

public class QuadrangleTest {
    private PointFactory pointFactory;
    private QuadrangleFactory quadrangleFactory;
    private QuadrangleService quadrangleService;

    @BeforeClass
    public  void setup(){
        pointFactory = new PointFactory();
        quadrangleFactory = new QuadrangleFactory();
        quadrangleService = new QuadrangleService();
    }
    @Test
    public void checkIfFigureQuadrandleTest() throws FileNotFoundException {
        ArrayList<Point> points = pointFactory.getArrayOfPoints(new File("C:\\Users\\Pavel\\Desktop\\stream.txt"));
        assertTrue(checkIfPointsOnSameLine(points.get(0), points.get(1), points.get(2), points.get(3)), "Проверка не пройдена!");
    }
    @Test
    public void checkIfQuadrangleSquareTest() throws FileNotFoundException {
        ArrayList<Point> points = pointFactory.getArrayOfPoints(new File("C:\\Users\\Pavel\\Desktop\\stream.txt"));
        assertTrue(quadrangleService.checkIfQadrangleIsSqare(quadrangleFactory.generateQuadrangle(points.get(0), points.get(1), points.get(2), points.get(3))), "Проверка не пройдена");
    }
    @Test
    public void checkIfQuadrangleRhombusTest() throws FileNotFoundException {
        ArrayList<Point> points = pointFactory.getArrayOfPoints(new File("C:\\Users\\Pavel\\Desktop\\stream.txt"));
        assertFalse(quadrangleService.checkIfQadrangleIsRhombus(quadrangleFactory.generateQuadrangle(points.get(0), points.get(1), points.get(2), points.get(3))), "Проверка не пройдена");
    }
    @Test
    public void calculatingPerimeterTest() throws FileNotFoundException {
        ArrayList<Point> points = pointFactory.getArrayOfPoints(new File("C:\\Users\\Pavel\\Desktop\\stream.txt"));
        assertEquals(quadrangleService.calculateQadranglePerimeter(quadrangleFactory.generateQuadrangle(points.get(0), points.get(1), points.get(2), points.get(3))),20, "Проверка не пройдена" );
    }
    @Test
    public void calculatingSquareTest() throws FileNotFoundException {
        ArrayList<Point> points = pointFactory.getArrayOfPoints(new File("C:\\Users\\Pavel\\Desktop\\stream.txt"));
        assertEquals(quadrangleService.calculateQadrangleSquare(quadrangleFactory.generateQuadrangle(points.get(0), points.get(1), points.get(2), points.get(3))),25, "Проверка не пройдена" );
    }
}
