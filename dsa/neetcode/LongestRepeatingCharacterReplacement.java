void main() {
}

public int characterReplacement(String s, int k) {
    int counts[] = new int[26];
    int maxFreq = 0;
    int left = 0;
    int maxLength = 0;
    for (int right = 0; right < s.length(); right++) {
        counts[s.charAt(right) - 'A']++;
        maxFreq = Math.max(maxFreq, counts[s.charAt(right) - 'A']);

        // check if number of replacements is more than k
        if ((right - left + 1) - maxFreq > k) {
            counts[s.charAt(left) - 'A']--;
            left++;
        }
        maxLength = Math.max(maxLength, (right - left + 1));
    }
    return maxLength;
}
