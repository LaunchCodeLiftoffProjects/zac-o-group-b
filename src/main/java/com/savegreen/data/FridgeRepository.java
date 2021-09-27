package com.savegreen.data;

import com.savegreen.models.FridgeItem;
import com.savegreen.models.GroceryItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface FridgeRepository extends CrudRepository<FridgeItem, Integer> {
}
