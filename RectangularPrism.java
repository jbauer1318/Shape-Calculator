
public class RectangularPrism implements Shape3D {
	
		private double length;
		private double width;
		private double height;
		
		public RectangularPrism() {
		length = 0;
		width = 0;
		height = 0;
		}
		
		public RectangularPrism(double l, double w, double h) {
		length = l;
		width = w;
		height = h;
		}
		
		public double getLength() {
			return length;
		}
		
		public double getWidth() {
			return width;
		}
		
		public double getHeight() {
			return height;
		}
		
		public double getArea() {
		return 2 * (length * width + width * height + length * height);
		}
		
		public double getVolume() {
		return length * width * height;
		}
		
		public String toString() {
		return "For this rectangular prism the base has the length = " + length + " and the width = " + width + ". The height of the prism = " + height;
		}
		
		public boolean equals(Object obj) {
				if (obj != null && obj instanceof RectangularPrism){
					RectangularPrism rp = (RectangularPrism) obj;
						return length == rp.length && width == rp.width && height == rp.height;
				}
				else
					 return false;
			}
	}
	

