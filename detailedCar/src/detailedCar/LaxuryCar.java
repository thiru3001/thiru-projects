package detailedCar;

public class LaxuryCar implements Car {

	
	public void build(String county) {
		if(county.equals("india")){
			
			System.out.println("building india laxury car.....");
			}else{
				System.out.println("building usa laxury car.....");
			}
	}

}
