package interfaces;

public class nicecar {

    private final engine eng;
    private media mediaplayer;

    public nicecar() {
        eng = new poweren();
        mediaplayer = new cdplayer();
    }

    public nicecar(engine eng) {
        this.eng = eng;
    }


    public void start() {
        eng.start();
    }

    public void stop() {
        eng.stop();
    }

    public void startmusic() {
        mediaplayer.start();
    }

    public void ubgradeeng() {
        eng.start();
    }
}

