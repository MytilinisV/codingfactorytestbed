package gr.aueb.cf.ch19.cfcollections;

import gr.aueb.cf.ch17.clone.City;

import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> cities = List.of("Athens", "Paris", "London");
        Iterator<String> itr = cities.iterator();

        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        cities.removeIf(c -> cities.equals("London"));

        while (itr.hasNext()) {
            String s = itr.next();
            if (s.equals("London"))     cities.remove(s);
            System.out.println(s);
        }

        for (String s : cities) {
            System.out.println(s);
        }

        // forEach method
        cities.forEach(System.out::println);

    }
}
