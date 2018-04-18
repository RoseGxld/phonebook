package hashmaps;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    Map<String, String> phonebook = new HashMap<String, String>();


    public void addUser(String name, String number) {
        phonebook.put(name, number);


    }

    public void removeUser(String name) {
        phonebook.remove(name);
    }

    public String lookupAUser(String name) {
        return phonebook.get(name);
    }


    public String reverseLookupUser(String number) {
        Map<String, String> phonebook = new HashMap<String, String>();

        for (Entry<Integer, String> entry : testMap.entrySet()) {
            if (entry.getValue().equals("c"))
        }
    }
}

        public String listAllEntries () {
            return String.valueOf(phonebook);

        }

        @Override
        public String toString () {
            return "PhoneBook{" +
                    "phonebook=" + phonebook +
                    '}';
        }
    }







