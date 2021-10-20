public class StatsDriver {
	public static void main(String[] args){
		Stats math= new Stats();
		System.out.println(math.mean(2,4));
		System.out.println(math.mean(2.0,4.0));
		System.out.println(math.max(2,2));
		System.out.println(math.max(2.0,2.0));
		System.out.println(math.geoMean(2,4));
		System.out.println(math.geoMean(2.0,4.0));
	}
}
