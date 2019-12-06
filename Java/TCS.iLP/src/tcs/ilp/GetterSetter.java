package tcs.ilp;

public class GetterSetter{
	private int speed;
	private int power;
	private String Name=new String();
   public void setter(int speed,int power,String Name) {
	   this.speed=speed;
	   this.power=power;
	   this.Name=Name;
   }
   public void getter() {
	   System.out.println("The speed is ->"+speed);
	   System.out.println("The power is ->"+power);
	   System.out.println("the Name is -> "+Name);
	   
	   
   }

}
