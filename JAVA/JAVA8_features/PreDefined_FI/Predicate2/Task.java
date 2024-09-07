package Two;

import java.util.stream.Collectors;
import java.util.*;

// here task is to print the strings in list as the first and the last letters to be in uppercase and the remaining are in lowerCase

// output be like this===    [SivA, KrishnA, Rohith sharmA, Virat kohlI, JadejA, Ab devilliarS, WarneR]

public class Task {
    public static void main(String[] args) {
        List<String> ename=Arrays.asList("Siva","Krishna","Rohith Sharma","Virat Kohli","Jadeja","Ab devilliars","Warner");
        List<String> result=ename.stream().map(name->{
          /* */
            String firstLetter=name.substring(0, 1).toUpperCase();                       // this is for to print the first letter in uppercase
            String remainingLtters=name.substring(1, name.length()-1).toLowerCase();
            String lastLetter=name.substring(name.length()-1).toUpperCase();
            return firstLetter+remainingLtters+lastLetter;

        }).collect(Collectors.toList());

        System.out.println(result);
    }
}
