package com.openbootcamp.laptops.Controller;

import com.openbootcamp.laptops.Entity.Laptop;
import com.openbootcamp.laptops.Repository.LaptopRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {

    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }
    @GetMapping("/laptops")
    public List<Laptop> findAll() {
        return laptopRepository.findAll();
    }

    @GetMapping("/laptops/{id}")
    public ResponseEntity<Laptop> findOneById(@PathVariable Long id) {
        Optional<Laptop> laptop = laptopRepository.findById(id);
        if (laptop.isPresent()) {
            return ResponseEntity.ok(laptop.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/laptops")
    public Laptop createLaptop(@RequestBody Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    @PutMapping("/laptops")
    public ResponseEntity<Laptop> updateLaptop(@RequestBody Laptop laptop) {
        if (laptop.getId() == null) {
            System.out.println("No se encontró la laptop");
            return ResponseEntity.badRequest().build();
        } else {
            return ResponseEntity.ok(laptopRepository.save(laptop));
        }
    }

    @DeleteMapping("/laptops/{id}")
    public ResponseEntity<Laptop> deleteLaptop(@PathVariable Long id) {
            laptopRepository.deleteById(id);
            return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/laptops")
    public ResponseEntity<Laptop> deleteALl() {
        laptopRepository.deleteAll();
        return ResponseEntity.noContent().build();
    }
}
