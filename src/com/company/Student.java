/*
 *
 * Classname: Student
 *
 *@version 14.06.2020
 *@author  Kryukov Kirilo
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

public class Student {

    // firstName String, set the student First name
    private String firstName;
    // lastName String, set the student Last name
    private String lastName;
    // patronymic String, set the student patronymic
    private String patronymic;
    // firstNameTeacher String, set the First name of student teacher
    private String firstNameTeacher;
    // lastNameTeacher String, set the Last name of student teacher
    private String lastNameTeacher;

    // patronymicTeacher String, set the patronymic of student teacher
    private String patronymicTeacher;
    // university String, set the student university
    private String university;
    // speciality enum Speciality, set the student speciality
    // enum Speciality: DESIGN, SOFTWARE_ENGINEERING, NETWORKS, GUI
    private Speciality speciality;
    // privilege boolean, set the availability of privilege
    private boolean privilege;
    // course int, set the student course
    private int course;

    // contract boolean, set the availability of contract
    private boolean contract;
    // fullTimeEducation boolean, set checking form of education
    private boolean fullTimeEducation;
    // militaryDepartment boolean, set checking military department
    private boolean militaryDepartment;
    // departmentOfSports boolean, set checking department of sports
    private boolean departmentOfSports;
    // scientificWork
    // eyeColor String, set the student eye color
    private String eyeColor;
    // hairColor String, set the student hair color
    private String hairColor;
    // weigth int, set the student weigth
    private int weight;
    // heigth int, set the student heigth
    private int height;
    // age int, set the student age
    private int age;
    // activist boolean, set checking the scientific work
    private boolean scientificWork;

    // activist boolean, set checking the scientific work
    private boolean activist;
    // driverLicense boolean, set checking the driver license
    private boolean driverLicense;
    // chummery boolean, set checking the chummery
    private boolean chummery;
    // gender enum Gender, set the student gender
    // enum Gender: MALE, FEMALE
    private Gender gender;
    // nationality String, set the student nationality
    private String nationality;


    /*
     * Class constructor with parameters
     */

    public Student(String firstName,
                   String lastName,
                   String patronymic,
                   String firstNameTeacher,
                   String lastNameTeacher,
                   String patronymicTeacher,
                   String university,
                   Speciality speciality,
                   boolean privilege,
                   int course,
                   boolean contract,
                   boolean fullTimeEducation,
                   boolean militaryDepartment,
                   boolean departmentOfSports,
                   boolean scientificWork,
                   boolean activist,
                   boolean driverLicense,
                   boolean chummery,
                   Gender gender,
                   String nationality,
                   String eyeColor,
                   String hairColor,
                   int weight,
                   int height,
                   int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.firstNameTeacher = firstNameTeacher;
        this.lastNameTeacher = lastNameTeacher;
        this.patronymicTeacher = patronymicTeacher;
        this.university = university;
        this.speciality = speciality;
        this.privilege = privilege;
        this.course = course;
        this.contract = contract;
        this.fullTimeEducation = fullTimeEducation;
        this.militaryDepartment = militaryDepartment;
        this.departmentOfSports = departmentOfSports;
        this.scientificWork = scientificWork;
        this.activist = activist;
        this.driverLicense = driverLicense;
        this.chummery = chummery;
        this.gender = gender;
        this.nationality = nationality;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    // default empty constructor
    public Student() {
    }

    /**
     * Getter for field Student firstName
     * @return Returns first name of object Student
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for field Student firstName
     * @param firstName sets first name of object Student
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    // For the next 24 pairs getters and setters, everything is exactly the same

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getFirstNameTeacher() {
        return firstNameTeacher;
    }

    public void setFirstNameTeacher(String firstNameTeacher) {
        this.firstNameTeacher = firstNameTeacher;
    }

    public String getLastNameTeacher() {
        return lastNameTeacher;
    }

    public void setLastNameTeacher(String lastNameTeacher) {
        this.lastNameTeacher = lastNameTeacher;
    }

    public String getPatronymicTeacher() {
        return patronymicTeacher;
    }

    public void setPatronymicTeacher(String patronymicTeacher) {
        this.patronymicTeacher = patronymicTeacher;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public boolean isPrivilege() {
        return privilege;
    }

    public void setPrivilege(boolean privilege) {
        this.privilege = privilege;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public boolean isContract() {
        return contract;
    }

    public void setContract(boolean contract) {
        this.contract = contract;
    }

    public boolean isFullTimeEducation() {
        return fullTimeEducation;
    }

    public void setFullTimeEducation(boolean fullTimeEducation) {
        this.fullTimeEducation = fullTimeEducation;
    }

    public boolean isMilitaryDepartment() {
        return militaryDepartment;
    }

    public void setMilitaryDepartment(boolean militaryDepartment) {
        this.militaryDepartment = militaryDepartment;
    }

    public boolean isDepartmentOfSports() {
        return departmentOfSports;
    }

    public void setDepartmentOfSports(boolean departmentOfSports) {
        this.departmentOfSports = departmentOfSports;
    }

    public boolean isScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(boolean scientificWork) {
        this.scientificWork = scientificWork;
    }

    public boolean isActivist() {
        return activist;
    }

    public void setActivist(boolean activist) {
        this.activist = activist;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public boolean isChummery() {
        return chummery;
    }

    public void setChummery(boolean chummery) {
        this.chummery = chummery;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method toString() for class Student

    @Override
    public String toString() {
        return "Student{" +
                "First Name - '" + firstName + '\'' + "\n" +
                "Last Name - '" + lastName + '\'' + "\n" +
                "Patronymic - '" + patronymic + '\'' + "\n" +
                "First name teacher - '" + firstNameTeacher + '\'' + "\n" +
                "Last name teacher - '" + lastNameTeacher + '\'' + "\n" +
                "Patronymic teacher - '" + patronymicTeacher + '\'' + "\n" +
                "University - '" + university + '\'' + "\n" +
                "Speciality - " + speciality + "\n" +
                "Privilege - " + privilege + "\n" +
                "Course - " + course + "\n" +
                "Contract - " + contract + "\n" +
                "Full Time Education - " + fullTimeEducation + "\n" +
                "Military Department - " + militaryDepartment + "\n" +
                "Department Of Sports - " + departmentOfSports + "\n" +
                "Scientific Work - " + scientificWork + "\n" +
                "Activist - " + activist + "\n" +
                "Driver License - " + driverLicense + "\n" +
                "Chummery - " + chummery + "\n" +
                "Gender - " + gender + "\n" +
                "Nationality - '" + nationality + '\'' + "\n" +
                "Eye Color - '" + eyeColor + '\'' + "\n" +
                "Hair Color - '" + hairColor + '\'' + "\n" +
                "Weight - " + weight + "\n" +
                "Height - " + height + "\n" +
                "Age - " + age +
                '}';
    }

    /*
     * Pattern Builder take basic Student
     * with all setters for StudentToBuild
     */
    public static class Builder{
        private Student studentToBuild;

        public Builder() {
            this.studentToBuild = new Student();
        }

        /*
         * Method setSimilarTo complements new object example
         * StudentToBuild with the first example in basis
         * @param student is an object from which all parameters are taken
         */
        public Builder setSimilarTo(Student student){
            this.studentToBuild.firstName = student.firstName;
            this.studentToBuild.lastName = student.lastName;
            this.studentToBuild.patronymic = student.patronymic;
            this.studentToBuild.firstNameTeacher = student.firstNameTeacher;
            this.studentToBuild.lastNameTeacher = student.lastNameTeacher;
            this.studentToBuild.patronymicTeacher = student.patronymicTeacher;
            this.studentToBuild.university = student.university;
            this.studentToBuild.speciality = student.speciality;
            this.studentToBuild.privilege = student.privilege;
            this.studentToBuild.course = student.course;
            this.studentToBuild.contract = student.contract;
            this.studentToBuild.fullTimeEducation = student.fullTimeEducation;
            this.studentToBuild.militaryDepartment = student.militaryDepartment;
            this.studentToBuild.departmentOfSports = student.departmentOfSports;
            this.studentToBuild.scientificWork = student.scientificWork;
            this.studentToBuild.activist = student.activist;
            this.studentToBuild.driverLicense = student.driverLicense;
            this.studentToBuild.chummery = student.chummery;
            this.studentToBuild.gender = student.gender;
            this.studentToBuild.nationality = student.nationality;
            this.studentToBuild.eyeColor = student.eyeColor;
            this.studentToBuild.hairColor = student.hairColor;
            this.studentToBuild.weight = student.weight;
            this.studentToBuild.height = student.height;
            this.studentToBuild.age = student.age;
            return this;
        }

        /*
         * Setter for StudentToBuild of Student object firstName field
         * @param firstName Sets first name of StudentToBuild object
         */
        public Builder setFirstName(String firstName){
            studentToBuild.setFirstName(firstName);
            return this;
        }
        // the same situation for all 24 fields with each own parameters

        public Builder setLastName(String lastName){
            studentToBuild.setLastName(lastName);
            return this;
        }

        public Builder setPatronymic(String patronymic){
            studentToBuild.setPatronymic(patronymic);
            return this;
        }

        public Builder setFirstNameTeacher(String firstNameTeacher){
            studentToBuild.setFirstNameTeacher(firstNameTeacher);
            return this;
        }

        public Builder setLastNameTeacher(String lastNameTeacher){
            studentToBuild.setLastNameTeacher(lastNameTeacher);
            return this;
        }

        public Builder setPatronymicTeacher(String patronymicTeacher){
            studentToBuild.setPatronymicTeacher(patronymicTeacher);
            return this;
        }

        public Builder setUniversity(String university){
            studentToBuild.setUniversity(university);
            return this;
        }

        public Builder setSpeciality(Speciality speciality){
            studentToBuild.setSpeciality(speciality);
            return this;
        }

        public Builder setPrivilege(boolean privilege){
            studentToBuild.setPrivilege(privilege);
            return this;
        }

        public Builder setCourse(int course){
            studentToBuild.setCourse(course);
            return this;
        }

        public Builder setContract(boolean contract){
            studentToBuild.setContract(contract);
            return this;
        }

        public Builder setFullTimeEducation(boolean fullTimeEducation){
            studentToBuild.setFullTimeEducation(fullTimeEducation);
            return this;
        }

        public Builder setMilitaryDepartment(boolean militaryDepartment){
            studentToBuild.setMilitaryDepartment(militaryDepartment);
            return this;
        }

        public Builder setDepartmentOfSports(boolean departmentOfSports){
            studentToBuild.setDepartmentOfSports(departmentOfSports);
            return this;
        }

        public Builder setScientificWork(boolean scientificWork){
            studentToBuild.setScientificWork(scientificWork);
            return this;
        }

        public Builder setActivist(boolean activist){
            studentToBuild.setActivist(activist);
            return this;
        }

        public Builder setDriverLicense(boolean driverLicense){
            studentToBuild.setDriverLicense(driverLicense);
            return this;
        }

        public Builder setChummery(boolean chummery){
            studentToBuild.setChummery(chummery);
            return this;
        }

        public Builder setGender(Gender gender){
            studentToBuild.setGender(gender);
            return this;
        }

        public Builder setNationality(String nationality){
            studentToBuild.setNationality(nationality);
            return this;
        }

        public Builder setEyeColor(String eyeColor){
            studentToBuild.setEyeColor(eyeColor);
            return this;
        }

        public Builder setHairColor(String hairColor){
            studentToBuild.setHairColor(hairColor);
            return this;
        }

        public Builder setWeight(int weight){
            studentToBuild.setWeight(weight);
            return this;
        }

        public Builder setHeight(int height){
            studentToBuild.setHeight(height);
            return this;
        }

        public Builder setAge(int age){
            studentToBuild.setAge(age);
            return this;
        }

        // Method returns a built Student object with all parameters
        public Student build(){
            return studentToBuild;
        }

    }

}