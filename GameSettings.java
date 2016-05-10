
public class GameSettings {
	
	  public static void initGame() {

		    // Initialize game data and sprites.

		    int score = 0;
		    int shipsLeft = Asteroids.MAX_SHIPS;
		    double asteroidsSpeed = Asteroids.MIN_ROCK_SPEED;
		    int newShipScore = Asteroids.NEW_SHIP_POINTS;
		    int newUfoScore = Asteroids.NEW_UFO_POINTS;
		    //initShip();
		    //initPhotons();
		    //stopUfo();
		    //stopMissle();
		    //initAsteroids();
		    //initExplosions();
		    boolean playing = true;
		    boolean paused = false;
		    long photonTime = System.currentTimeMillis();
		  }

		  public static void endGame() {

		    // Stop ship, flying saucer, guided missle and associated sounds.

		    boolean playing = false;
		    //stopShip();
		    //stopUfo();
		    //stopMissle();
		  }

		  public void start() {

//		    if (loopThread == null) {
//		      loopThread = new Thread(this);
//		      loopThread.start();
//		    }
//		    if (!loaded && loadThread == null) {
//		      loadThread = new Thread(this);
//		      loadThread.start();
//		    }
		  }

		  public void stop() {

//		    if (loopThread != null) {
//		      loopThread.stop();
//		      loopThread = null;
//		    }
//		    if (loadThread != null) {
//		      loadThread.stop();
//		      loadThread = null;
//		    }
		  }


}
