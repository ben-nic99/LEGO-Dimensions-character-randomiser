package dimensions;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class data {
	
	
	public ArrayList<String> worlds(){
		ArrayList<String> worldList = new ArrayList<String>( Arrays.asList(
				"Back_To_The_Future",
				"Portal",
				"Simpsons", 
				"Jurassic_World",
				"Scooby_Doo",
				"DC", 
				"Lego_Movie",
				"Ninjago",
				"Lord_Of_The_Rings",
				"Chima",
				"Wizard_Of_Oz",
				"Dr_Who",
				"Ghostbusters(original)",
				"Ghostbusters(2016)",
				"Sonic",
				"Adventure_Time",
				"Harry_Potter",
				"Mission_Impossible",
				"A-Team",
				"Fantastic_Beasts",
				"Gremlins",
				"Lego_Batman_Movie",
				"E.T",
				"Goonies",
				"Knight_Rider",
				"Beetlejuice",
				"Lego_City",
				"Power_Puff_Girls"
				,
				"Teen_Titans_Go"
				) );
		return worldList;
	}
	
	public Map<String, ArrayList<String>> figs(){	
		Map<String, ArrayList<String>> worlds = new HashMap<>();
		
		
		ArrayList<String> bttf = new ArrayList<String> (Arrays.asList("Marty", "Doc"));
		worlds.put("Back_To_The_Future", bttf);
		
		ArrayList<String> portal = new ArrayList<String> (Arrays.asList("Chell"));
		worlds.put("Portal", portal);
		
		ArrayList<String> simpson = new ArrayList<String> (Arrays.asList("Homer"));
		worlds.put("Simpsons", simpson);
		
		ArrayList<String> jurworld = new ArrayList<String> (Arrays.asList("Owen"));
		worlds.put("Jurassic_World", jurworld);
		
		ArrayList<String> scoob = new ArrayList<String> (Arrays.asList("Scooby_Doo", "Shaggy"));
		worlds.put("Scooby_Doo", scoob);
		
		ArrayList<String> DC = new ArrayList<String> (Arrays.asList("Batman", "Superman", "Aquaman", "Wonder_Woman", "Green_Arrow"));
		worlds.put("DC", DC);
		
		ArrayList<String> lmovie = new ArrayList<String> (Arrays.asList("Emmet", "Wyldstyle", "Benny", "Unikitty"));
		worlds.put("Lego_Movie", lmovie);
		
		ArrayList<String> ninja = new ArrayList<String> (Arrays.asList("Jay", "Zane", "Kai", "Cole", "Nya"));
		worlds.put("Ninjago", ninja);
		
		ArrayList<String> lotr = new ArrayList<String> (Arrays.asList("Gandalf", "Legolas", "Gimli", "Gollum"));
		worlds.put("Lord_Of_The_Rings", lotr);
		
		ArrayList<String> chima = new ArrayList<String> (Arrays.asList("Cragger"));
		worlds.put("Chima", chima);
		
		ArrayList<String> oz = new ArrayList<String> (Arrays.asList("Wicked_Witch"));
		worlds.put("Wizard_Of_Oz", oz);
		
		ArrayList<String> dr = new ArrayList<String> (Arrays.asList("The_Doctor", "Cyberman"));
		worlds.put("Dr_Who", dr);
		
		ArrayList<String> ghost = new ArrayList<String> (Arrays.asList("Venkman", "Slimer"));
		worlds.put("Ghostbusters(original)", ghost);
		
		ArrayList<String> ghost16 = new ArrayList<String> (Arrays.asList("Yates"));
		worlds.put("Ghostbusters(2016)", ghost16);
		
		ArrayList<String> sonic = new ArrayList<String> (Arrays.asList("Sonic"));
		worlds.put("Sonic", sonic);
		
		ArrayList<String> atime = new ArrayList<String> (Arrays.asList("Finn"));
		worlds.put("Adventure_Time", atime);
		
		ArrayList<String> hp = new ArrayList<String> (Arrays.asList("Harry_Potter", "Voldermort", "Hermione_Granger"));
		worlds.put("Harry_Potter", hp);
		
		ArrayList<String> mi = new ArrayList<String> (Arrays.asList("Ethan_Hunt"));
		worlds.put("Mission_Impossible", mi);
		
		ArrayList<String> ateam = new ArrayList<String> (Arrays.asList("B.A"));
		worlds.put("A-Team", ateam);
		
		ArrayList<String> fb = new ArrayList<String> (Arrays.asList("Newt_Scamander", "Tina_Goldstein"));
		worlds.put("Fantastic_Beasts", fb);
		
		ArrayList<String> grem = new ArrayList<String> (Arrays.asList("Gizmo", "Stripe"));
		worlds.put("Gremlins", grem);
		
		ArrayList<String> lbm = new ArrayList<String> (Arrays.asList("Robin", "Batgirl"));
		worlds.put("Lego_Batman_Movie", lbm);
		
		ArrayList<String> et = new ArrayList<String> (Arrays.asList("E.T"));
		worlds.put("E.T", et);
		
		ArrayList<String> goonie = new ArrayList<String> (Arrays.asList("Sloth"));
		worlds.put("Goonies", goonie);
		
		ArrayList<String> KR = new ArrayList<String> (Arrays.asList("Michal_Knight"));
		worlds.put("Knight_Rider", KR);
		
		ArrayList<String> BJ = new ArrayList<String> (Arrays.asList("Beetlejuice"));
		worlds.put("Beetlejuice", BJ);
		
		ArrayList<String> LC = new ArrayList<String> (Arrays.asList("Chase_McCain"));
		worlds.put("Lego_City", LC);
		
		ArrayList<String> PPG = new ArrayList<String> (Arrays.asList("PPG"));
		worlds.put("Power_Puff_Girls", PPG);
		
		ArrayList<String> TTG = new ArrayList<String> (Arrays.asList("StarFire"));
		worlds.put("Teen_Titans_Go", TTG);
		
		return worlds;
	}
	
	public ArrayList<String> vehicles(){
		ArrayList<String> vehList = new ArrayList<String>( Arrays.asList("DeLorian", "Hoverboard", "Sentry_Turret", "Blue", "Mystery_Machine", "Invisible_Jet", "Construct-o-Mech", "SPACESHIP!", "Storm_Fighter", "Shelob", "Arrow_Launcher", "Axe_Chariot", "Swamp_Skimmer", "TARDIS", "K-9", "Time_Traveling_Train", "Dalek", "Hover_Pod", "Aqua-Craft", "Batmobile", "Weesly_Car", "Hogwarts_Express", "IMF_Bike", "IMF_Car", "A-Team_Van", "Niffler", "RC_Racer", "Camera", "Phone_Home", "Batwing", "One_Eyed_Willy_Pirate_Ship", "KITT", "Police_Copter", "Fire_Bike", "Samurai_X_Mech") );
		return vehList;
	}
	
}
