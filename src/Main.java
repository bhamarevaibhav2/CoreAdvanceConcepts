import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr = {1,2,45,65,23,0,23,1,5};

        Arrays.stream(arr).sorted().forEach(System.out::println);

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Vishal","Vaibhav"));
        List<String> collect = list.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);
    }
}