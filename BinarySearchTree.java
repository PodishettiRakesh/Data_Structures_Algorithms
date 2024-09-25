
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

    public void inorder(){
        inorderRec(root);
    }

    public void inorderRec(Node root){
        if(root==null){
            System.out.print(root+" ");
        }else{
            System.out.print(root.key+" ");
            inorderRec(root.left);
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree BSTtree=new BinarySearchTree();
        
        BSTtree.insertNode(5);
        BSTtree.insertNode(4);
        BSTtree.insertNode(8);
        // System.out.println(BSTtree.root.left);

        BSTtree.inorder();
    }
}
