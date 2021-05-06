
public class TriangleExam {

	public static void main(String[] args) {	
		
		Triangle Tri = new Triangle(10.2,17.3);
		
		System.out.println("삼각형 1의 넓이 : " + Tri.Area());	
		
		Tri.CValues(7.5,9.2);
		
		System.out.print("삼각형 2의 넓이 : " + Tri.Area());
	}
}

class Triangle{
	public double Base;
	public double Height;
	
	public Triangle(double Base,double Height){
		this.Base = Base;
		this.Height = Height;
	}
	
	public double Area(){
		return (Base*Height)/2;
	}
	
	public void CValues(double Base,double Height) {
		this.Base = Base;
		this.Height = Height;
	}
}
