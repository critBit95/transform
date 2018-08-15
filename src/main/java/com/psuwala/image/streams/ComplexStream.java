package com.psuwala.image.streams;

import com.psuwala.image.point.Complex;

import java.util.List;
import java.util.Objects;

/**
 * TODO: Document this class / interface here
 *
 * @since v7.4
 */
public class ComplexStream {
    final List<Complex> points;

    public ComplexStream(List<Complex> complexes) {
        this.points = complexes;
    }

    public List<Complex> getPoints() {
        return points;
    }
}
