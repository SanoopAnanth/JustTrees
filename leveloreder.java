import java.util.*;
public class leveloreder {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
   void levelOr(Node root){
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node temp=queue.remove();
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
            System.out.println(temp.data);
        }
    }
    static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
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
        leveloreder obj=new leveloreder();
        obj.levelOr(root);
        preOrder(root);
    }
}
