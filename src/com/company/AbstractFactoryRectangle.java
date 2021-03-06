/*
 *
 * Classname: AbstractFactoryParallelogram
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

public class AbstractFactoryRectangle {

    /*
     * AbstractFactoryRectangle with parameters
     * @param length int, set the Rectangle or Parallelogram length
     * @param width int, set the Rectangle width
     */
    public static Rectangle create(int length,int width){
        if (length == width ) {return
                new Parallelogram (length,width);
        } else return
                new Rectangle(length,width);

    }
}