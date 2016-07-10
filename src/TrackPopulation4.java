public class TrackPopulation4 {

	public static void main(String[] args) {
		City smackoverAR = new City();
		smackoverAR.population = 2332;
		smackoverAR = doBirth(smackoverAR);
		System.out.println(smackoverAR.population);
		
	}
	static City doBirth (City aCity){
		City myCity = new City();
		myCity.population = aCity.population + 1;
		return myCity;
	}

}
