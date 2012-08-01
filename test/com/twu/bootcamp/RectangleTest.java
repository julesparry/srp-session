package com.twu.bootcamp;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RectangleTest {

    @Test
    public void shouldCalculateArea() {
        Rectangle rectangle = new Rectangle(5, 5);
        assertThat(rectangle.area(), is(25));
    }

    @Test
    public void shouldCalculatePerimeter() {
        Rectangle rectangle = new Rectangle(2, 7);
        assertThat(rectangle.perimeter(), is(18));
    }
}
