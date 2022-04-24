package dimensions;

public class vehicle {
	@SuppressWarnings("static-access")
	public String Generatevehicle(){
		data d = new data();
		randomiser r = new randomiser();
		
		return(r.randomise(d.vehicles()));//return a randomised vehicle
	}
}
