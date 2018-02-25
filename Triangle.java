//@code contributor: Mohammad J. Nourbakhsh
import java.util.Scanner;

public class Triangle extends GeometricObject {
	Scanner inp = new Scanner(System.in);
	private double side1,side2,side3,sumSides,area;
	private boolean flag = true;
    public Triangle(boolean filled) {
    	super();
    	super.setFilled(filled);
    	System.out.println("Enter the color of the Triangle: ");
    	super.setColor(inp.next());
    	System.out.println("Enter whether you want to fill the Triangle or not(y or n): ");
    	if(inp.next().equalsIgnoreCase("y")){
    		super.setFilled(true);
    	}
    	
		System.out.println("Enter the first side of the Triangle: ");
		side1 = inp.nextDouble();
		System.out.println("Enter the second side of the Triangle: ");
		side2 = inp.nextDouble();
		System.out.println("Enter the third side of the Triangle: ");
		side3 = inp.nextDouble();
		sumSides = side1+side2+side3;
		area = getArea();
		if(!(area > 0) ) {
			flag = false;
			System.out.println("Cannot make Triangle with these three numbers :D");
		}
	}
	
	
	@Override
	public double getPerimeter() {
		if(flag) return (sumSides);
		else return -1;
	}

	@Override
	public double getArea() {
		if(flag) return (Math.sqrt(((sumSides/2))*((sumSides/2)-side1)*((sumSides/2)-side2)*((sumSides/2)-side3)));
		else return -1;
	}
	
	public String toString(){
		if(flag)return super.toString()+"\nPerimeter = "+getPerimeter()+"\nArea = "+getArea();
		else return "Try other numbers for the Sides";
	}
	

}
