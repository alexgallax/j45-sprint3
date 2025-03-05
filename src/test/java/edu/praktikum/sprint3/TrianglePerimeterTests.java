package edu.praktikum.sprint3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TrianglePerimeterTests {

    @Parameterized.Parameter
    public int side1;
    @Parameterized.Parameter(1)
    public int side2;
    @Parameterized.Parameter(2)
    public int side3;
    @Parameterized.Parameter(3)
    public int expectedPerimeter;

    @Parameterized.Parameters(name = "Тест {index}: Треугольник со сторонами {0}, {1}, {2} должен иметь периметр {3}")
    public static Object[][] data() {
        return new Object[][] {
                { 2, 3, 5, 10 },
                { 3, 4, 2, 9 },
                { 8, 10, 7, 25 }
        };
    }

    @Test
    public void perimeterTest() {
        Triangle triangle = new Triangle(side1, side2, side3);

        assertEquals("Периметр треугольника вычислен неверно",
                expectedPerimeter, triangle.perimeter());
    }
}
