package day17_20th_june;

interface Playable {
    void play();
    void pause();
    void stop();
}

class MusicPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Music is playing.");
    }

    @Override
    public void pause() {
        System.out.println("Music is paused.");
    }

    @Override
    public void stop() {
        System.out.println("Music is stopped.");
    }
}

class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Video is playing.");
    }

    @Override
    public void pause() {
        System.out.println("Video is paused.");
    }

    @Override
    public void stop() {
        System.out.println("Video is stopped.");
    }
}



public class Main {
	public static void main(String[] args) {
        Playable[] playables = {
            new MusicPlayer(),
            new VideoPlayer()
        };

        for (Playable playable : playables) {
            playable.play();
            playable.pause();
            playable.stop();
        }
    }

}
