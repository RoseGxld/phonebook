package hashmaps;


import sun.awt.SunGraphicsCallback;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Map<Integer, String> videoGames = new HashMap<Integer, String>();
//        videoGames.put(1,"ForHonor");
//        videoGames.put(2,"FarCry5");
//        videoGames.put(3,"AC:Origins");
//        videoGames.put(4,"GearsOfWar4");
//
//        ((HashMap<Integer, String>) videoGames).clone();
//            System.out.println(((HashMap<Integer, String>) videoGames).clone());
//            videoGames.size();
//        System.out.println(videoGames.size());
//        videoGames.isEmpty();
//        System.out.println(videoGames.isEmpty());
//
//
//        Iterator<Map.Entry<Integer,String>> leGoat = videoGames.entrySet().iterator();
//        while(leGoat.hasNext()){
//            Map.Entry<Integer, String> entry = leGoat.next();
//            System.out.println("Key : " + entry.getKey() + " / Value " + entry.getValue());
//
//        }
//        videoGames.clear();

        PhoneBook pb1 = new PhoneBook();


        Map<String, String> phonebook = new HashMap<String, String>();

        pb1.addUser("Drose","(302)-723-6689");
        pb1.addUser("Zay","(302)-656-4892");
        pb1.addUser("The Goat","(302)-669-5937");
        pb1.addUser("Ya Muva","(302)-489-9367");
        System.out.println(pb1);

        System.out.println("===================================================");

        pb1.lookupAUser("Zay");
        System.out.println(pb1.lookupAUser("Zay"));

        System.out.println("======================================================");

        pb1.reverseLookupUser("(302)-723-6689");
        System.out.println(pb1.reverseLookupUser("(302)-723-6689"));

        System.out.println("======================================================");

        pb1.listAllEntries();
        System.out.println(pb1.listAllEntries());

        System.out.println("============================================================");

        pb1.removeUser("Ya Muva");
        System.out.println(pb1);





    }
}

