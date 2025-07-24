package pattern.Prototype;

import java.io.Serializable;

public class Citation implements Cloneable,Serializable {
    private Student stu;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

//    void show() {
//        System.out.println(getName() + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
//    }

    void show() {
        System.out.println(stu.getName() + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        Citation cloned = (Citation) super.clone();

        // 深拷贝：递归克隆Student对象
        cloned.stu = (Student) this.stu.clone();

        return cloned;
    }
}
