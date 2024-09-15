package AGGREGATION;

public class Course {
    private String courseName;
    private Instructor[] instructors;
    private Textbook[] textbooks;

    public Course(Instructor[] instructors, Textbook[] textbooks, String courseName) {
        this.instructors = instructors;
        this.textbooks = textbooks;
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Instructor[] getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructor[] instructors) {
        this.instructors = instructors;
    }
    public Textbook[] getTextbooks() {
        return textbooks;
    }
    public void setTextbooks(Textbook[] textbooks) {
        this.textbooks = textbooks;
    }
    public void display() {
        for (int i = 0; i < instructors.length; i++) {
            Instructor instructor = instructors[i];
            System.out.printf("Instructor : %s %s, Office: %s%n",
                    instructor.getFirstName(), instructor.getLastName(), instructor.getOfficeNumber());

            if (i < textbooks.length) {
                Textbook textbook = textbooks[i];
                System.out.printf("Textbook: %s by %s, Published by: %s%n",
                        textbook.getTitle(), textbook.getAuthor(), textbook.getPublisher());
            }
            System.out.println();
        }

        if (textbooks.length > instructors.length) {
            for (int i = instructors.length; i < textbooks.length; i++) {
                Textbook textbook = textbooks[i];
                System.out.printf("Textbook: %s by %s, Published by: %s%n",
                        textbook.getTitle(), textbook.getAuthor(), textbook.getPublisher());
            }
        }
    }

}
