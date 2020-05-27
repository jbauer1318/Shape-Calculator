
public abstract class CircularShapeWithHeight extends CircularShape {
	
		private double height;
		
		public CircularShapeWithHeight() {
		super();
		height = 0;
		}
		
		public CircularShapeWithHeight(double radius, double height) {
		super(radius, height);
		}
		
		public double getHeight() {
		return height;
		}
	}

