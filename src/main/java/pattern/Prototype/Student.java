package pattern.Prototype;

import java.io.Serializable;

public class Student implements Serializable,Cloneable{
    private String name;
    private String address;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
