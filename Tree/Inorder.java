package Tree;

import java.util.ArrayList;
import java.util.Stack;

class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = null;
        right = null;
    }
}
public class Inorder {
    public static void main(String[] args) {
        
    }
    public void inorderTraversal(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        while(curr != null || !stack.isEmpty()){
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            ans.add(curr.data);
            curr = curr.right;
        }


    }
}
