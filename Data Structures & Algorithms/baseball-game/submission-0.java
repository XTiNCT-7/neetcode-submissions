class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String s : operations){
            if(s.equals("C")){
                stack.pop();
            } else if(s.equals("D")){
                stack.push(stack.peek()*2);
            } else if(s.equals("+")){
                Integer first = stack.pop();
                Integer second = stack.peek();
                stack.push(first);
                stack.push(first+second);
            } else {
                stack.push(Integer.valueOf(s));
            }
        }
        return stack.stream().mapToInt(Integer::intValue).sum();
    }
}