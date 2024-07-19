public class witthStaticMeth {
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
    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
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
        System.out.println("Inorder traversal is: ");
        inorder(root);
        System.out.println();
        System.out.println("Preorder:");
        preorder(root);
        System.out.println();
        System.out.println("Postorder:");
        postorder(root);
    }
}
