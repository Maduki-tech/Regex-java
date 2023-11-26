package de.schlueter.matcher;

/**
 * Match
 */
public class Match {
    StringBuilder sb = new StringBuilder();

    public Match() {
    }

    public String match(String regex, String input) {
        while (regex.length() > 0) {
            if (regex.charAt(0) == '.') {
                sb.append(input.charAt(0));
                input = input.substring(1);
                regex = regex.substring(1);
            } else if (regex.charAt(0) == input.charAt(0)) {
                sb.append(input.charAt(0));
                input = input.substring(1);
                regex = regex.substring(1);
            } else {
                break;
            }
        }

        return sb.toString();
    }
}
