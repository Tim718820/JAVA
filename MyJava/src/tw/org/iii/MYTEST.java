package tw.org.iii;


	class Car{
		double gas;
		double eff;
		
		void printState(){
			System.out.print("目前載油量為");
			System.out.print(gas + "公升");
			System.out.print("耗油量為每公升跑");
			System.out.println(eff + "公里");
		}
		double move(double distance){
			if (gas >= distance/eff){
				gas -= distance/eff;
				return distance;
			}else{
				distance = gas*eff;
				gas = 0;
				return distance;
			}
		}
	}
	public class MYTEST {
	public static void main(String[] args) {
		Car oldcar = new Car();
		
		oldcar.gas=100;
		oldcar.eff=10;
		
		System.out.print("老爺車oldcar");
		//System.out.println("行駛了" + oldcar.move(50) + "公里");
		//System.out.println("行駛了" + oldcar.move(500) + "公里");
		System.out.println("行駛了" + oldcar.move(5000) + "公里");
		oldcar.printState();
		
		
		
		
	}

}
