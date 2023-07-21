package com.openbootcamp.laptops.Repository;

import com.openbootcamp.laptops.Entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop,Long> {
    Laptop laptop1 = new Laptop(1L, "HP", "Pavilion dv6");
}