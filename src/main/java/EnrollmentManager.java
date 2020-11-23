import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentManager {

    public static void main(String[] args) {
        //generate Courses
        Course csit = new Course("Computer Science", new DateTime("2020-08-01T00:0:00Z"), new DateTime("2021-5-30T00" +
                ":0:00Z"));
        Course ece = new Course("Electronic and Computer Engineering", new DateTime("2020-08-01T00:0:00Z"),
                new DateTime("2021-5-30T00:0:00Z"));

        Module electronics = new Module("Electronics", "EE437");
        Module softwareEngineering = new Module("Software Engineering", "CT417");
        Module graphics = new Module("Graphics and Image processing", "CT487");
        Module databases = new Module("Databases", "CT457");

        Student john = new Student("John Smith", "1998-08-01");
        Student jane = new Student("Jane Browne", "1999-03-02");
        Student james = new Student("James Milton", "1998-06-11");

        //enrolling
        csit.addModule(softwareEngineering);
        csit.addModule(graphics);
        csit.addModule(databases);

        ece.addModule(softwareEngineering);
        ece.addModule(electronics);

        List<Module> moduleListA = new ArrayList<>();
        List<Module> moduleListB = new ArrayList<>();
        List<Module> moduleListC = new ArrayList<>();

        moduleListA.add(softwareEngineering);
        moduleListA.add(electronics);

        moduleListB.add(softwareEngineering);
        moduleListB.add(graphics);

        moduleListC.add(softwareEngineering);
        moduleListC.add(databases);

        john.enrollStudent(ece, moduleListA);
        jane.enrollStudent(csit, moduleListB);
        james.enrollStudent(csit, moduleListC);

        //Check lists
        System.out.println("***********************************\n\nPrinting Enrollment details: \n\nCourses: ");

        System.out.println(csit);
        System.out.println(ece);

        System.out.println("***********************************\n\nModules: ");

        System.out.println(electronics);
        System.out.println(softwareEngineering);
        System.out.println(graphics);
        System.out.println(databases);

        System.out.println("***********************************\n\nStudents: ");

        System.out.println(john);
        System.out.println(jane);
        System.out.println(james);
    }
}
