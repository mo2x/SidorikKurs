package EventListeners;

/**
 * поток, который следит за прошествием 60 секунд в {@link windows.SplashFrame}
 * @author Borodovsky A.A
 * @version 1.0
 */
public class ActivityListener implements Runnable {

    private boolean isActive;

    public void disable(){
        isActive=false;
    }

    public ActivityListener(){
        isActive = true;
    }

    public void run(){
        try {
            Thread.sleep(60000);
            if (isActive)
                System.exit(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}