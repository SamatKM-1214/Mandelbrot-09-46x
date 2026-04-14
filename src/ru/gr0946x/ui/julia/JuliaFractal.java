package ru.gr0946x.ui.julia;

import ru.gr0946x.ui.fractals.Fractal;
import ru.smak.math.Complex;

public class JuliaFractal implements Fractal {
    private Complex constant; // Фиксированная константа C для множества Жюлия

    public JuliaFractal(Complex constant) {
        this.constant = constant;
    }

    public void setConstant(Complex constant) {
        this.constant = constant;
    }

    @Override
    public float inSetProbability(double x, double y) {
        // Локальные константы
        final int maxIterations = 100;
        final double R2 = 4;

        // Для Жюлия: Z_{n+1} = Z_n^2 + C
        // Z начинается с координат пикселя (x, y)
        var z = new Complex(x, y);
        int i = 0;
        while (z.getAbsoluteValue2() < R2 && ++i < maxIterations) {
            z.timesAssign(z);
            z.plusAssign(constant);
        }
        return (float) i / maxIterations;
    }
}