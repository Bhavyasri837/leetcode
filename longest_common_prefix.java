class longest_common_prefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) 
            return "";
        // Start with the first string as the initial prefix
        String prefix = strs[0];

        // Iterate over all strings in the array
        for (int i = 1; i < strs.length; i++) {
            // Compare current prefix with the next string in the array
            while (strs[i].indexOf(prefix) != 0) {
                // Reduce the prefix length by one character each time
                prefix = prefix.substring(0, prefix.length() - 1);
                // If the prefix becomes empty, return an empty string
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
    return prefix;
    }
}


