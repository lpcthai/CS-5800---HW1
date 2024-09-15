package AGGREGATION;

public class Main {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin",
                "Pearson; 1st edition (August 1, 2008)");

        Instructor instructor2 = new Instructor("Yu", "Sun", "1-15");
        Textbook textbook2 = new Textbook("Introduction to Algorithms 3r", "Thomas H. Cormen",
                "MIT Press; 3rd edition (September 1, 2009)");

        Instructor[] instructors = {instructor1, instructor2};
        Textbook[] textbooks = {textbook1, textbook2};

        Course course = new Course(instructors, textbooks, "Software Engineering");
        course.display();
    }
}
