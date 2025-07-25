package pattern.Bridge;

public class REVBBFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("REVBBFile.decode" + fileName);
    }
}
