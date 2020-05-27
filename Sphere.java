public class Sphere implements Shape3D {
	private double radius;
	
	public Sphere() {
		radius = 0;
	}
	
	public Sphere(double r) {
		radius = r;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}
	
	public double getVolume() {
		return 4.0 * Math.PI * Math.pow(radius, 3) / 3.0;
	}
	
	public String toString() {
		return "The radius of this sphere = " + radius;
	}
	
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Sphere){
			Sphere sp = (Sphere) obj;
				return radius == sp.radius;
		}
		else
			 return false;
	}
}