package bai3;

import java.lang.reflect.AnnotatedArrayType;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args){
        HashMap<String, Integer> persons = new HashMap<>();
        persons.put("Son", 23);
        persons.put("Anh", 16);
        persons.put("Ha", 24);
        persons.put("Trang", 20);
        persons.put("Hong", 22);

        for(Map.Entry<String, Integer> person: persons.entrySet()){
            System.out.println(person.getKey());
        }

        String keySearch = "Anh";
        System.out.println("tuoi cua "+keySearch + " la: "+persons.get(keySearch));

        String keyRemove = "Hong";
        persons.remove(keyRemove);
        System.out.println("Danh sach sau khi xoa: "+ persons);

        String keyCheck = "Trang";
        if(persons.containsKey(keyCheck) == true){
            System.out.println(keyCheck +" ton tai trong danh sach");
        } else {
            System.out.println(keyCheck + " khong ton tai trong danh sach");
        }
    }
}
