package com.manas;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository {
    static final List<Alien> aliens = new ArrayList<>();

    static {
        aliens.add(new Alien("Manas", 60));
        aliens.add(new Alien("Divya", 90));
        aliens.add(new Alien("Naman", 50));
        aliens.add(new Alien("Lakshya", 67));
        aliens.add(new Alien("Bhavya", 80));
    }

    public List<Alien> getAliens() {
        return aliens;
    }

    public Alien getAlien(String name) {
        for (Alien alien : aliens) {
            if (alien.getName().equals(name)) return alien;
        }
        return null;
    }

    public Alien createAlien(Alien alien) {
        aliens.add(alien);
        return alien;
    }
}
