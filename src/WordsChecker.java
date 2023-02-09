import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private Set<String> word = new HashSet<>();

    public WordsChecker(String text) {

        for (String s : text.split("\\P{IsAlphabetic}+")) {
            word.add(s.toLowerCase());
        }
    }

    public Set<String> getWord() {
        return word;
    }

    public boolean hasWord(String searsh) {
        return word.contains(searsh.toLowerCase());
    }
}
