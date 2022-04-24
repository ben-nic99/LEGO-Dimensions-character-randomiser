package dimensions;

public class World {
	
	
	@SuppressWarnings("static-access")
	public String Generateworld(){
		data d = new data();
		randomiser r = new randomiser();
		
		return(r.randomise(d.worlds()));//return a randomised world
	}
}
