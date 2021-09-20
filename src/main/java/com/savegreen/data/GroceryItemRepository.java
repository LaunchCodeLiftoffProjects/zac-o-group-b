package com.savegreen.data;

import com.savegreen.models.GroceryItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroceryItemRepository extends CrudRepository<GroceryItem, Integer> {

}
