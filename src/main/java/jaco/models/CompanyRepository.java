package jaco.models;

import javax.transaction.Transactional;

/**
 * Repository for the entity Company.
 * 
 * @see jaco.models.UserBaseRepository
 */
@Transactional
public interface CompanyRepository extends UserBaseRepository<Company> { }
