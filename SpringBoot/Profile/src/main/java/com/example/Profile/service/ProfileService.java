package com.example.Profile.service;

import org.springframework.stereotype.Service;

import com.example.Profile.repository.ProfileRepository;

@Service

public class ProfileService {
	
	private ProfileRepository profileRepository;

	public ProfileService(ProfileRepository profileRepository) {
		super();
		this.profileRepository = profileRepository;
	}
	
}
