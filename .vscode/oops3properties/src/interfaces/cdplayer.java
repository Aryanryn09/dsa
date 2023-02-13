package interfaces;

public class cdplayer implements media {
    @Override
    public void start() {
        System.out.println("media started");
    }

    @Override
    public void stop() {
        System.out.println("media stopped");

    }
}
