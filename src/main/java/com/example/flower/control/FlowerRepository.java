package com.example.flower.control;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flower.store.Flower;

public interface FlowerRepository extends JpaRepository<Flower, Integer> {
}
