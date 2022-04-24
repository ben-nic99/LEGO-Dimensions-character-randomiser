package dimensions;
import java.util.*;

public class team {
	
	
	public static void main(String[] args) {
		World w = new World();//generate a world
		
		ArrayList<String> blist = new ArrayList<String>(); //set up blacklist to avoid duplicate team members
		String world = w.Generateworld();							//convert world to string
		System.out.println("World: " + world);				//output world
		System.out.println("-------------------------");
		figure tl = new figure(world);						//specify team leader must be from chosen world
		blist.add(tl.getFig());								//add team leader to black list so not chosen again
		System.out.println("Team Leader : " + tl.getFig());
		
		
		for(int i =0; i<2;i++){								//loop for two more team members
			figure member = new figure();					//generate team member
			while(blist.contains(member.getFig())){			//if figure already chosen, choose again
															//looped to keep choosing until non duplicate member
					member.rerandomise();
					
			}
			blist.add(member.getFig());						//once figure selected, add to blacklist
			
			System.out.println("Team Member " + (i+1) + " : " + member.getFig());
			
			
		}
		System.out.println("-------------------------");
		
		vehicle v = new vehicle();							//randomise vehicle
		System.out.println("Vehicle : " + v.Generatevehicle());
	}

}
