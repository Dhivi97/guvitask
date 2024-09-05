package Task10;

public class Circumstances {

	public static void main(String[] args) {
	}

		private double radius;
		public Circumstances(double raduis) {
			this.radius=radius;
		}
		public double getRadius() {
			return radius;
		}
		public void setRadius(double radius) {
			this.radius=radius;
		}
		public double getCircumference() {
			radius=2*Math.PI*radius;
			return radius;
		}

	}