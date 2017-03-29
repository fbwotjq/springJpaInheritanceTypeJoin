package jaco.models;

import javax.transaction.Transactional;

/**
 * Repository for the entity User.
 * 
 * @see jaco.models.UserBaseRepository
 */
@Transactional
public interface UserRepository extends UserBaseRepository<User> { }
