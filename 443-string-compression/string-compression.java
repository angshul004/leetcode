class Solution {
    public int compress(char[] chars) {

        int write = 0;
        int i = 0;

        while (i < chars.length) {

            char current = chars[i];
            int start = i;

            // Find the end of this group
            while (i < chars.length && chars[i] == current) {
                i++;
            }

            // Write character
            chars[write++] = current;

            // Number of occurrences
            int count = i - start;

            if (count > 1) {
                String countStr = String.valueOf(count);

                for (char c : countStr.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}