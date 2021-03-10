package org.academiadecodigo.asynctomatics.fileanalyzer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class FileAnalyzer {

    public static void main(String[] args) throws IOException {

        //Stream<String> file1 = Files.lines(Path.of("src/main/resources/file1.txt"));
        //Stream<String> file2 = Files.lines(Path.of("src/main/resources/file2.txt"));

        countTheNumberOfWords("src/main/resources/file1.txt");
        findTheFirstWordLargerThanNCharacters("src/main/resources/file1.txt", 12);
        gettingTheLongestNWords("src/main/resources/file1.txt", 5);
        findingTheCommonWordsBetweenTwoFiles("src/main/resources/file1.txt", "src/main/resources/file2.txt");
    }

    private static void countTheNumberOfWords(String path) throws IOException {

        long wordCount =
                Files.lines(Path.of(path))
                        .flatMap(line -> Arrays.stream(line.split("\\s+")))
                        //.distinct() // Eliminates duplicate results
                        .count();

        System.out.println(wordCount);
        System.out.println("-----------------------------------");
    }


    private static void findTheFirstWordLargerThanNCharacters(String path, int n) throws IOException {

        List<String> word =
                Files.lines(Path.of(path))
                        .flatMap(line -> Arrays.stream(line.split("\\s+")))
                        .flatMap(line -> Arrays.stream(line.split(",")))
                        .flatMap(line -> Arrays.stream(line.split("\"")))
                        .filter(line -> line.length() > n)
                        .collect(Collectors.toList());

        System.out.println(word.get(0));
        System.out.println("-----------------------------------");
    }


    private static void gettingTheLongestNWords(String path, int n) throws IOException {

        List<String> word =
                Files.lines(Paths.get(path))
                        .flatMap(line -> Arrays.stream(line.split("\\s+")))
                        .flatMap(line -> Arrays.stream(line.split(",")))
                        .flatMap(line -> Arrays.stream(line.split("\"")))
                        .filter(line -> line.length() == n)
                        .collect(Collectors.toList());

        System.out.println(word);
        System.out.println("-----------------------------------");
    }


   private static void findingTheCommonWordsBetweenTwoFiles(String path1, String path2) throws IOException {

        List<String> file1 =
                Files.lines(Paths.get(path1))
                        .flatMap(line -> Arrays.stream(line.split("\\s+")))
                        .flatMap(line -> Arrays.stream(line.split(",")))
                        .flatMap(line -> Arrays.stream(line.split("\"")))
                        .collect(Collectors.toList());

       List<String> file2 =
               Files.lines(Paths.get(path2))
                       .flatMap(line -> Arrays.stream(line.split("\\s+")))
                       .flatMap(line -> Arrays.stream(line.split(",")))
                       .flatMap(line -> Arrays.stream(line.split("\"")))
                       .collect(Collectors.toList());

       file1.stream()
               .filter(file2::contains)
               .distinct() // Eliminates duplicate results
               .forEach(System.out::println);

    }

}

// Create a File Analyzer Application.
// Capable of performing these operations over files:

// 1 - reading and counting number of words.
// 2 - finding the first word longer than n characters.
// 3 - getting the longest n words.
// 4 - finding the common words between two files.
