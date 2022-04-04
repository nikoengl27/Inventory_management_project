package com.example.InventoryManagement.components;

import com.example.InventoryManagement.models.Manufacturer;
import com.example.InventoryManagement.models.MobilePhone;
import com.example.InventoryManagement.models.TV;
import com.example.InventoryManagement.repositories.LaptopRepository;
import com.example.InventoryManagement.repositories.MobilePhoneRepository;
import com.example.InventoryManagement.repositories.TvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    LaptopRepository laptopRepository;

    @Autowired
    TvRepository tvRepository;

    @Autowired
    MobilePhoneRepository mobilePhoneRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {

        TV tv1 = new TV("Q60T", Manufacturer.SAMSUNG, "??", "TV", 12, 250, 400, "4K", true);
        tvRepository.save(tv1);

        TV tv2 = new TV("AU8000", Manufacturer.SAMSUNG, "??", "TV", 12, 250, 400, "4K", true);
        tvRepository.save(tv2);

        TV tv2 = new TV("AU8000", Manufacturer.SAMSUNG, "??", "TV", 12, 250, 400, "4K", true);
        tvRepository.save(tv2);

//        MobilePhone phone1 = new MobilePhone("iPhone13", Manufacturer.APPLE, "productNumber", "Mobile Phone" , 10,750,1250,  "Midnight" , 6.1);
//        mobilePhoneRepository.save(phone1);


        paola laptop;
        andreas mobilePhones;
    }
}
