package com.gqt.gqtcorejava.abstraction;

abstract class Plane{
	
	abstract void takeOff() ;

	abstract void fly(); 

	void land() {
		System.out.println("Plane is Landing");
	}
	
	
}
abstract class CargoPlane1 extends Plane{
	
	void carryGoods() {
		System.out.println("Cargo Plane is carry Goods");
	}
	
}
class CargoPlane extends Plane{
	@Override
	void takeOff() {
		System.out.println("Cargo Plane is Took Off");
	}
	
	
    @Override
	void fly() {
		System.out.println("Cargo Plane is flying at Lower heights");
	}

	void carryGoods() {
		System.out.println("Cargo Plane is carry Goods");
	}
	
	
}
class PassengerPlane extends Plane{
	@Override
	void takeOff() {
		System.out.println("Passenger  Plane is Took Off");
	}
	
	@Override

	void fly() {
		System.out.println("Passenger Plane is flying at medium heights");
	}

	void carryPassengers() {
		System.out.println("Passenger Plane is carry Passengers");
	}
	
	
}
class FighterPlane extends Plane{
	@Override
	void takeOff() {
		System.out.println("Fighter   Plane is Took Off");
	}
	@Override

	void fly() {
		System.out.println("FighterPlane is flying at great heights");
	}

	void carryWepons() {
		System.out.println("FighterPlane is carry Wepons");
	}
	
	
}
class Airport{
	void permit(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}


public class Abstract1 {

	public static void main(String[] args) {
		
		Plane ref = new Plane() {
			
			@Override
			void takeOff() {
				System.out.println("Plane is Took Off");
				
			}
			
			@Override
			void fly() {
				System.out.println("Plane is Flying");
				
			}
		};
		System.out.println(ref);
        ref.takeOff();
        ref.fly();
        ref.land();
        System.out.println("-------------------");
        Plane ref2=ref;
        System.out.println(ref2);
        ref2.takeOff();
        ref2.fly();
        ref2.land();
        
        CargoPlane cp=new CargoPlane();
		PassengerPlane pp =new PassengerPlane();
		FighterPlane fp =new FighterPlane();
		Airport ap=new Airport();
        System.out.println("------CargoPlane------");
		
		ap.permit(cp);
		cp.carryGoods();
		System.out.println("-----------------------");

		System.out.println("------PassengerPlane------");
		ap.permit(pp);
		pp.carryPassengers();
		System.out.println("-----------------------");
		
		System.out.println("------FighterPlne------");
		ap.permit(fp);
		fp.carryWepons();
		
		
		
		
		
		
		
		

	}

}
