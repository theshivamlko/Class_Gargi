import java.util.HashMap;
import java.util.Set;

class HashMapExample {

    public static void main(String[] args) {

        HashMapExample objExample = new HashMapExample();
        // objExample.stringData();
        objExample.studentData();
    }

    void studentData() {

        HashMap<String, Student> map = new HashMap<>();

        Student student = new Student(10, "Shivam", 74.4);

        Student student2 = new Student(12, "Gargi", 80.0);

        map.put("CSE", student);
        map.put("IT", student2);

        System.out.println(map.toString());

        Student obj = map.get("IT");
        System.out.println(obj.name);
        obj.name = "Gargi Singh";

        map.replace("IT", obj);

        Student obj2 = map.get("IT");
        System.out.println(obj2.name);


        Set<String> set=map.keySet();
        System.out.println(set.toString());

        for(String key:set){
            
        System.out.println(map.get(key).name);
            
        }

    }

    void stringData() {

        HashMap<String, String> map = new HashMap<>();

        map.put("name", "Shivam");
        map.put("roll", "123");
        map.put("marks", "56.9");

        System.out.println(map.toString());

        System.out.println(map.get("roll"));

        map.replace("roll", "11");
        System.out.println(map.get("roll"));

    }
}