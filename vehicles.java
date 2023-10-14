package fall23;
/* StdName: MD WAHIDUL ALAM
Id: 4558016
*/
class sportvehicles{
	String manufecturer;
}

class SUV extends sportvehicles
{
int passengercount;
}

class Sedan extends sportvehicles
{
String model;
}

public class vehicles {
	 public static void main(String[] args) {
	        SUV  z = new SUV();
	        z.manufecturer= "Toyota";
	        z.passengercount=5;
	        System.out.println("SUV Details");
	        System.out.println("...........");
	        System.out.println("The manufecturer is "+ z.manufecturer);
	        System.out.println("Total passenger is "+ z.passengercount);
	        System.out.println("");
	        Sedan x = new Sedan();
	        x.manufecturer="Ford";
	        x.model="Mustang";
	        System.out.println("Sedan Details");
	        System.out.println("...........");
	        System.out.println("The manufecturer is "+ x.manufecturer);
	        System.out.println("The model is "+ x.model);
}
}