package Bridge;

public class Main {
    public static void main(String[] args) {
       Video youtubeVideo = new YoutubeVideo(new HDProcessor());
       youtubeVideo.play("video.mp4");

       Video netflixVideo = new NetflixVideo(new FourKProcessor());
       netflixVideo.play("netflix_video.mp4");
    }
}
