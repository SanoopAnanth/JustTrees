import java.util.*;
class leetLevelOrder{
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
    static List<List<Integer>> doLvl(Node root){
        Queue<Node> queue=new LinkedList<Node>();
        List<List<Integer>> finalList=new LinkedList<>();
        if(root==null){
            return finalList;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> sublist=new LinkedList<>();
            for(int i=0;i<size;i++){
                if(queue.peek().left != null) queue.add(queue.peek().left);
                if(queue.peek().right != null) queue.add(queue.peek().right);
                sublist.add(queue.poll().data);
            }
            finalList.add(sublist);
        }
        return finalList;
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
        List<List<Integer>> result=new LinkedList<>();
        result=doLvl(root);
        System.out.println(result);
    }
}