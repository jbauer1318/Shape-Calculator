
	public class Cylinder extends CircularShapeWithHeight {
		
	public Cylinder() {
	super();
	}
	
	public Cylinder(double radius, double height) {
	super(radius, height);
	}
	
	public double getArea() {
	return getCrossSectionPerimeter() * getHeight() + 2 * getCrossSectionArea();
	}
	
	public double getVolume() {
	return getCrossSectionArea() * getHeight();
	}
	
	public String toString() {
	return super.toString();
	}
	
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Cylinder){
			Cylinder cyl = (Cylinder) obj;
				return super.equals(cyl);
		}
		else
			 return false;
		}
	
}

