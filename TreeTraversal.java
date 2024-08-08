class TreeNode{
    int value;
    TreeNode left,right;
    TreeNode( int value){
    this.value=value;
    left=right=null;
    }
}
    public class TreeTraversal{
    public void preorder(TreeNode root){
        if(root==null)
        return;
     System.out.print(root.value+" ");
     preorder(root.left);
     preorder(root.right);
    }
    public void inorder(TreeNode root){
        if(root==null)
        return;
     
     inorder(root.left);
     System.out.print(root.value+" ");
     inorder(root.right);
    }
    public void postorder(TreeNode root){
        if(root==null)
        return;
     
     postorder(root.left);
     postorder(root.right);
     System.out.print(root.value+" ");
    }
   public static void main(String[] args){
    TreeNode root=new TreeNode(4);
    root.left=new TreeNode(2);
    root.right=new TreeNode(5);
    root.left.left=new TreeNode(3);
    root.left.left.right=new TreeNode(9);
    root.left.left.right.left=new TreeNode(1);
    root.right.left=new TreeNode(7);
    root.right.right=new TreeNode(6);
    root.right.right.left=new TreeNode(8);
    datastructure tree=new datastructure();
    System.out.println("preorder traversal: ");
    tree.preorder(root);
    System.out.println();
    System.out.println("inorder traversal: ");
    tree.inorder(root);
    System.out.println();
    System.out.println("postorder traversal:");
    tree.postorder(root);
   }   
}