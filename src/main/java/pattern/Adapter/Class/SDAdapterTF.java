package pattern.Adapter.Class;

public class SDAdapterTF extends TFCardImpl implements SDCard {

    //实现了sd的方法,数据来源tf，做了数据转换
    public String readSD() {
        System.out.println("adapter read tf card ");
        return readTF();
    }

    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}
