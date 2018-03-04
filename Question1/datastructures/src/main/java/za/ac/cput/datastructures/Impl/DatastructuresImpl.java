package za.ac.cput.datastructures.Impl;

import java.util.*;
import za.ac.cput.datastructures.Datastructures;

public class DatastructuresImpl implements Datastructures
{
    public DatastructuresImpl()
    {
        super();
    }

    public List <String> myCars()
    {
        List cars = new ArrayList();

        cars.add("Audi A4");
        cars.add("Audi A3");
        cars.add("Ford Ranger");
        cars.add("Opel Astra H");

        return cars;
    }

    public Set <String> setOfNumbers()
    {
        Set numbers = new HashSet();

        numbers.add(3);
        numbers.add(0);
        numbers.add(9);
        numbers.add(10);
        numbers.add(12);
        numbers.add(14);

        return numbers;
    }

    public Map <String, String> myBooks()
    {
        Map books = new HashMap();

        books.put("1", "C++ Data Structures");
        books.put("2", "Java - Data Structures and Algorithms");
        books.put("3", "C#");

        return books;
    }


}
