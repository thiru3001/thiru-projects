package detailedCar;

public class MediumCar implements Car {

	@Override
	public void build(String county) {
		if(county.equals("india")){
			
			System.out.println("building india medium car.....");
			}else{
				System.out.println("building usa medium car.....");
			}
		

		
	}

}
