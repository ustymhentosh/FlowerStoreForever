package com.example.flower.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flower.store.Flower;

@Service
public class FlowerService {
    public FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository){
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }

    public void add(Flower flower) {
        flowerRepository.save(flower);
    }
}
