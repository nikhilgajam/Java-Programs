import java.util.ArrayList;

public class Jp{

    static class Node{

        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }

    }

    static class BST{

        public static Node insert(Node root, int data){

            if(root == null){
                root = new Node(data);
                return root;
            }else{
                if(data < root.data){
                    root.left = insert(root.left, data);
                }else{
                    root.right = insert(root.right, data);
                }
            }

            return root;
        }

        public static boolean search(Node root, int data){
            // O(H), where H is height of a tree
            if(root == null){
                return false;
            }

            if(data == root.data){
                return true;
            }else if(data < root.data){
                return search(root.left, data);
            }else{
                return search(root.right, data);
            }

        }

        public static Node delete(Node root, int val){

            if(val < root.data){
                root.left = delete(root.left, val);
            }else if(val > root.data){
                root.right = delete(root.right, val);
            }else{  // val == root.data

                // Case 1: Node with no child (Just remove the node and replace it with null)
                if(root.left == null && root.right == null){
                    return null;
                }

                // Case 2: Node with one child (Just replace left or right child which is present)
                if(root.left == null){
                    return root.right;
                }else if(root.right == null){
                    return root.left;
                }

                // Case 3: Node with two child (Replace with inorder successor(Leftmost node of right subtree) and delete the inorder successor after replacing)
                Node IS = inorderSuccessor(root.right);
                root.data = IS.data;
                root.right = delete(root.right, IS.data);
                // Inorder successor will not have two childs. So, it will be deleted in Case 1 or Case 2

            }

            return root;

        }

        public static Node inorderSuccessor(Node root){
            // Inorder successor is leftmost node of right subtree
            while(root.left != null){
                root = root.left;
            }
            return root;
        }

        public static void inorder(Node root){
            if(root != null){
                inorder(root.left);
                System.out.print(root.data + " ");
                inorder(root.right);
            }
        }

        public static void printInRange(Node root, int X, int Y){

            if(root == null){
                return;
            }

            if(X <= root.data && root.data <= Y){
                printInRange(root.left, X, Y);
                System.out.print(root.data + " ");
                printInRange(root.right, X, Y);
            }else if(Y <= root.data){
                printInRange(root.left, X, Y);
            }else{
                printInRange(root.right, X, Y);
            }
        }

        public static void printPath(ArrayList<Integer> path){
            for(int i=0; i<path.size(); i++){
                System.out.print(path.get(i));
                if(i != path.size()-1){
                    System.out.print("->");
                }
            }
            System.out.println();
        }

        public static void printRootToLeaf(Node root, ArrayList<Integer> path){

            if(root == null){
                return;
            }

            path.add(root.data);

            if(root.left == null && root.right == null){
                printPath(path);
            }else{
                printRootToLeaf(root.left, path);
                printRootToLeaf(root.right, path);
            }

            path.remove(path.size()-1);

        }

    }

    public static void main(String[] args){

        BST bstree = new BST();
        Node root = null;

        // int[] arr = {5, 1, 3, 4, 2, 7};
        int[] arr = {8, 5, 3, 1, 4, 6, 10, 11, 14};

        for(int i: arr){
            root = bstree.insert(root, i);
        }

        bstree.inorder(root);
        System.out.println();
        System.out.println(bstree.search(root, 3));
        
        root = bstree.delete(root, 5);
        System.out.println();
        bstree.inorder(root);
        System.out.println();

        bstree.printInRange(root, 6, 10);
        System.out.println("\n");

        ArrayList<Integer> path = new ArrayList<>();
        bstree.printRootToLeaf(root, path);

    }

}
