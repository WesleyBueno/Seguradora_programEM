package com.programem.seguradora;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface DependenteRepository extends CrudRepository<Dependente, Integer> {

}