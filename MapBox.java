import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MapBox {
	
	private double Westmost;
	private double Eastmost;
	private double Southmost;
	private double Northmost;
	
	public Location locations; //needs to hold list of object type Location

	public void Mapbox() { //default constructor that allocates storage
		
	}
	
	public double Westmost() { //returns min x-axis coor
		return Westmost;
	}
	public double Eastmost() { //return max x-axis coor
		return Eastmost;
	}
	public double Southmost() { //return min y-axis coor
		return Southmost;
	}
	public double Northmost() { //return max y-axis coor
		return Northmost;
	}
	
	
	public boolean recordLocation(Location loc) { 
		//add loc to locations list, if & only if the given loc obj does not have the same name as prev loc objs
		
		List<Location> list = new ArrayList<Location>(); //creates the list
		Set<Location> set = new HashSet<Location>(list); //source is: https://stackoverflow.com/questions/562894/java-detect-duplicates-in-arraylist
		
		//this will check for the duplicates
		if(set.size() < list.size() ) { //source: https://javarevisited.blogspot.com/2012/02/how-to-check-or-detect-duplicate.html
			return true;
		}
		
		return false;
		

	}
	
}