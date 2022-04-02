package builder;

import java.util.Arrays;
import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        StudentWithConstructorAndHashMap s = new StudentWithConstructorAndHashMap();
//        s.setAddress("addr");

        StudentWithConstructorAndHashMap a = new StudentWithConstructorAndHashMap("a", "b", "c", "d", "e");

        HashMap<String, Object> h = new HashMap<>();
        // Exception - starts with A.
         h.put("fName", "AParth");
//        h.put("fName", "Parth");

        StudentWithConstructorAndHashMap c;

        try {
            c = new StudentWithConstructorAndHashMap(h);
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Exception: " + Arrays.toString(e.getStackTrace()));
        }


        Student newStudent = Student.getBuilder().setAddress("abc").setAge(10).setBatch("january").setName("parth").build();
//        NewStudent.Builder builder = new NewStudent.Builder()
//                .setAddress("abs")
//                .setAge(10)
//                .setBatch("January");


    }
}
