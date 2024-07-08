class implementation{
    class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    public static void main(String[] args) {
        implementation obj=new implementation();
        Node first=obj.new Node(1);
        first.left=obj.new Node(2);
        first.right=obj.new Node(3);
        first.left.right=obj.new Node(4);
    }
}