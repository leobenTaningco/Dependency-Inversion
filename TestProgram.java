public class TestProgram {
    public static void main(String[] args) {
        ResourceRepository library = new Library();
        Student student = new Student(library);

        student.borrowBook("Calc II");
        student.borrowJournal("Science Journal");

        student.returnJournal("Science Journal");
        student.returnBook("Calc II");
        student.returnBook("Stats I");
    }

}
