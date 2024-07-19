import java.util.*;

public class iterativePostOrder {
    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public List<Integer> postOr(Node root){
        List<Integer> result=new LinkedList<>();
        if(root==null) return result;
        Stack<Node> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        st1.push(root);
        while(!st1.isEmpty()){
            Node x=st1.pop();
            st2.push(x.data);
            if(x.left!=null){
                st1.push(x.left);
            }
            if(x.right!=null){
                st1.push(x.right);
            }
        }
        while(!st2.isEmpty()){
            result.add(st2.pop());
        }
        return result;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node four=new Node(4);
        Node five=new Node(5);
        Node six=new Node(6);
        Node seven=new Node(7);
        root.left=second;
        root.right=third;
        second.left=four;
        second.right=five;
        third.left=six;
        third.right=seven;
        iterativePostOrder obj=new iterativePostOrder();
        List<Integer> result=new LinkedList<>();
        result=obj.postOr(root);
        System.out.println(result);
    }
}
