package week1.day1;

public class Mobile {
 private void makeCall() {
	String mobileModel= "Redmi";
	float mobileWeight= 20f;
	System.out.println("Mobile model:"+mobileModel);
	System.out.println("Mobile Weight:"+mobileWeight+"g");

}
 private void sendMsg() {
boolean isFullCharged= true;
int mobileCost= 20000;
System.out.println("Is Mobile is fully charged:"+isFullCharged);
System.out.println("Mobile Cost:Rs."+mobileCost);
}
		public static void main(String[] args) {
		Mobile obj=new Mobile();
System.out.println("This is my mobile");
obj.makeCall();
obj.sendMsg();
	}
}
