package Tree;

import java.util.ArrayList;
import java.util.List;
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
public class PostOrder {
    public static void main(String[] args) {
        
    }
    public ArrayList<Integer> postOrderTraversal(Node root){
        Stack<Node> st1=new Stack<>();
        Stack<Node> st2=new Stack<>();
        List<Integer>list=new ArrayList<>();
        if (root==null){
            return (ArrayList<Integer>) list;
        }
        st1.push(root);
        while (!st1.isEmpty()) {
            root=st1.pop();
            st2.add(root);
            if (root.left!=null) {
                st1.push(root.left);
            }
            if (root.right!=null) {
                st1.push(root.right);
            }   
        }

        while (!st2.isEmpty()) {
            list.add(st2.pop().data);
        }
        return (ArrayList<Integer>) list;
    }

}
