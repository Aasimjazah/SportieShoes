package com.example.demo.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	@PostMapping(value="/SaveProduct")
	public String saveProduct(@RequestBody Product product)
	{
		service.addProduct(product);
		
		return "success";
	}
	
	@GetMapping("/GetProduct/{id}")
	public Product getProductById(@PathVariable("id") int id)
	{
		return service.getProductById(id);
	}
	

	
	@GetMapping("/GetAllProducts")
	public List<Product> getAllProduct()
	{
		return service.getAllProduct();
	}
	
	@GetMapping("/GetProductByCategory/{category}")
	public List<Product> getProductsByCategory(@PathVariable("category") String category)
	{
		return service.getByCategory(category);
	}
	
	
	@DeleteMapping("/deleteProduct/{id}")
	public void deleteProduct(@PathVariable("id") int id) {
		service.deleteProduct(id);
	}
	
	@PutMapping("/ApproveProduct/{id}")
	public String approveProduct(@PathVariable("id") int id)
	{
		Product p = service.getProductById(id);
		p.setStatus("Approved");
		service.addProduct(p);
		return "success";
	}
	
	@PutMapping("/RejectProduct/{id}")
	public String rejectProduct(@PathVariable("id") int id)
	{
		Product p = service.getProductById(id);
		p.setStatus("Rejected");
		service.addProduct(p);
		return "success";
	}
	
	@Value("${file.upload-dir}")
	String File_DIRECTOY;
	@PostMapping("/product/uploadimage")
	public ResponseEntity<Object> upload(@RequestParam("file") MultipartFile file,@RequestParam("pId")int id)throws IOException
	{
		System.out.println("Id = "+id);
		String absolutePath=File_DIRECTOY+file.getOriginalFilename();
		File myfile=new File(absolutePath);
		myfile.createNewFile();
		try (FileOutputStream fos = new FileOutputStream(myfile)) {
			fos.write(file.getBytes());
		}
		Product p=service.getProductById(id);
		p.setImgname(file.getOriginalFilename());
		service.addProduct(p);
		System.out.println(p);
		return new ResponseEntity<Object>("file uploaded",HttpStatus.OK);
	}
	
	@GetMapping("/products/getbrandorcatgeory/{search}")
	public List<Product> findsProductsByBrandOrCatgegory(@PathVariable("search")String search)
	{
		return service.getProductsByBrandOrCatgegory(search);
	}
	
}
