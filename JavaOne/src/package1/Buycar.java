package package1;
class Car{ // Basic Car class 
	int capacity;		// takes capacity input
	double mileage;		// takes mileage input
	double kms;			//gives no of kms=capacity*mileage
	double noofkms1(){
		kms= capacity*mileage;
		return kms;
	}
	double noofkms1(int a,double b){
	capacity=a;
	mileage=b;
	kms= capacity*mileage;
	return kms;
		
	}
	Car(){
		capacity=15;
		mileage=20;		
	}
	Car(int a,double b){
	capacity=a;
	mileage=b;
	kms= capacity*mileage;
	//return kms; 
	}
}
public class Buycar {

	public static void main(String[] args) {
	
		Car model1=new Car();
		model1.noofkms1();
		System.out.println("no of kms= "+model1.kms);
		Car model2=new Car();
		model2.noofkms1(30,5);
		System.out.println("no of kms= "+model2.kms);
		Car model3=new Car(15,15);
		System.out.println("no of kms= "+model3.kms);
	}

}
