package com.hg.crud.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.hg.crud.models.ProducDTO;
import com.hg.crud.repositories.IProductDAO;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	private IProductDAO repository;

	@PostMapping("/product")
	public ProducDTO create(@Validated @RequestBody ProducDTO p) {
		return repository.insert(p);

	}

	@GetMapping("/")
	public List<ProducDTO> readAll() {
		return repository.findAll();
	}

	@PutMapping("/product/{id}")
    public ProducDTO update(@PathVariable String id, @Validated @RequestBody ProducDTO p) {
        return repository.save(p);
    }

	@DeleteMapping("/product/{id}")
	public void delete(@PathVariable String id) {
		repository.deleteById(id);	
	}

}
