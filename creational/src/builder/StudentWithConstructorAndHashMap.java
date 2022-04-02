package builder;

import java.util.HashMap;

public class StudentWithConstructorAndHashMap {
    private String fName;
    private String lName;
    private String address;
    private String batch;
    private String something;

    StudentWithConstructorAndHashMap() {
    }

    StudentWithConstructorAndHashMap(String fName, String lName, String address, String batch, String something) {
        System.out.println(fName + lName + address + batch + something);
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.batch = batch;
        this.something = something;
        System.out.println(this.fName + this.lName + this.address + this.batch + this.something);

    }

    StudentWithConstructorAndHashMap(String fName, String lName) {
        System.out.println(this.fName + this.lName + this.address + this.batch + this.something);
    }

    StudentWithConstructorAndHashMap(HashMap<String, Object> h) throws Exception {
        String fName = (String) h.get("fName");
        String lName = (String) h.get("lName");
        String address = (String) h.get("address");

        // validation logic

        if (fName.startsWith("A")) {
            throw new Exception("Name starts with A");
        }

        this.fName = fName;

    }
//
//    public String getfName() {
//        return fName;
//    }
//
//    public void setfName(String fName) {
//        this.fName = fName;
//    }
//
//    public String getlName() {
//        return lName;
//    }
//
//    public void setlName(String lName) {
//        this.lName = lName;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getBatch() {
//        return batch;
//    }
//
//    public void setBatch(String batch) {
//        this.batch = batch;
//    }
//
//    public String getSomething() {
//        return something;
//    }
//
//    public void setSomething(String something) {
//        this.something = something;
//    }
//
}
