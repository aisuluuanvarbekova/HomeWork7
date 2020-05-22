package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {


            ArrayList<String> ListA = new ArrayList<String>(5);
            System.out.println("Посчитать  до 5 ");

            Scanner scanner = new Scanner(System.in);
            ListA.add(scanner.nextLine() + (" Chicago "));
            ListA.add(scanner.nextLine() + (" Las Vegas "));
            ListA.add(scanner.nextLine() + (" California "));
            ListA.add(scanner.nextLine() + (" Arizona "));
            ListA.add(scanner.nextLine() + (" Florida"));
            Iterator<String> iterator = ListA.iterator();
            while (iterator.hasNext()) {
                String e = iterator.next();
                System.out.println(e);


            }
            ArrayList<String> listB = new ArrayList<String>(5);
            System.out.println(" Продолжить до 10 ");
            Scanner scanner1 = new Scanner(System.in);
            listB.add(scanner1.nextLine() + (" Indiana "));
            listB.add(scanner1.nextLine() + (" MaryLand"));
            listB.add(scanner1.nextLine() + (" Minnesota"));
            listB.add(scanner1.nextLine() + (" Nebraska "));
            listB.add(scanner1.nextLine() + (" New York "));
            Collections.reverse(listB);
            iterator = listB.iterator();
            while (iterator.hasNext()) ;
            {

                String a = iterator.next();
                System.out.println(a);
            }
            ArrayList<String> listC = new ArrayList<String>();
            int i = 0;
            while (i < ListA.size()) {
                listC.add(ListA.get(i));
                listC.add(listB.get(i));
                iterator = listC.iterator();

            }

            while (iterator.hasNext()) {
                String c = iterator.next();
                System.out.println(c);
            }


            Collections.sort(listC, new Comparator<String>() {
                @Override
                public int compare(String X, String L) {
                    return X.length() - L.length();

                }
            });

            iterator = listC.iterator();
            while (iterator.hasNext()) {
                String list = iterator.next();
                System.out.println(list);
            }
        } catch (OutOfMemoryError e) {
        }
    }
}






























