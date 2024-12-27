package Practice;

import java.util.*;

public class Practice {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.add("Selenium.Ranjan");
        names.add("Nithin");
        names.add(null);
        names.add("Ram");
        names.addFirst("Raj");
        names.add("Ram");


        ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 3, null));

//        System.out.println(number);
//
//        System.out.println(names);

//        for (String ele : names) {
//            System.out.println(ele);
//        }


        List<Integer> ele = new LinkedList<>();
        ele.add(10);
        ele.addFirst(20);
        ele.addLast(90);
        ele.add(20);
        ele.add(87);

//        System.out.println(ele);

//        for (Integer num : ele) {
//            System.out.println(num);
//        }

        Set<String> set = new HashSet<>();
        set.add("Ravan");
        set.add("one");
        set.add("Selenium.Ranjan");
        set.add("Ram");
        set.add("Selenium.Ranjan");
//        System.out.println(set);

//        for(String elem:set)
//        {
//            System.out.println(elem);
//        }

        Set<Integer> sets = new LinkedHashSet<>();
        sets.add(19);
        sets.add(null);
        sets.add(90);
        sets.add(19);

//        System.out.println(sets);

        Set<String> nam = new TreeSet<>();
        nam.add("Selenium.Ranjan");
        nam.add("Abhi");
        nam.add("Xenos");

//        System.out.println(nam);

//        for(String names1:nam)
//        {
//            System.out.println(names1);
//        }

        Map<String, Integer> map = new HashMap<>();
        map.put("Selenium.Ranjan", 24);
        map.put("Ram", 24);
        map.put("Nithin", 23);
        map.put("Selenium.Ranjan", 23);
        map.put("Ram", 27);

//        System.out.println(map);


        Map<String, String> empName = new LinkedHashMap<>();
        empName.put("Selenium.Ranjan", "SE");
        empName.put("Abhinav", "SSE");
        empName.put("Nithin", "ASE");

        Map<String, String> empName1 = new TreeMap<>();
        empName1.put("Selenium.Ranjan", "SE");
        empName1.put("Abhinav", "SSE");
        empName1.put("Nithin", "ASE");

//        System.out.println(empName1);


        String days = "Tuesday";
        switch (days) {
            case "Sunday":
                System.out.println("It's Sunday");
                break;
            case "Monday":
                System.out.println("It's Monday");
                break;
            case "Tuesday":
                System.out.println("It's Tuesday");
                break;
            case "Wednesday":
                System.out.println("It's Wednesday");
                break;
            case "Thursday":
                System.out.println("It's Thursday");
                break;
            case "Friday":
                System.out.println("It's Friday");
                break;
            case "Saturday":
                System.out.println("It's Saturday");
                break;
            default:
                System.out.println("You have entered wrong day name");

        }
        System.out.println();


    }


}
