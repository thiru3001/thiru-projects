package detailedCar;

public class MiniCar implements Car {

	String county;
	@Override
	public void build( String county ) {
		if(county.equals("india")){
		
		System.out.println("building india mini car.....");
		}else{
			System.out.println("building usa mini car.....");
		}
		
	}
	

}
