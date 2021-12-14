package detailedCar;

public class CommFact {
	String location;
	String type;
	CarFactory fact=null;
	public void buildCar(String location ,String type){
		
		if(location.equals("india")){
			 fact=new IndiaFact();
		} else {
			fact = new UsaFact();
		}
		
		fact.build(type);
	}

}

