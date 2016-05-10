import java.awt.Polygon;

class Thruster {


	// Fields:

	int width;          // Dimensions of the graphics area.
	int height;

	Polygon shape;             // Base sprite shape, centered at the origin (0,0).
	boolean active;            // Active flag.
	double  angle;             // Current angle of rotation.
	double  deltaAngle;        // Amount to change the rotation angle.
	double  x, y;              // Current position on screen.
	double  deltaX, deltaY;    // Amount to change the screen position.
	Polygon thruster;            // Final location and shape of sprite after
	// applying rotation and translation to get screen
	// position. Used for drawing on the screen and in
	// detecting collisions.


	// Create shapes for the ship thrusters.

	// Constructors:

	public Thruster() {
		this.shape = new Polygon();
		this.active = false;
		this.angle = 0.0;
		this.deltaAngle = 0.0;
		this.x = 0.0;
		this.y = 0.0;
		this.deltaX = 0.0;
		this.deltaY = 0.0;
		this.thruster = new Polygon();
	}

	public void createThruster() {
		//
	}
}
