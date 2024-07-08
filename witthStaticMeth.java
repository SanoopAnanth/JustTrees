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
        witthStaticMeth obj=new witthStaticMeth();
        Node first=new Node(1);
        first.left=new Node(2);
        first.right=new Node(3);
        first.left.right=new Node(4);
        System.out.println("Inorder traversal is: ");
        inorder(first);
        System.out.println();
        System.out.println("Preorder:");
        preorder(first);
        System.out.println();
        System.out.println("Postorder:");
        postorder(first);
    }
}
