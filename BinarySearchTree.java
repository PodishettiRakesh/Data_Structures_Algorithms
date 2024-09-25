
public class BinarySearchTree {
    class Node{
        int key;
        Node left;
        Node right;
    
        public Node(int item){
            key=item;
            left=right=null;
        }
    }
    Node root;

    public BinarySearchTree(){
        root=null;
    }

    public void insertNode(int data){
        root=insertNodeabs(root, data);
    }

    public Node insertNodeabs(Node root, int data){
        if(root==null){
            root=new Node(data);
            return root;
        }

        if(root!=null){
            if(data<root.key){
                root.left=insertNodeabs(root.left, data);
            }else if(data>root.key){
                root.right=insertNodeabs(root.right, data);
            }
        }
        return root;
    }

    public void preorder(){
        preorderRec(root);
        System.out.println();
    }

    public void preorderRec(Node root){
        // if(root==null){
        //     System.out.print(root+" ");
        // }else{
        if(root!=null){
            System.out.print(root.key+" ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    void inorder(){
        inorderRec(root);
        System.out.println();
    }

    public void inorderRec(Node root){
        // if(root==null){
        //     System.out.print(root+" ");
        // }
        if(root!=null){
            inorderRec(root.left);
            System.out.print(root.key+" ");
            inorderRec(root.right);
            
        }
    }

    void postorder(){
        postorderAbs(root);
        System.out.println();
    }

    void postorderAbs(Node root){
        if(root!=null){
            postorderAbs(root.left);
            postorderAbs(root.right);
            System.out.print(root.key+" ");
        }
    }

    boolean searchNode(int data){
        return searchNodeAbs(root, data);
    }

    boolean searchNodeAbs(Node root, int data){
        if(root==null || root.key==data){
            return root!=null;
        }
        if(data>root.key){
            return searchNodeAbs(root.right, data);
        }
        return searchNodeAbs(root.left, data);
        
    }
    public static void main(String[] args) {
        BinarySearchTree BSTtree=new BinarySearchTree();
        
        BSTtree.insertNode(5);
        BSTtree.insertNode(4);
        BSTtree.insertNode(8);
        BSTtree.insertNode(2);
        BSTtree.insertNode(9);
        BSTtree.insertNode(10);
        // System.out.println(BSTtree.root.left);

        BSTtree.inorder();
        BSTtree.preorder();
        BSTtree.postorder();
    }
}
