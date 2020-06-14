/*
 *
 * Classname: Main
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

public class Main {

    public static void main(String[] args) {

        // Rectangle Factory

        Rectangle rectangle1 = RectangleFactory.create(5,6);
        System.out.println(rectangle1);

        // Abstract Rectangle Factory

        Rectangle pr1 = AbstractFactoryRectangle.create(4,4);
        System.out.println(pr1);

        // Student

        Student student;
        student = new Student("Kryukov",
                "Kirilo",
                "Sergievich",
                "Pavlovich",
                "Andriy",
                "Anatolievich",
                "KNUTE",
                Speciality.SOFTWARE_ENGINEERING,
                false,
                5,
                false,
                true,
                false,
                true,
                true,
                true,
                true,
                true,
                Gender.MALE,
                "ukrainian",
                "blue-gray",
                "blonde",
                85,
                185,
                21);

        System.out.println(student);

        // Student Sergii Builder

        Student Sergii = new Student.Builder()
                .setFirstName("Sergii")
                .setLastName("Typenko")
                .setPatronymic("Bohdanovich")
                .setFirstNameTeacher("Konstantinovskii")
                .setLastNameTeacher("Vasillii")
                .setPatronymicTeacher("Ihorovich")
                .setUniversity("KNUTE")
                .setSpeciality(Speciality.GUI)
                .setPrivilege(true)
                .setCourse(4)
                .setContract(false)
                .setFullTimeEducation(false)
                .setMilitaryDepartment(false)
                .setDepartmentOfSports(true)
                .setScientificWork(false)
                .setActivist(false)
                .setDriverLicense(true)
                .setChummery(false)
                .setGender(Gender.MALE)
                .setNationality("ukrainian")
                .setEyeColor("black")
                .setHairColor("black")
                .setHeight(176)
                .setWeight(90)
                .setAge(23)
                .build();

        System.out.println(Sergii);

        // Student Oleg is similar to Artem except the First Name and Last name

        Student Vladislav = new Student.Builder()
                .setSimilarTo(Sergii)
                .setFirstName("Vladislav")
                .setLastName("Druzko")
                .build();

        System.out.println(Vladislav);

    }
}