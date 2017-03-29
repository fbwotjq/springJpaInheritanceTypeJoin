package jaco.models;

import javax.transaction.Transactional;

/**
 * Repository for the entity Person.
 * 
 * @see jaco.models.UserBaseRepository
 */
@Transactional
public interface PersonRepository extends UserBaseRepository<Person> { }
