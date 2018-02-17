package country.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import country.entities.Country;


public interface CountryRepository extends JpaRepository<Country, Integer>{

}
