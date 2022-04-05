package com.example.InventoryManagement;

import com.example.InventoryManagement.models.Laptop;
import com.example.InventoryManagement.models.Manufacturer;
import com.example.InventoryManagement.repositories.LaptopRepository;
import com.example.InventoryManagement.repositories.MobilePhoneRepository;
import com.example.InventoryManagement.repositories.TvRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class InventoryManagementApplicationTests {

	@Autowired
	LaptopRepository laptopRepository;

	@Autowired
	MobilePhoneRepository mobilePhoneRepository;

	@Autowired
	TvRepository tvRepository;

	@Test
	void contextLoads() {
	}



//	@Test
//	public void createLaptop(){
//		Laptop laptop1 = new Laptop("Galaxy Book2 Pro 360", Manufacturer.SAMSUNG, "928", "Laptop",  13.3, 16, 164, 4, 950, 1399);
//		laptopRepository.save(laptop1);
//




}
