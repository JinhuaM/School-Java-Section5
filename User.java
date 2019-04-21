package Section5_Plus;
class Vehicle{
	int power;
	double speed;
	void setPower(int newPower) {
		power=newPower;
	}
	int getPower() {
		return power;
	}
	void speedUp(double u) {
		speed=speed+u;
	}
	void speedDown(double d) {
		speed=speed-d;
	}
	double getSpeed() {
		return speed;
	}
}
public class User {
	public static void main(String[] args) {
	Vehicle car1=new Vehicle();
	Vehicle car2=new Vehicle();
	car1.setPower(120);
	car2.setPower(90);
	System.out.println("car1的功率为："+car1.getPower());
	System.out.println("car2的功率为："+car2.getPower());
	car1.speedUp(90);
	car2.speedUp(80);
	System.out.println("car1目前的速度为："+car1.getSpeed());
	System.out.println("car2目前的速度为："+car2.getSpeed());
	car1.speedUp(30);
	car2.speedDown(10);
	System.out.println("car1目前的速度为："+car1.getSpeed());
	System.out.println("car2目前的速度为："+car2.getSpeed());
  }
}