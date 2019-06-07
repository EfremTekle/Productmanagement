package edu.mum.cs.cs425.prodmgmt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.prodmgmt.model.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {

}
