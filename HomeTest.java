package com.company;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class HomeTest {
    @Test
    public void hashSetTest(){
        //given
        Set<Home> homes = new HashSet<>();
        homes.add(new Home(27, "Krasnaya",  8, 38));
        homes.add(new Home(27, "Doroshenka",  9, 46));
        homes.add(new Home(46, "Sagaidachnogo",  10, 56));
        homes.add(new Home(221, "Baker Street",  5, 3));
        homes.add(new Home(220, "Baker Street",  6, 18));
        homes.add(new Home(413, "La Rambla", 6, 20));
        homes.add(new Home(57, "Motzstraße",  5, 29));
        homes.add(new Home(57, "Khreshchatyk",  5, 23));
        homes.add(new Home(57, "Magnificent Mile",  25, 189));
        homes.add(new Home(12, "Lyubarskogo",  12, 61));



    }


    @Test
    public void linkedHashSetTest(){
        //given
        Set<Home> homes = new LinkedHashSet<>();
        homes.add(new Home(27, "Krasnaya",  8, 38));
        homes.add(new Home(27, "Doroshenka", 9, 46));
        homes.add(new Home(46, "Sagaidachnogo",  10, 56));
        homes.add(new Home(221, "Baker Street",  5, 3));
        homes.add(new Home(220, "Baker Street",  6, 18));
        homes.add(new Home(413, "La Rambla",  6, 20));
        homes.add(new Home(57, "Motzstraße",  5, 29));
        homes.add(new Home(57, "Khreshchatyk", 5, 23));
        homes.add(new Home(57, "Magnificent Mile",  25, 189));
        homes.add(new Home(12, "Lyubarskogo",  12, 61));

    }

    @Test
    public void treeSetTest(){
        //given
        Set<Home> homes = new TreeSet<>();
        homes.add(new Home(27, "Krasnaya",  8, 38));
        homes.add(new Home(27, "Doroshenka", 9, 46));
        homes.add(new Home(46, "Sagaidachnogo",  10, 56));
        homes.add(new Home(221, "Baker Street",  5, 3));
        homes.add(new Home(220, "Baker Street",  6, 18));
        homes.add(new Home(413, "La Rambla",  6, 20));
        homes.add(new Home(57, "Motzstraße",  5, 29));
        homes.add(new Home(57, "Khreshchatyk", 5, 23));
        homes.add(new Home(57, "Magnificent Mile",  25, 189));
        homes.add(new Home(12, "Lyubarskogo",  12, 61));
    }


}
