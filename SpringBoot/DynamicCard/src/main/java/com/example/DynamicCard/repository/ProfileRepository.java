package com.example.DynamicCard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DynamicCard.model.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long>{

}
