
	public class CircularCone extends CircularShapeWithHeight {
		
		public CircularCone() {
		super();
		}
		
		public CircularCone(double radius, double height) {
		super(radius, height);
		}
		
		public double getArea() {
		double r = getRadius();
		double h = getHeight();
		return Math.PI * r * Math.sqrt(r * r + h * h);
		}
		
		public double getVolume() {
		return getCrossSectionArea() * getHeight() / 3.0;
		}
		
		public String toString() {
			return super.toString();
		}
		
		public boolean equals(Object obj) {
			if (obj != null && obj instanceof CircularCone){
				CircularCone cir = (CircularCone) obj;
					return super.equals(cir);
			}
			else
				 return false;
			}
	}
		

