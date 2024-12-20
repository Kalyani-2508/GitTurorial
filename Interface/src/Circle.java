public class Circle extends Shape
{
	double calculateArea(double radius)
	{
		return (3.14 * radius * radius); 
	}
	
	double calculatePerimeter(double radius)
	{
		return (2 * 3.14 * radius);
	}
}