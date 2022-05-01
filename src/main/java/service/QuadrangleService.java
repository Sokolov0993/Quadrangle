package service;

import entitty.Quadrangle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class QuadrangleService {
    private static final Logger loggerService = LogManager.getLogger(QuadrangleService.class);

    public double calculateQadranglePerimeter(Quadrangle quadrangle) {
        loggerService.info("Начинаем считать периметр");
        double perimeter=(quadrangle.getSide1() + quadrangle.getSide2() + quadrangle.getSide3() + quadrangle.getSide4());
        loggerService.info("Периметр посчитан: "+ perimeter);
        return perimeter;
    }

    public double calculateQadrangleSquare(Quadrangle quadrangle) {
        loggerService.info("Начинаем считать площадь");
        double p = (quadrangle.getSide1() + quadrangle.getSide2() + quadrangle.getSide3() + quadrangle.getSide4()) / 2;
        double qadrandleSquare = Math.sqrt((p - quadrangle.getSide1()) * (p - quadrangle.getSide2()) * (p - quadrangle.getSide3()) * (p - quadrangle.getSide4()));
        loggerService.info("Площадь посчитана: "+ qadrandleSquare);
        return qadrandleSquare;
    }


    public boolean checkIfQadrangleIsSqare(Quadrangle quadrangle) {
        loggerService.info("Проверка на квадрат");
        if (quadrangle.getSide1() == quadrangle.getSide4() && quadrangle.getSide1() == quadrangle.getSide3()
                && quadrangle.getDiagonal1() == quadrangle.getDiagonal2()) {
            loggerService.info("Проверка завершена: true");
            return true;
        } else {
            loggerService.info("Проверка завершена: false");
            return false;
        }


    }


    public boolean checkIfQadrangleIsRhombus(Quadrangle quadrangle) {
        loggerService.info("Проверка на ромб");
        if (quadrangle.getSide1() == quadrangle.getSide4() && quadrangle.getSide1() == quadrangle.getSide3()
                && quadrangle.getDiagonal1() != quadrangle.getDiagonal2()) {
            loggerService.info("Проверка завершена: true");
            return true;
        } else {
            loggerService.info("Проверка завершена: false");
            return false;
        }
    }
}

