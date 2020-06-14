/*
 *
 * Classname: RectangleFactory
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

public class RectangleFactory {

    /*
     * ParallelogramFactory with parameters
     * @param int length, set the Rectangle length
     * @param int width, set the Rectangle width
     */
    public static Rectangle create(int length,int width){

        Rectangle rectangle = new Rectangle(length,width);

        return rectangle;

    }
}
