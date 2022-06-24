
public class Ball {
	private float x;
	private float y;
	private float xDelta;
	private float yDelta;
	private int radius;
	private int number;

	
	
	public Ball(float x, float y,  int radius,float xDelta, float yDelta) {
		super();
		this.x = x;
		this.y = y;
		this.xDelta = xDelta;
		this.yDelta = yDelta;
		this.radius = radius;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float getxDelta() {
		return xDelta;
	}
	public void setxDelta(float xDelta) {
		this.xDelta = xDelta;
	}
	public float getyDelta() {
		return yDelta;
	}
	public void setyDelta(float yDelta) {
		this.yDelta = yDelta;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void move() {
		this.x += xDelta;
		this.y += yDelta;

	}
	
	public void reflectHorizontal() {
		this.xDelta = -xDelta;

	}
	
	public void reflectVertical() {
		this.yDelta = -yDelta;

	}
	@Override
	public String toString() {
		return "Ball [(" + x + " ,"+  y+"), speed =  (" + xDelta + " ,"+  yDelta+")]";
	}

}
