package com.example.flower.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flower.store.Flower;



@RestController
@RequestMapping("/api/flowers")
public class FlowerController {
    private FlowerService floweService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.floweService = flowerService;
    }

    @GetMapping("/list")
    public List<Flower> getFlowers() {
        return floweService.getFlowers();
    }

    @PostMapping("/add")
    public void addFlower(@RequestBody Flower flower) {
        floweService.add(flower);
    }

}
