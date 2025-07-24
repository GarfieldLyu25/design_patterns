package pattern.Prototype;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CitationTest {
    public static void main(String[] args) throws Exception {

//        Citation c1 = new Citation();
//        c1.setName("张三");
//        //复制奖状
//        Citation c2 = c1.clone();
//        //将奖状的名字修改李四
//        c2.setName("李四");
//        c1.show();
//        c2.show();

          //浅克隆 类对象是引用 基本数据类型不同
//        Citation c1 = new Citation();
//        Student stu = new Student("张三", "西安");
//        c1.setStu(stu);
//        //复制奖状
//        Citation c2 = c1.clone();
//        //获取c2奖状所属学生对象
//        Student stu1 = c2.getStu();
//        stu1.setName("李四");
//        //判断stu对象和stu1对象是否是同一个对象
//        System.out.println("stu和stu1是同一个对象？" + (stu == stu1));
//        c1.show();
//        c2.show();

          //输入输出流
//        c1 = new Citation();
//        stu = new Student("张三", "西安");
//        c1.setStu(stu);
//        //创建对象输出流对象
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("b.txt"));
//        //将c1对象写出到文件中
//        oos.writeObject(c1);
//        oos.close();
//        //创建对象出入流对象
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("b.txt"));
//        //读取对象
//        c2 = (Citation) ois.readObject();
//        //获取c2奖状所属学生对象
//        stu1 = c2.getStu();
//        stu1.setName("李四");
//        //判断stu对象和stu1对象是否是同一个对象
//        System.out.println("stu和stu1是同一个对象？" + (stu == stu1));
//        c1.show();
//        c2.show();

        //递归克隆
        Citation c1 = new Citation();
        Student stu = new Student("张三", "西安");
        c1.setStu(stu);
        //复制奖状
        Citation c2 = c1.clone();
        //获取c2奖状所属学生对象
        Student stu1 = c2.getStu();
        stu1.setName("李四");
        //判断stu对象和stu1对象是否是同一个对象
        System.out.println("stu和stu1是同一个对象？" + (stu == stu1));
        c1.show();
        c2.show();
    }
}
