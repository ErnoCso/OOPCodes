
class Sphere {
	
	double diameter;
    
    public Sphere(double diameter) {
    	this.diameter = diameter;
    }
    
    public double getDiameter() {
    	return diameter;
    }
    
    public void setDiameter(double diameter) {
    	this.diameter = diameter;
    }
    
    public double Volume() {
    	double radius = diameter / 2;
    	return ((4 * (Math.PI * (Math.pow(radius, 3))))/3);
    	
    }
    
    public double Surface() {
    	double radius = diameter / 2;
    	return (4 * (Math.PI * (Math.pow(radius, 2))));
    	
    }

    public String toString() {
    	return "\nDiameter: " + diameter;
    }
    
}
