package pattern.Bridge;

public class AVIFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("AVI file decoded" + fileName);
    }
}
