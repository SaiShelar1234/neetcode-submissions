class Solution {

    public String encode(List<String> strs) {

    StringBuilder str = new StringBuilder();

    for (int i = 0; i < strs.size(); i++) {

        int l = strs.get(i).length();

        str.append(l);
        str.append('#');
        str.append(strs.get(i));
    }

    return str.toString();
}

    public List<String> decode(String str) {

    List<String> strs = new ArrayList<>();

    int i = 0;

    while (i < str.length()) {

        StringBuilder num = new StringBuilder();

        // Read length until #
        while (str.charAt(i) != '#') {
            num.append(str.charAt(i));
            i++;
        }

        int len = Integer.parseInt(num.toString());

        // Skip #
        i++;

        StringBuilder ans = new StringBuilder();

        // Extract actual string
        while (len > 0) {
            ans.append(str.charAt(i));
            i++;
            len--;
        }

        strs.add(ans.toString());
    }

    return strs;
}
}
