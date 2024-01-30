import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CustomerStorage {
    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) throws MyCustom {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;
        final int EXPECTED_COMPONENTS = 4;
        String[] components = data.split("\\s+");

        String regexNum = "[+][7][0-9]{10}";
        String regexMAil = "[a-zA-Z]{1,}[@][a-zA-Z]{1,}[.][a-zA-Z]{2,6}";

        if (components.length != 4){
            throw new MyCustom("Не праавильный формат данных" + EXPECTED_COMPONENTS);
        } else if (components[INDEX_PHONE].matches(regexNum)!= true){
            throw new MyCustom("Номер не верный");
        } else if (components[INDEX_EMAIL].matches(regexMAil)!= true){
            throw new MyCustom("Mail неверный");
        }
            String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
            storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
    }
    public void listCustomers() {storage.values().forEach(System.out::println);}

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }
}