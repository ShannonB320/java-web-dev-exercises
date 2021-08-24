package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student shannon = new Student();
        shannon.setName("Shannon");
        shannon.setStudentId(314);

        System.out.println(shannon.getName());
        System.out.println(shannon.getStudentId());
        System.out.println(shannon.getNumberOfCredits());

        System.out.println(shannon.getGpa());
        shannon.setGpa(4.0);
        System.out.println(shannon.getGpa());

        //Instantiate Course class for practice:
        Course mathematics = new Course();
        mathematics.setCourseName("Wonderful World of Mathematics");
        mathematics.setAttendingStudent((shannon.getName()), (shannon.getStudentId()));
        mathematics.setCourseCredit(3);

        System.out.println(mathematics.getCourseName());
        System.out.println(mathematics.getAttendingStudent());
        System.out.println(mathematics.getCourseCredit());

        //Instantiate Teacher class for practice:
        Teacher zColonius = new Teacher();
        zColonius.setFirstName("Zachary");
        zColonius.setLastName("Colonius");
        zColonius.setSubject("Mathematics");
        zColonius.setYearsTeaching(5);

        System.out.println("Newest instructor: " + zColonius.getLastName() + ", " + zColonius.getFirstName() + " has been teaching "
         + zColonius.getSubject() + " for " + zColonius.getYearsTeaching() + " years.");

    }
}
