class Solution {
    public static int longestValidParentheses(String s) {
        java.util.Stack<Integer>stack = new java.util.Stack<>();
        stack.push(-1);
        int maxlength = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    maxlength = Math.max(maxlength,i-stack.peek());
                }
            }
        }
        return maxlength;
        
    }
    public static void main(String[] args){
        String s1 = ")()())";
        String s2 ="(()";
        System.out.println(s1+"->"+longestValidParentheses(s1));
        System.out.println(s2+"->"+longestValidParentheses(s2));
    }
}