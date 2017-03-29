package jaco.models;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017-03-29.
 */
public interface ItemRepository extends JpaRepository<Item, Integer> {

    public Item findById(long id);

}
