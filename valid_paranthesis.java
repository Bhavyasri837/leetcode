class valid_paranthesis {
    public boolean isValid(String s) {
         Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            // If the current character is an opening bracket, push it onto the stack
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            }
            // If the current character is a closing bracket
            else {
                // Check if the stack is empty (no matching opening bracket)
                if (stack.isEmpty()) {
                    return false;
                }
                
                // Pop the top of the stack and check if it matches the corresponding opening bracket
                char top = stack.pop();
                if (currentChar == ')' && top != '(') {
                    return false;
                }
                if (currentChar == '}' && top != '{') {
                    return false;
                }
                if (currentChar == ']' && top != '[') {
                    return false;
                }
            }
        }
        
        // If the stack is empty, it means all the brackets are matched and closed
        return stack.isEmpty();
    }
    
}
