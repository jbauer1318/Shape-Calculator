public class SquarePyramid implements Shape3D {
	
		private double length;
		private double height;
		
		public SquarePyramid() {
		length = 0;
		height = 0;
		}
		
		public SquarePyramid(double l, double h) {
			length = l;
			height = h;
		}
		
		public double getLength() {
			return length;
		}
		
		public double getHeight() {
			return height;
		}
		
		public double getArea() {
		return length * (length + Math.sqrt(length * length + 4 * height * height));
		}
		
		public double getVolume() {
		return length * length * height / 3.0;
		}
		
		public String toString() {
		return "For this square pyramid the base has the length = " + length + " and the height = " + height;
		}
		
		public boolean equals(Object obj) {
			if (obj != null && obj instanceof SquarePyramid){
				SquarePyramid sp = (SquarePyramid) obj;
					return length == sp.length && height == sp.height;
			}
			else
				 return false;
		}
	}
		
	

