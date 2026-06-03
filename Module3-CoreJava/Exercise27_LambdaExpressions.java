import java.util.*;

public class Exercise27_LambdaExpressions {

    public static void main(String[] args) {

        List<String> names =
                Arrays.asList(

                        "Vinayak",
                        "Rahul",
                        "Aman",
                        "Deepak"

                );

        Collections.sort(

                names,

                (a,b) -> a.compareTo(b)

        );

        System.out.println(names);

    }

}
