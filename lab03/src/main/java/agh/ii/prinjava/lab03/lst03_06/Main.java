package agh.ii.prinjava.lab03.lst03_06;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <ul>
 *     <li>An {@link InputStream} is a source of bytes, and an {@link OutputStream} is a destination for bytes</li>
 *     <li>A {@link Reader} reads characters, and a {@link Writer} writes them ( about a character encoding)</li>
 * </ul>
 */
public class Main {
    private static final String[] textLines = {
            "All I have for you is a gesture, in combination with a word.",
            "Tenet.",
            "Use it carefully.",
            "It'll open the right doors, but some of the wrong ones, too."
    };

    private static final String demoFileName1 = "tenet.txt";

    private static void deleteDemoFile() {
        try {
            Files.deleteIfExists(Path.of(demoFileName1));
            System.out.println("\nDemo file deleted");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Low-level style writing to a text file demo
     */
    private static void demo1() {
        System.out.println("demo1...");
        //try (var fout = new BufferedWriter(new FileWriter(demoFileName1, StandardCharsets.UTF_8))) {
        try (var fout = Files.newBufferedWriter(Path.of(demoFileName1), StandardCharsets.UTF_8)) {
            for (var line : textLines) {
                fout.write(line);
            }
            fout.flush();
            System.out.println("Writing to " + demoFileName1 + " completed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * As {@link #demo1} but with the use of {@link PrintWriter}
     */
    private static void demo2() {
        System.out.println("\ndemo2...");
        //try (PrintWriter fout = new PrintWriter(demoFileName1)) {
        try (var fout = new PrintWriter(Files.newBufferedWriter(Path.of(demoFileName1), StandardCharsets.UTF_8))) {
            for (var line : textLines) {
                fout.println(line);
            }
            fout.flush();
            System.out.println("Writing to " + demoFileName1 + " completed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * As {@link #demo1} but with the use of {@link java.nio.file.Files#write}
     */
    private static void demo3() {
        System.out.println("\ndemo3...");
        try {
            Files.write(Path.of(demoFileName1), List.of(textLines), StandardCharsets.UTF_8);
            System.out.println("Writing to " + demoFileName1 + " completed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Low-level style reading from a text file demo
     */
    private static void demo4() {
        System.out.println("\ndemo4...");
        //try (var fin = new BufferedReader(new InputStreamReader(new FileInputStream(demoFileName1)))) {
        try (var fin = Files.newBufferedReader(Path.of(demoFileName1), StandardCharsets.UTF_8)) {
            String line;
            while ((line = fin.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * As {@link #demo4} but with the use of {@link Scanner}
     */
    private static void demo5() {
        System.out.println("\ndemo5...");
        try (var fin = new Scanner(Path.of(demoFileName1), StandardCharsets.UTF_8)) {
            while (fin.hasNextLine()) {
                String line = fin.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * As {@link #demo4} but with the use of {@link java.nio.file.Files#readAllLines}
     */
    private static void demo6() {
        System.out.println("\ndemo6...");
        try {
            var lines = Files.readAllLines(Path.of(demoFileName1), StandardCharsets.UTF_8);
            for (var line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //-----------------------------------------------------------------------------------------
    private static void deleteFile(String path) {
        try {
            Files.deleteIfExists(Path.of(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static final List<String> testTextLines1 = new ArrayList<>();
    private static final List<String> testTextLines2 = new ArrayList<>();

    private static final String testPath1 = "test1.txt";
    private static final String testPath2 = "test2.txt";
    private static final String testPath3 = "test3.txt";


    private static void writeInTxtFile(String path, List<String> lines){
        try {
            Files.write(Path.of(path), lines, StandardCharsets.UTF_8);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    private static List<String> getLinesTextFile(String path) {
        List<String> lines = null;
        try (var fin = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {
            String line;
            lines = new ArrayList<String>();
            while ((line = fin.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    private static int counterCharInFile(String path){
        List<String> lines = getLinesTextFile(path);
        int counter = 0;
        for(String line : lines){
            counter += line.length();

//            for(int i=0; i<line.length(); i++){
//                if('4' == line.charAt(i)){
//                    System.out.println("oui");
//                }
//                else{
//                    System.out.println("non");
//                }
//            }
        }
        return counter;
    }

    private static int counterLinesInFile(String path){
        List<String> lines = getLinesTextFile(path);
        int counter = 0;
        for(String line : lines){
            counter++;
        }
        return counter;
    }

    private static int counterWordsInFile(String path){
        char[] al = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        List<String> lines = getLinesTextFile(path);
        int counter = 0;
        boolean veri1;
        boolean veri2;
        boolean veri3;
        for(String line:lines){

            for(int i=0; i<line.length(); i++){
                veri1 = true;
                for(int j=0; j<al.length; j++){
                    if(line.charAt(i) == al[j]){
                        veri1 = true;
                    }
                }
            }


        }
        return counter;
    }


    private static String concatenatesTowFiles(String path1, String path2, String path3){
        List<String> lines1 = getLinesTextFile(path1);
        List<String> lines2 = getLinesTextFile(path2);

        lines1.addAll(lines2);
        System.out.println("oui");
        if(path3 == null){
            writeInTxtFile(path1, lines1);
            return path1;
        }
        else {
            writeInTxtFile(path3, lines1);
            return path3;
        }
    }

    public static void main(String[] args) {
        demo1();
        deleteDemoFile();
        demo2();
        deleteDemoFile();
        demo3();
        demo4();
        demo5();
        demo6();
        deleteDemoFile();

        System.out.println("\n------------------------------------------------");

        testTextLines1.add("1234abcd");
        testTextLines1.add("1 2 3 4 ");
        testTextLines1.add("oui non ");

        testTextLines2.add("ça marche !");
        testTextLines2.add("ouiiiiiii");


        writeInTxtFile(testPath1, testTextLines1);
        writeInTxtFile(testPath2, testTextLines2);


        List<String> lines = getLinesTextFile(testPath1);

        for(String line :lines){
            System.out.println(line);
        }


        System.out.println(counterCharInFile(testPath1));
        System.out.println(counterLinesInFile(testPath1));

        concatenatesTowFiles(testPath1, testPath2, null);
        concatenatesTowFiles(testPath1, testPath2, testPath3);

        //deleteFile(testPath1);
        //deleteFile(testPath2);
        //deleteFile(testPath3);

    }
}
