package ru.gr0946x.ui.io;

import ru.gr0946x.Converter;
import ru.gr0946x.ui.fractals.Mandelbrot;

import java.awt.*;

public class FractalFileManager {

    private final Component parent;
    private final Converter conv;
    private final Mandelbrot mandelbrot;

    public FractalFileManager(Component parent, Converter conv, Mandelbrot mandelbrot) {
        this.parent = parent;
        this.conv = conv;
        this.mandelbrot = mandelbrot;
    }

    public void save(FractalSerializer serializer) {
        serializer.save(parent, conv, mandelbrot);
    }

    public void open(FractalSerializer serializer, Runnable onSuccess) {
        serializer.open(parent, conv, mandelbrot, onSuccess);
    }
}