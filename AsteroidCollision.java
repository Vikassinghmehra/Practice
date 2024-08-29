class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]>=0){
                stack.push(asteroids[i]);
            }else{
                while(!stack.isEmpty() && stack.peek()>0 && stack.peek()< (-1 *asteroids[i])){
                    stack.pop();
                }
                if (stack.isEmpty() || stack.peek() < 0)
                    stack.push(asteroids[i]);
                else if (stack.peek() == (-1 *asteroids[i]))
                    stack.pop(); 
                else           
                        ;
            }
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}