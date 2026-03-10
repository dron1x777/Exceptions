import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        Set<Student> students = new HashSet<>(List.of(
                new Student("name", 23),
                new Student("name", 23),
                new Student("what", 1432),
                new Student("when", 765),
                new Student("why", 75)
                ));
        System.out.println(students);
    }
}