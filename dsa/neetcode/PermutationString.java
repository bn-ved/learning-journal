void main() {
}

public boolean checkInclusion(String s1, String s2) {
    if (s1.length() > s2.length()) {
        return false;
    }
    int[] freq = new int[26];
    int[] curr = new int[26];

    for (int i = 0; i < s1.length(); i++) {
        int a = s1.charAt(i) - 'a';
        int b = s2.charAt(i) - 'a';
        freq[a]++;
        curr[b]++;
    }

    int matches = 0;
    for (int i = 0; i < 26; i++) {
        if (freq[i] == curr[i]) {
            matches++;
        }
    }

    int left = 0;
    int right = s1.length();
    while (matches != 26) {
        if (right >= s2.length()) {
            return false;
        }

        int in = s2.charAt(right) - 'a';
        int out = s2.charAt(left) - 'a';

        // for In and Out there are three condition
        // - count matches then matches++
        // - count doesn't match
        // - it was matching but now not matching then matching--
        // - previously not matching (ignore)

        curr[in]++;
        if (freq[in] == curr[in]) {
            matches++;
        } else if (curr[in] == freq[in] + 1) {
            matches--;
        }

        curr[out]--;
        if (freq[out] == curr[out]) {
            matches++;
        } else if (curr[out] == freq[out] - 1) {
            matches--;
        }

        left++;
        right++;
    }
    return true;
}
