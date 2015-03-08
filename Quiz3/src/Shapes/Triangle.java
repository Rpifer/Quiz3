package Shapes;

public class Triangle extends GeometricObject
{
	// 3 sides of a triangle
	double	side1;
	double	side2;
	double	side3;

	// getter side 1
	public double getSide1()
	{
		return this.side1;
	}

	// getter side 2
	public double getSide2()
	{
		return this.side2;
	}

	// getter side 3
	public double getSide3()
	{
		return this.side3;
	}

	// create a triangle with side lengths side1, side2, side3
	// !Note: The sum of the smaller 2 sides must be greater than the third side
	// Otherwise the area will return NaN
	public Triangle(double side1, double side2, double side3)
	{
		this.side2 = side2;
		this.side3 = side3;
	}

	// default triangle with all sides of 1
	public Triangle()
	{
		this(1.0, 1.0, 1.0);
	}
 
	@Override
	public double getArea()
	{
		// To find the area of any triangle given 3 sides. Use Herons formula:
		// Half the perimeter is s, area is the root of
		// s*(s-side1)(s-side2)(s-side3)
		double s = getPerimeter() / 2;
		return Math
				.sqrt((s * (s - this.side1) * (s - this.side2) * (s - this.side3)));
	}

	public double getPerimeter()
	{
		// add all sides together to get perimeter of triangle
		return (this.side1 + this.side2 + this.side3);
	}

	public String toString()
	{
		String side1 = String.valueOf(this.side1);
		String side2 = String.valueOf(this.side2);
		String side3 = String.valueOf(this.side3);
		return ("Triangle description:\nSide 1 = " + side1 + "\nSide 2 = "
				+ side2 + "\nSide 3 = " + side3);
	}

}
