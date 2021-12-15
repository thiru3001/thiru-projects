package detailedCar;

public class UsaFact implements CarFactory {
//	String location;//USA
//	String type;
	@Override
	public void build(String type){
		switch(type){
		case "mini":Car car=new MiniCar();
		car.build("usa");
		break;
		case "medium":Car car2=new MediumCar();
		car2.build("usa");
		break;
		case "laxurya": Car car3=new LaxuryCar();
		car3.build("usa");
		}

}
	
}
