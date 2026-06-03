import java.util.HashMap;
import java.util.Scanner;

public class Exercise25_HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer,String> students =
                new HashMap<>();

        Scanner sc = new Scanner(System.in);

        students.put(101,"Vinayak");
        students.put(102,"Rahul");
        students.put(103,"Aman");

        System.out.print(
                "Enter Student ID: "
        );

        int id = sc.nextInt();

        System.out.println(

                students.getOrDefault(
                        id,
                        "Student Not Found"
                )

        );

        sc.close();

    }

}
