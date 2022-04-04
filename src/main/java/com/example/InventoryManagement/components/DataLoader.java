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

        TV tv1 = new TV("Q60T", Manufacturer.SAMSUNG, "??", "TV", 12, 250, 400, "4K QLED", true, 43);
        tvRepository.save(tv1);

        TV tv2 = new TV("AU8000", Manufacturer.SAMSUNG, "??", "TV", 8, 200, 380, "Crystal 4K", true, 43);
        tvRepository.save(tv2);

        TV tv3 = new TV("TU7020", Manufacturer.SAMSUNG, "??", "TV", 3, 190, 375, "4K", true, 50);
        tvRepository.save(tv3);

        TV tv4 = new TV("Q80A", Manufacturer.SAMSUNG, "??", "TV", 6, 550, 1000, "4K QLED", true, 55);
        tvRepository.save(tv4);

        TV tv5 = new TV("43UP7006LF", Manufacturer.LG, "??", "TV", 7, 150, 290, "4K UHD", true, 43);
        tvRepository.save(tv5);

        TV tv6 = new TV("OLED48A16LA", Manufacturer.LG, "??", "TV", 15, 360, 590, "4K UHD", true, 50);
        tvRepository.save(tv6);

        TV tv7 = new TV("32LM630BPLA", Manufacturer.LG, "??", "TV", 2, 160, 255, "1080p", false, 32);
        tvRepository.save(tv7);

        TV tv8 = new TV("OLED55B16LA", Manufacturer.LG, "??", "TV", 4, 600, 1000, "4k OLED", true, 55);
        tvRepository.save(tv8);

        TV tv9 = new TV("BRAVIA KE55A8", Manufacturer.SONY, "??", "TV", 1, 800, 1400, "4K OLED", true, 55);
        tvRepository.save(tv9);

        TV tv10 = new TV("BRAVIA KD43X80J", Manufacturer.SONY, "??", "TV", 7, 380, 550, "4K UHD", true, 43);
        tvRepository.save(tv10);

        TV tv11 = new TV("BRAVIA XR55A80J", Manufacturer.SONY, "??", "TV", 13, 750, 1300, "4K OLED", true, 55);
        tvRepository.save(tv11);

        TV tv12 = new TV("BRAVIA XR-85Z9J", Manufacturer.SONY, "??", "TV", 2, 4500, 6500, "8K UHD", true, 85);
        tvRepository.save(tv12);

        TV tv13 = new TV("MI TV 4A", Manufacturer.XIAOMI, "??", "TV", 4, 80, 230, "1080p", false, 32);
        tvRepository.save(tv13);

        TV tv14 = new TV("65AE7000FTUK", Manufacturer.HISENSE, "??", "TV", 2, 280, 450, "4k UHD", true, 55);
        tvRepository.save(tv14);

        TV tv15 = new TV("50A7GQTUK", Manufacturer.HISENSE, "??", "TV", 6, 280, 430, "4K UHD", true, 50);
        tvRepository.save(tv15);

        TV tv16 = new TV("32A4GTUK", Manufacturer.HISENSE, "??", "TV", 9, 60, 190, "HD Ready", true, 32);
        tvRepository.save(tv16);

        TV tv17 = new TV("75A6GTUK", Manufacturer.HISENSE, "??", "TV", 11, 530, 725, "4K UHD", true, 75);
        tvRepository.save(tv17);

        TV tv18 = new TV("100L5FTUK", Manufacturer.HISENSE, "??", "TV", 3, 1900, 2500, "4K Laser", true, 100);
        tvRepository.save(tv18);

        TV tv19 = new TV("43UL2163DBC", Manufacturer.TOSHIBA, "??", "TV", 2, 180, 380, "4K", true, 43);
        tvRepository.save(tv19);

        TV tv20 = new TV("32WK3C63DB", Manufacturer.TOSHIBA, "??", "TV", 1, 110, 220, "HD Ready", false, 32);
        tvRepository.save(tv20);




//        MobilePhone phone1 = new MobilePhone("iPhone13", Manufacturer.APPLE, "productNumber", "Mobile Phone" , 10,750,1250,  "Midnight" , 6.1);
//        mobilePhoneRepository.save(phone1);


    }
}
