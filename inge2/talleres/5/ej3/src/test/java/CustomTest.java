package org.autotest;

import org.junit.Test;
import static org.junit.Assert.*;
import org.autotest.StackAr;

public class CustomTest {
    @Test
    public void testPopReturnsTopElement() {
        StackAr stack = new StackAr();
        Object element = "hola";
        stack.push(element);

        assertEquals(element, stack.pop());
    }

    @Test
    public void testToStringReturnsAStringRepresentationOfTheObject() {
        StackAr stack = new StackAr();
        Object element = "hola";
        stack.push(element);

        assertEquals("[" + element + "]", stack.toString());
    }

    @Test
    public void testSameObjectShouldBeEqualToItself() {
        StackAr stack = new StackAr();

        assertEquals(stack, stack);
    }

    @Test
    public void testStackArIsNotEqualToNull() {
        StackAr stack = new StackAr();

        assertNotEquals(stack, null);
    }

    @Test
    public void testStackArIsNotEqualToObjectWithDifferentClass() {
        StackAr stack = new StackAr();

        assertNotEquals(stack, "other");
    }

    @Test
    public void testStackArIsNotEqualToStackArWithDifferentObjects() {
        StackAr first = new StackAr();
        StackAr second = new StackAr();
        second.push("hola");

        assertNotEquals(first, second);
    }

    @Test
    public void testStackArIsEqualToOtherStackArWithSameObjects() {
        StackAr first = new StackAr();
        StackAr second = new StackAr();
        Object element = "hola";
        first.push(element);
        second.push(element);

        assertEquals(first, second);
    }
}