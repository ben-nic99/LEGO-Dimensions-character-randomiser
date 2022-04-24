package dimensions;

import java.util.ArrayList;
public class figure {
	private String figure;

	
	public figure(String world){  //constructor with world called if team leader
		data d = new data();
		ArrayList<String> fig = (d.figs().get(world));		//get the list of figures from the chosen world
		
		figure = randomiser.randomise(fig);
		
	}
	
	public figure(){ //empty constructor for team members that could be from any franchise
		
		data d = new data();
		
		ArrayList<String> allFigs = new ArrayList<String>();
		
		for (int i = 0; i < (d.worlds().size()); i++){		//go through the map of worlds compiling a full list of all figures
			allFigs.addAll(d.figs().get(d.worlds().get(i)));
		}

			figure = randomiser.randomise(allFigs);

	}
	
	public void rerandomise(){  //method to re randomise outside constructor if duplicate figure is chosen
		data d = new data();
		
		ArrayList<String> allFigs = new ArrayList<String>();
		
		for (int i = 0; i < (d.worlds().size()); i++){
			allFigs.addAll(d.figs().get(d.worlds().get(i)));
		}
		
		figure = randomiser.randomise(allFigs);
		
	}
	
	public String getFig(){
		return figure;
	}
}
