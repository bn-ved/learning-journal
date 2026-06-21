void main() {
}

public int lengthOfLongestSubstring(String s) {
    Map<Character, Integer> freq = new HashMap<>();
    int maxLength = 0;
    int left = 0;
    for (int right = 0; right < s.length(); right++) {
        char cr = s.charAt(right);
        freq.put(cr, freq.getOrDefault(cr, 0) + 1);

        while (freq.get(cr) > 1) {
            char cl = s.charAt(left);
            freq.put(cl, freq.get(cl) - 1);
            left++;
        }
        maxLength = Math.max(maxLength, right - left + 1);
    }
    return maxLength;
}
