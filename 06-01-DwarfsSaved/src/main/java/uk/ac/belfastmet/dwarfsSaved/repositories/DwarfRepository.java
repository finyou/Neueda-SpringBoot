package uk.ac.belfastmet.dwarfsSaved.repositories;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.dwarfsSaved.domain.Dwarf;

public interface DwarfRepository extends CrudRepository<Dwarf, Integer> {

	Iterable<Dwarf> findByAuthor(String string);



	Iterable<Dwarf> findByAuthorOrderByNameAsc(String string);



	Iterable<Dwarf> findTop3ByAuthor(String string);



	Iterable<Dwarf> findByDwarfId(int i);



	Iterable<Dwarf> findByName(String string);
	
	
	Iterable<Dwarf> findByAuthorOrName(String string, String string1);

}
