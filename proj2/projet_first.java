package agh.ii.prinjava.proj2;

import agh.ii.prinjava.proj2.dal.ImdbTop250;
import agh.ii.prinjava.proj2.model.Movie;

import java.util.*;


interface PlayWithMovies {

    /**
     * Returns the movies (only titles) directed (or co-directed) by a given director
     */
    static Set<String> ex01(String director) {

        Set<String> mySet = new HashSet<>();

        ImdbTop250.movies().ifPresent(movies -> movies.forEach(movie -> {
            for(String direct : movie.directors()){
                if(direct.equals(director)) mySet.add(movie.title());
            }
        }));

        return mySet;
        //throw new RuntimeException("ex01 is not implemented!");
    }

    /**
     * Returns the movies (only titles) in which an actor played
     */
    static Set<String> ex02(String actor) {

        Set<String> mySet = new HashSet<>();

        ImdbTop250.movies().ifPresent(movies -> movies.forEach(movie -> {
            for(String act : movie.actors()){
                if(act.equals(actor)) mySet.add(movie.title());
            }
        }));

        return mySet;

        //throw new RuntimeException("ex02 is not implemented!");
    }

    /**
     * Returns the number of movies per director (as a map)
     */
    static Map<String, Long> ex03() {

        Map<String, Long> myMap = new HashMap<>();

        ImdbTop250.movies().ifPresent(movies -> movies.forEach(movie -> {
            for(String director : movie.directors()){
                if(myMap.containsKey(director)){
                    Long inc = myMap.get(director);
                    myMap.put(director, inc + 1);
                }
                else{
                    myMap.put(director, 1L);
                }
            }
        }));

        return myMap;

        //throw new RuntimeException("ex03 is not implemented!");
    }

    /**
     * Returns the 10 directors with the most films on the list
     */
    static Map<String, Long> ex04() {

        Map<String, Long> myMap = ex03();

        List<Map.Entry<String, Long>> listTrie =
                myMap.entrySet()
                     .stream()
                     .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                     .limit(10)
                     .toList();

        Map<String, Long> updateMap = new LinkedHashMap<>();

        for(Map.Entry<String, Long> entry : listTrie){
            updateMap.put(entry.getKey(), entry.getValue());
        }

        return updateMap;

        //throw new RuntimeException("ex04 is not implemented!");
    }

    /**
     * Returns the movies (only titles) made by each of the 10 directors found in {@link PlayWithMovies#ex04 ex04}
     */
    static Map<String, Set<String>> ex05() {

        Map<String, Long> directors = ex04();

        Map<String, Set<String>> myMap = new HashMap<>();

        ImdbTop250.movies().ifPresent(movies -> movies.forEach(movie -> {

            for(String direct : movie.directors()){

                for(String director : directors.keySet()){

                    if(direct.equals(director)){

                        Set<String> s;
                        if(myMap.containsKey(director)){
                            s = myMap.get(director);
                        }
                        else{
                            s = new HashSet<>();
                        }
                        s.add(movie.title());
                        myMap.put(director, s);

                    }
                }
            }
        }));

        return myMap;

        //throw new RuntimeException("ex05 is not implemented!");
    }

    /**
     * Returns the number of movies per actor (as a map)
     */
    static Map<String, Long> ex06() {

        Map<String, Long> myMap = new HashMap<>();

        ImdbTop250.movies().ifPresent(movies -> movies.forEach(movie -> {
            for(String actor : movie.actors()){
                if(myMap.containsKey(actor)){
                    Long inc = myMap.get(actor);
                    myMap.put(actor, inc + 1);
                }
                else{
                    myMap.put(actor, 1L);
                }
            }
        }));

        return myMap;

        //throw new RuntimeException("ex06 is not implemented!");
    }

    /**
     * Returns the 9 actors with the most films on the list
     */
    static Map<String, Long> ex07() {


        Map<String, Long> myMap = ex06();

        List<Map.Entry<String, Long>> listTrie =
                myMap.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .limit(9)
                        .toList();

        Map<String, Long> updateMap = new LinkedHashMap<>();

        for(Map.Entry<String, Long> entry : listTrie){
            updateMap.put(entry.getKey(), entry.getValue());
        }

        return updateMap;

        //throw new RuntimeException("ex07 is not implemented!");
    }

    /**
     * Returns the movies (only titles) of each of the 9 actors from {@link PlayWithMovies#ex07 ex07}
     */
    static Map<String, Set<String>> ex08() {

        Map<String, Long> actors = ex07();

        Map<String, Set<String>> myMap = new HashMap<>();

        ImdbTop250.movies().ifPresent(movies -> movies.forEach(movie -> {

            for(String act : movie.actors()){

                for(String actor : actors.keySet()){

                    if(act.equals(actor)){

                        Set<String> s;
                        if(myMap.containsKey(actor)){
                            s = myMap.get(actor);
                        }
                        else{
                            s = new HashSet<>();
                        }
                        s.add(movie.title());
                        myMap.put(actor, s);

                    }
                }
            }
        }));

        return myMap;

        //throw new RuntimeException("ex08 is not implemented!");
    }

    /**
     * Returns the 5 most frequent actor partnerships (i.e., appearing together most often)
     */
    static Map<String, Long> ex09() {

        throw new RuntimeException("ex08 is not implemented!");
    }

    /**
     * Returns the movies (only titles) of each of the 5 most frequent actor partnerships
     */
    static Map<String, Set<String>> ex10() {

        throw new RuntimeException("ex10 is not implemented!");
    }
}
