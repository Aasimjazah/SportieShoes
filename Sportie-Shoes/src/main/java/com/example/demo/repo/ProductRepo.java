package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Product;


public interface ProductRepo extends CrudRepository<Product, Integer> {

	public Product findById(int id);
	
	public List<Product> findByCategory(String category);
	
	 @Query(value="select * from Product p where p.name like %:search% or p.brand like %:search%" , nativeQuery=true)
	  List<Product> findProductsByBrandOrCatgegory(@Param("search")String search);
}
