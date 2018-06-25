import java.util.*;

class ArrayListExample {

    public static void main(String[] args) {
        ArrayListExample object = new ArrayListExample();
        // object.aboutStringList();
        object.aboutModelList();

    }

    public void aboutModelList() {
        Student student = new Student(10, "Shivam", 74.4);

        Student student2 = new Student(12, "Gargi", 80.0);

        System.out.println(student.roll);

        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(student);
        studentList.add(student2);

        System.out.println(studentList.size());

        Student gargi=studentList.get(1);

        System.out.println(gargi.roll+" "+gargi.name);
        
      
        Student student3 = new Student(11, "Amit", 70.0);

        studentList.add(1, student3);

        Student gargi2=studentList.get(1);

        System.out.println(gargi2.roll+" "+gargi2.name);
        System.out.println("===========");

        for(int i=0;i<studentList.size();i++){
            
            Student obj=studentList.get(i);
            System.out.println(obj.roll+" "+obj.name);
        }

        Student st=studentList.get(2);
        st.marks=76.9;
        st.name="Gargi Singh";
        
        studentList.set(2, st);

        System.out.println("===========");

        for(Student obj:studentList){
            
            System.out.println(obj.roll+" "+obj.name);
        }
        

    }

    public void aboutStringList() {

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        System.out.println(list.size());

        list.add("ABC");
        list.add("DEF");
        list.add("MNO");
        list.add("XYZ");

        System.out.println(list.size());
        list2.add("ABC2");
        list2.add("DEF2");
        list2.add("MNO2");
        list2.add("XYZ2");

        System.out.println(list.size());

        System.out.println(list.get(1));
        System.out.println(list.get(3));

        list.add("PQR");

        System.out.println(list.size() + " " + list.get(4));

        list.set(3, "123");
        System.out.println(list.size() + " " + list.get(3));

        System.out.println("print =========");

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));

        }

        list.add(1, "Amit");

        System.out.println("add at index 1 =========");

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));

        }

        list.addAll(list2);

        System.out.println("add all list =========");

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));

        }

        System.out.println("remove element ========= " + list.size());

        list.remove(1);

        System.out.println("remove element ========= " + list.size());

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));

        }
    }

}