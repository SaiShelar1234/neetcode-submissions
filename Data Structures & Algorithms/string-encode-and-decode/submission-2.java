
public class Solution {

    // Encode a list of strings into a single string
    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();

        for (String s : strs) {

            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }

        return sb.toString();
    }

    // Decode the encoded string back into a list
    public List<String> decode(String str) {

        List<String> decodedStrings = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            // Find the separator
            int sepIdx = str.indexOf("#", i);

            // Extract the length of the original string
            int len = Integer.parseInt(str.substring(i, sepIdx));

            // Move index to the beginning of the actual string
            i = sepIdx + 1;

            // Extract the original string using its length
            String decodedString = str.substring(i, i + len);

            decodedStrings.add(decodedString);

            // Move index to the beginning of the next encoded string
            i = i + len;
        }

        return decodedStrings;
    }
}