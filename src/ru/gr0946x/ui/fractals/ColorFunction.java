package ru.gr0946x.ui.fractals;

import java.awt.*;

@FunctionalInterface
public interface ColorFunction {
    Color getColor(float value);
}
