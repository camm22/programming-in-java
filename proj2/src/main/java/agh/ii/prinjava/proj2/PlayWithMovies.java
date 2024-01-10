package agh.ii.prinjava.proj2;

import agh.ii.prinjava.proj2.dal.ImdbTop250;
import agh.ii.prinjava.proj2.model.Movie;
import agh.ii.prinjava.proj2.utils.Utils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


interface PlayWithMovies {
    /**
     * Returns the movies (only titles) directed (or co-directed) by a given director
     */
    static Set<String> ex01(String director) {
        return ImdbTop250.movies()
                .orElseThrow(() -> new RuntimeException("ex01 is not implemented!"))
                .stream()
                .filter(m -> m.directors().contains(director))
                .map(Movie::title)
                .collect(Collectors.toSet());
    }

    /**
     * Returns the movies (only titles) in which an actor played
     */
    static Set<String> ex02(String actor) {
        return ImdbTop250.movies()
                .orElseThrow(() -> new RuntimeException("ex02 is not implemented!"))
                .stream()
                .filter(m -> m.actors().contains(actor))
                .map(Movie::title)
                .collect(Collectors.toSet());
    }

    /**
     * Returns the number of movies per director (as a map)
     */
    static Map<String, Long> ex03() {
        return ImdbTop250.movies()
                .orElseThrow(() -> new RuntimeException("ex03 is not implemented!"))
                .stream()
                .flatMap(m -> m.directors().stream())
                .collect(Collectors.groupingBy(director -> director, Collectors.counting()));
    }

    /**
     * Returns the 10 directors with the most films on the list
     */
    static Map<String, Long> ex04() {
        return ex03().entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(10)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, java.util.LinkedHashMap::new));
    }

    /**
     * Returns the movies (only titles) made by each of the 10 directors found in {@link PlayWithMovies#ex04 ex04}
     */
    static Map<String, Set<String>> ex05() {
        return ex04().keySet().stream()
                .collect(Collectors.toMap(
                        director -> director,
                        PlayWithMovies::ex01
                ));
    }

    /**
     * Returns the number of movies per actor (as a map)
     */
    static Map<String, Long> ex06() {
        return ImdbTop250.movies()
                .orElseThrow(() -> new RuntimeException("ex06 is not implemented!"))
                .stream()
                .flatMap(m -> m.actors().stream())
                .collect(Collectors.groupingBy(actor -> actor, Collectors.counting()));
    }

    /**
     * Returns the 9 actors with the most films on the list
     */
    static Map<String, Long> ex07() {



        return ex06().entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(9)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, java.util.LinkedHashMap::new));
    }

    /**
     * Returns the movies (only titles) of each of the 9 actors from {@link PlayWithMovies#ex07 ex07}
     */
    static Map<String, Set<String>> ex08() {
        return ex07().keySet().stream()
                .collect(Collectors.toMap(
                        actor -> actor,
                        PlayWithMovies::ex02
                ));
    }

    /**
     * Returns the 5 most frequent actor partnerships (i.e., appearing together most often)
     */
    static Map<String, Long> ex09() {
        return ImdbTop250.movies()
                .orElseThrow(() -> new RuntimeException("ex09 is not implemented!"))
                .stream()
                .flatMap(m -> Utils.orderedPairsFrom(m.actors()).stream())
                .collect(Collectors.groupingBy(pair -> pair, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(5)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, java.util.LinkedHashMap::new));
    }

    /**
     * Returns the movies (only titles) of each of the 5 most frequent actor partnerships
     */
    static Map<String, Set<String>> ex10() {
        Map<String, Long> topDuos = ex09();
        return topDuos.keySet().stream()
                .collect(Collectors.toMap(
                        duo -> duo,
                        duo -> ImdbTop250.movies().orElseThrow(() -> new RuntimeException("ex10 is not implemented!")).stream()
                                .filter(m -> Utils.orderedPairsFrom(m.actors()).contains(duo))
                                .map(Movie::title)
                                .collect(Collectors.toSet())
                ));
    }



    static Map<String, Long> ex06_2() {

        Map<String, Long> myMap = new HashMap<>();

        ImdbTop250.movies().ifPresent(movies -> movies.forEach(movie -> {
            for (String actor : movie.actors()) {
                if (myMap.containsKey(actor)) {
                    Long inc = myMap.get(actor);
                    myMap.put(actor, inc + 1);
                } else {
                    myMap.put(actor, 1L);
                }
            }
        }));
        return myMap;
    }


    static void ex_bonus(){
        List<Integer> test = List.of(1,2,3);

        System.out.println(test.stream().mapToInt(e -> e*e).reduce(0, Integer::sum));
        System.out.println(test.stream().flatMap(e -> Stream.of(e*e)).reduce(0, Integer::sum));

    }
}

