
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            int count[] = new int[26];

            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder key = new StringBuilder();

            for (int num : count) {
                key.append(num).append('#');
            }

            String frequencyKey = key.toString();

            if (!map.containsKey(frequencyKey)) {
                map.put(frequencyKey, new ArrayList<>());
            }

            map.get(frequencyKey).add(str);
        }

        return new ArrayList<>(map.values());
    }
}