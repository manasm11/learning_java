package com.example.trying_with_idea_ultimate.interfaces;

import com.example.trying_with_idea_ultimate.models.Profile;

import java.util.List;

public interface ProfileServicesInterface {
    List<Profile> getAllProfiles();
    Profile getProfile(String profileName);
    Profile addProfile(Profile profile);
    Profile updateProfile(Profile profile);
    Profile removeProfile(String profileName);
}