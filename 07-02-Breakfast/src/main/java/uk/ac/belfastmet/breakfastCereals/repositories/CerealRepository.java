package uk.ac.belfastmet.breakfastCereals.repositories;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.breakfastCereals.domain.Cereal;



public interface CerealRepository extends CrudRepository<Cereal, Integer> {

	Object findBy(int i);




}
