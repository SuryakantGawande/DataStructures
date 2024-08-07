package collections;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {


        ListEx2 example = new ListEx2();
        List<String> names = example.getNames();
        System.out.println(names);
    }
        public List<String> getNames () {
            List<String> names = new ArrayList<>();
            names.add("Alice");
            names.add("Bob");
            return names;
        }
    }
