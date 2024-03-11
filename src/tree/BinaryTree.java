//node to create the tree
class Node{
    int data;
    Node left;
    Node right;
//constructor
public Node(int data){
    this.data = data;
    }
}

public class BinaryTree {
    Node root;
	public void insert(int data) {
        root = insertRec(root, data);
    }
//basically just uses recursive to insert the data in the tree
//the insert method's recursive function
    public Node insertRec(Node root, int data){
        if(root==null){
            root = new Node(data);
        }
        else if(data < root.data){
            root.left = insertRec(root.left, data);
        }
        else if(data > root.data){
            root.right = insertRec(root.right, data);
        }
        return root;
    }
//inorder traversal
// if encounters a null value then it will recurse back 
    public void inOrder (){
        inOrderRec(root);

    }
    //for observation of the data
    //i added a recurse for every recurse that happend
    public void inOrderRec(Node root){
        System.out.println("recurse");
        if(root != null){
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }

    }
    public void preOrder (){
        preOrderRec(root);

    }
    public void preOrderRec(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }
    public void postOrder (){
        postOrderRec(root);

    }
    public void postOrderRec(Node root){
        if(root != null){
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data + " ");
        }

    }
}