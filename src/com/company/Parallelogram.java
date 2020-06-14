/*
 *
 * Classname: Parallelogram
 *
 * @version 14.06.2020
 * @author Kryukov Kirilo
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

public class Parallelogram extends Rectangle {

    private int length;
    private int width;

    // default empty constructor
    public Parallelogram() {
    }

    /*
     * Class constructor with parameters
     * @param length int, set the Parallelogram length
     * @param width int, set the Parallelogram width
     */
    public Parallelogram(int length,int width) {
        super(length,width);
        this.length = length;
        this.width = width;
    }

    /*
     * Getter for field Parallelogram length (implements from Rectangle)
     * @return length of object Parallelogram
     */
    @Override
    public int getLength() {
        return length;
    }

    /*
     * Setter for field Parallelogram length (implements from Rectangle)
     * @oaram length sets length of object Parallelogram
     */
    @Override
    public void setLength(int length) {
        this.length = length;
    }

    /*
     * Getter for field Parallelogram width (implements from Rectangle)
     * @return width of object Parallelogram
     */
    @Override
    public int getWidth() {
        return width;
    }

    /*
     * Setter for field Parallelogram angle (implements from Rectangle)
     * @oaram angle sets angle of object Parallelogram
     */
    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    // Method toString() for class Parallelogram
    @Override
    public String toString() {
        return "Parallelogram{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}