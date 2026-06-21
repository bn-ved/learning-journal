void main() {

}

public boolean isPalindrome(String s) {
    // This a extra space O(1)
    s = s.toLowerCase();
    int left = 0, right = s.length() - 1;

    while (left < right) {
        while (!Character.isLetterOrDigit(s.charAt(left)) && left < right) {
            left++;
        }
        while (!Character.isLetterOrDigit(s.charAt(right)) && left < right) {
            right--;
        }
        if (s.charAt(left++) != s.charAt(right--)) {
            return false;
        }
    }
    return true;
}
