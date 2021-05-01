/**
 * 
 */

/**
 * @author erik
 *
 */
public class Car extends Vehicle implements iVehiculo{

	private String modelName;    // Car attribute
	
	/**
	 * 
	 */
	public Car() {
		modelName = "Mustang";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a myCar object
	    Car myCar = new Car();

	    // Call the honk() method (from the Vehicle class) on the myCar object
	    myCar.honk();

	    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
	    System.out.println(myCar.brand + " " + myCar.modelName);

	}
	
	/*public void honk() { // Vehicle method
		System.out.println("Piiii Piiii!!!!!");
	}*/
	
	public void acelerar() {
		System.out.println("Ruuuunnnnnn...!");
		
	}

	public void frenar() {
		System.out.println("Scrashhhhhhhhhhhh...!");
		
	}

	public void brincar() {
		System.out.println("brinca brinca...!");
		
	}
}
