/*
 *
 * Classname: Rectangle
 *
 * @version 14.06.2020
 * @author Kryukov Kiril
 * Module 2 task 4
 *
 * Programming patterns. Factory, Builder.
 *
 * Develop for your class
 * 1. Factory.
 * 2. Abstract factory.
 * 3. Create a class Student  - 25 fields.
 * 4. Create a builder for the class Student
 *
 */
package com.company;

import java.util.Objects;

public class Rectangle {

    private int length;
    private int width;
    // default empty constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    /*
     * Class constructor with parameters
     * @param int length, set the Rectangle length
     * @param int width, set the Rectangle width
     */

    public Rectangle() {
    }
    /*
     * Getter for field Rectangle length
     * @return length of object Rectangle
     */
    public int getLength() {
        return length;
    }
    /*
     * Setter for field Rectangle length
     * @param length sets side A of object Rectangle
     */

    public void setLength(int length) {
        this.length = length;
    }
    /*
     * Getter for field Rectangle width
     * @return width of object Rectangle
     */

    public int getWidth() {
        return width;
    }
    /*
     * Setter for field Rectangle width
     * @oaram width sets side B of object Rectangle
     */

    public void setWidth(int width) {
        this.width = width;
    }
    // Method toString() for class Rectangle

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
