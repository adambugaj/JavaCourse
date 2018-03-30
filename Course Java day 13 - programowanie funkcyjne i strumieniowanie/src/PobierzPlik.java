import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PobierzPlik {

	public static Stream<Plik> cities() throws IOException {
		// TODO Auto-generated method stub

		return Files.lines(Paths.get("simplemaps-worldcities-basic.csv"))
			.map( fileLine -> new Plik(fileLine));
		
	}
	
	public static void main(String[] args) throws IOException {
		
		// wyszukaj mexico city
		cities()
			.filter( city -> city.getCity().toLowerCase().contains("mexico"))
			.forEach( city -> System.out.println(city));
		
		// wyszukaj najwieksze miasto
		cities()
			.sorted( (p, q) -> {
				if (p.getPopulation() < q.getPopulation()) return 1;
				if (p.getPopulation() > q.getPopulation()) return -1;
				return 0;
		})
			.findFirst()
			.ifPresent(p -> System.out.println(p));
			//.forEach( city -> System.out.println(city));
		
		cities()
			.max( (c1, c2) -> {
				if(c1.getLat() < c2.getLat()) return 1;
				if(c1.getLat() > c2.getLat()) return -1;
				return 0;
				// :: dzia³a podobnie jak p -> System.out.println(p)
			}).ifPresent( System.out::println );
		
		// The biggest country 
		cities()
			.filter( country -> country.getCountry().toLowerCase().contains("poland"))
			.max( (c1, c2) -> {
				if(c1.getPopulation() < c2.getPopulation()) return - 1;
				if(c1.getPopulation() > c2.getPopulation()) return 1;
				return 0;
				// :: dzia³a podobnie jak p -> System.out.println(p)
		}).ifPresent( System.out::println );
		
		// The cities of Russia with alphabetical queue
		cities()
			.filter( country -> country.getCountry().toLowerCase().contains("russia"))
			.map( Plik::getCity)
			.sorted()
			.forEach(System.out::println);
		
		setup();
		
		
		//Map<String, List<City>> map = cities().collect(collector);
		
		
}
		//map.entrySet()

static public void setup() throws IOException {
	
	Map<String, Double> map = cities()
			.collect(Collectors.groupingBy(
				Plik::getCountry, Collectors.summingDouble(Plik::getPopulation))
			);
	
	}
}