import java.util.ArrayList;
import java.util.Scanner;

public class Exercise24_ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> students =
                new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "How Many Students? "
        );

        int n = sc.nextInt();

        sc.nextLine();

        for(int i=0;i<n;i++) {

            System.out.print(
                    "Enter Name: "
            );

            students.add(
                    sc.nextLine()
            );

        }

        System.out.println(
                "Student List"
        );

        for(String name : students) {

            System.out.println(name);

        }

        sc.close();

    }

}
