import java.util.List;

record Person(
        String name,
        int age
) {}

public class Exercise29_Records {

    public static void main(String[] args) {

        List<Person> people =

                List.of(

                        new Person(
                                "Vinayak",
                                22
                        ),

                        new Person(
                                "Rahul",
                                17
                        )

                );

        people.stream()

                .filter(
                        p -> p.age() >= 18
                )

                .forEach(
                        System.out::println
                );

    }

}
