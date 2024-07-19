import java.util.*;

public class iterativeInorder {
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
    public List<Integer> ino (Node root){
        LinkedList<Integer> result=new LinkedList<>();
        Stack<Node> stack=new Stack<>();
        Node node=root;
        while(true){
            if(node!=null){
                stack.push(node);
                node=node.left;
            }else{
                if(stack.isEmpty()){
                    break;
                }
                node=stack.pop();
                result.add(node.data);
                node=node.right;
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
        iterativeInorder obj=new iterativeInorder();
        List<Integer> result=new LinkedList<>();
        result=obj.ino(root);
        System.out.println(result);
    }
}
