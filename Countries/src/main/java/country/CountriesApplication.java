package country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import country.entities.Country;
import country.repository.CountryRepository;

@SpringBootApplication
public class CountriesApplication implements CommandLineRunner {

	
	@Autowired
	private CountryRepository countryRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(CountriesApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		countryRepo.save(new Country("Earth", "World"));
		countryRepo.save(new Country("Eritrea", "Asmara"));
		countryRepo.save(new Country("China", "Peking"));
		countryRepo.save(new Country("Germany", "Berliln"));
		countryRepo.save(new Country("USA", "Washington DC"));
		countryRepo.save(new Country("Russia", "Moscow"));
		countryRepo.save(new Country("Nmibia", "Windhoek"));
		countryRepo.save(new Country("India", "New Delhi"));
		countryRepo.save(new Country("North Korea", "Pyongyang"));
		countryRepo.save(new Country("Kenya", "Nairobi"));
		countryRepo.save(new Country("Canada", "Ottawa"));
		countryRepo.save(new Country("Jamaica", "Kingston"));
		countryRepo.save(new Country("Brazil", "Brasilia"));
		countryRepo.save(new Country("Egypt", "Cairo"));
		countryRepo.save(new Country("Nigeria", "Abuja"));
		
		
	}
}
