import java.util.*;
public class iterativePreorder {
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
    public List<Integer> preOrder(Node root){
        List<Integer> result=new LinkedList<>();
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node x=stack.pop();
            result.add(x.data);
            if(x.right!=null){
                stack.push(x.right);
            }
            if(x.left!=null){
                stack.push(x.left);
            }
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
        iterativePreorder obj=new iterativePreorder();
        List<Integer> result=new LinkedList<>();
        result=obj.preOrder(root);
        System.out.println(result);
    }
}
