package tw.org.iii;


	class Car{
		double gas;
		double eff;
		
		void printState(){
			System.out.print("�ثe���o�q��");
			System.out.print(gas + "����");
			System.out.print("�Ӫo�q���C���ɶ]");
			System.out.println(eff + "����");
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
		
		System.out.print("�ѷݨ�oldcar");
		//System.out.println("��p�F" + oldcar.move(50) + "����");
		//System.out.println("��p�F" + oldcar.move(500) + "����");
		System.out.println("��p�F" + oldcar.move(5000) + "����");
		oldcar.printState();
		
		
		
		
	}

}
