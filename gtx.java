public class Cylinder extends Shape {
	float radius;
	float hight;
	
Cylinder(String n, float r, float h){
	name=n; radius=r; hight=h;
}

void Showarea(){
	System.out.println(2*3.1416*hight*radius+2*3.1416*radius*radius);
}

	public static void main(String[] args) {
		

	}

}