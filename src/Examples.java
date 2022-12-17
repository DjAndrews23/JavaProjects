import java.util.Arrays;
import java.util.List;

public class Examples {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 4, 2, 7, 85, 6);
        Integer squaredEven = list.stream()
                .filter(l -> l % 2 ==0)
                .map(l -> l * l)
                .reduce(0,(total, num)->total+num);




        System.out.println(squaredEven);

    }
}
