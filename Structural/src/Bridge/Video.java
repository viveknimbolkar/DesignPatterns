package Bridge;

public abstract class Video {
    protected VideoProcessor processor;
    public Video(VideoProcessor videoProcessor){
        this.processor = videoProcessor;
    }
    public abstract void play(String videoFile);
    
}
