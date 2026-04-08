package ru.gr0946x.ui.io;

import ru.gr0946x.Converter;
import ru.gr0946x.ui.fractals.Mandelbrot;

import java.awt.*;

public interface FractalSerializer {
    void save(Component parent, Converter conv, Mandelbrot mandelbrot);
    void open(Component parent, Converter conv, Mandelbrot mandelbrot, Runnable onSuccess);
}
