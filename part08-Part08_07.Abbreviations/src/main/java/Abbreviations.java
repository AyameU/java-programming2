import java.util.HashMap;

public class Abbreviations {

    HashMap<String, String> abbreviations = new HashMap<>();

    public Abbreviations() {}

    public void addAbbreviation(String abbreviation, String explanation) {
        if(!hasAbbreviation(abbreviation)) {
            abbreviations.put(abbreviation, explanation);
        }
    }

    public boolean hasAbbreviation(String abbreviation) {
        if(abbreviations.containsKey(abbreviation)) {
            return true;
        }
        else {
            return false;
        }
    }

    public String findExplanationFor(String abbreviation) {
        if(hasAbbreviation(abbreviation)) {
            return abbreviations.get(abbreviation);
        }
        else {
            return null;
        }
    }
}
