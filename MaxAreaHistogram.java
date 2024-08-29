import java.util.Stack;

class MaxAreaHistogram {
    public int largestRectangleArea(int[] heights) {
        int left[]=new int[heights.length];
        int right[]=new int[heights.length];
        previousSmaller(heights,left);
        nextSmaller(heights,right);
        int max=0;
        for(int i=0;i<heights.length;i++){
            int width = right[i] - left[i] - 1;
            int area = width * heights[i];
            max=Math.max(max,area);
        }
        return max;
    }

    public int[] previousSmaller(int a[],int left[]){
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<a.length;i++){
            while(!stack.isEmpty() && a[stack.peek()]>=a[i])
            {stack.pop();}
            if(stack.isEmpty()){
                left[i]=-1;
            }else{
                left[i]=stack.peek();
            }
            stack.push(i);
        }
    return left;
    }
    public int[] nextSmaller(int a[],int right[]){
        Stack<Integer>stack=new Stack<>();
        for(int i=a.length-1;i>=0;i--){
            while(!stack.isEmpty() && a[stack.peek()]>=a[i])
            {stack.pop();}
            if(stack.isEmpty()){
                right[i]=a.length;
            }else{
                right[i]=stack.peek();
            }
            stack.push(i);
        }
    return right;
    }
    public static void main(String[] args) {
        int heights[]={2,1,5,6,2,3};
        largestRectangleArea(heights);
    }
}
