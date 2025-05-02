package com.example.DynamicCard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DynamicCard.model.Profile;
import com.example.DynamicCard.profileDTO.ProfileDTO;
import com.example.DynamicCard.repository.ProfileRepository;

@Service
public class ProfileService {

    @Autowired
    
    private ProfileRepository repository;

    public void saveProfile(ProfileDTO dto) {
        Profile profile = new Profile();
        profile.setName(dto.getName());
        profile.setGender(dto.getGender());
        profile.setColor(dto.getColor());
        profile.setFontSize(dto.getFontSize());
        repository.save(profile);
    }

    public List<Profile> getAllProfiles() {
        return repository.findAll();
    }

    public void deleteProfile(Long id) {
        repository.deleteById(id);
    }
}
