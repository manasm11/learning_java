package com.example.trying_with_idea_ultimate.services;

import com.example.trying_with_idea_ultimate.databases.DatabaseClass;
import com.example.trying_with_idea_ultimate.interfaces.ProfileServicesInterface;
import com.example.trying_with_idea_ultimate.models.Profile;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProfileService implements ProfileServicesInterface {

    Map<String, Profile> profiles = DatabaseClass.getProfiles();

    @Override
    public List<Profile> getAllProfiles() {
        return new ArrayList<>(profiles.values());
    }

    @Override
    public Profile getProfile(String profileName) {
        return profiles.get(profileName);
    }

    @Override
    public Profile addProfile(Profile profile) {
        profiles.put(profile.getProfileName(), profile);
        return profile;
    }

    @Override
    public Profile updateProfile(Profile profile) {
        return profiles.put(profile.getProfileName(), profile);
    }

    @Override
    public Profile removeProfile(String profileName) {
        return profiles.remove(profileName);
    }
}
