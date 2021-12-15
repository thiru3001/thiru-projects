package detailedCar;

public class IndiaFact implements CarFactory {
	//String type;//
	@Override
	public void build(String type){
	
		switch(type){
	    case "mini":Car car=new MiniCar();
		car.build("india");
		break;
		case "mediuam":Car car2=new MediumCar();
		car2.build("india");
		break;
    	case "laxurya": Car car3=new LaxuryCar();
		car3.build("india");
		}
		
		
	}
	

}
