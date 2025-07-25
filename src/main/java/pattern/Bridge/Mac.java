package pattern.Bridge;

public class Mac extends OperatingSystemVersion{
    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }
}
