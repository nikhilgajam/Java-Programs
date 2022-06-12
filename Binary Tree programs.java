import java.util.*;

public class Jp{

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }

    }

    static class BinaryTree{

        static int idx = -1;

        public static Node createTree(int[] arr){

            idx++;

            if(arr[idx] == -1){
                return null;
            }

            Node new_node = new Node(arr[idx]);

            new_node.left = createTree(arr);
            new_node.right = createTree(arr);

            return new_node;

        }

    }

    public static void preorder(Node root){
        // O(N)
        if(root != null){
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }else{
            System.out.print("-1 ");
        }
    }

    public static void inorder(Node root){
        // O(N)
        if(root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void postorder(Node root){
        // O(N)
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void levelOrder(Node root){
        
        // O(N)
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){

            Node n = q.remove();

            if(n == null){
                System.out.println();  // Prints a newline
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(n.data + " ");

                if(n.left != null){
                    q.add(n.left);
                }

                if(n.right != null){
                    q.add(n.right);
                }

            }
        }

    }

    public static int countOfNodes(Node root){
        // O(N)
        if(root == null){
            return 0;
        }

        int leftCount = countOfNodes(root.left);
        int rightCount = countOfNodes(root.right);

        return leftCount + rightCount + 1;

    }

    public static int sumOfNodes(Node root){
        // O(N)
        if(root == null){
            return 0;
        }

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;

    }

    public static int heightOfTree(Node root){
        // O(N)
        if(root == null){
            return 0;
        }

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        // int myHeight = Math.max(leftHeight, rightHeight) + 1;
        // return myHeight;

        return Math.max(leftHeight, rightHeight) + 1;

    }

    public static int diameterOfTree1(Node root){
        // O(N^2)
        if(root == null){
            return 0;
        }

        int diam1 = diameterOfTree1(root.left);
        int diam2 = diameterOfTree1(root.right);
        int diam3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;

        return Math.max(diam1, Math.max(diam2, diam3));

    }

    static class TreeInfo{

        int height;
        int diameter;

        TreeInfo(int ht, int diam){
            height = ht;
            diameter = diam;
        }

    }

    public static TreeInfo diameterOfTree2(Node root){
        // O(N)
        if(root == null){
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameterOfTree2(root.left);
        TreeInfo right = diameterOfTree2(root.right);

        int myHeight = Math.max(left.height, right.height) + 1;

        int diam1 = left.diameter;
        int diam2 = right.diameter;
        int diam3 = left.height + right.height + 1;

        int myDiameter = Math.max(diam1, Math.max(diam2, diam3));

        TreeInfo treeInfo = new TreeInfo(myHeight, myDiameter);
        return treeInfo;

    }

    public static int sumOfNodesAtKthLevel(Node root, int k){

        int level = 0;
        int sum = 0;
        int flag = 0;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){

            int size = q.size();

            while((size--) > 0){

                Node n = q.remove();

                if(level == k){
                    flag = 1;
                    sum += n.data;
                }else{
                    if(n.left != null)
                        q.add(n.left);
                    if(n.right != null)
                        q.add(n.right);
                }
            }

            level++;

            if(flag == 1){
                break;
            }

        }

        return sum;

    }

    public static void main(String[] args){

        int arr[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        /*
        Creating binary tree with preorder
                  1
             /          \
            2            3
          /    \        /
         4      5      6

        */

        BinaryTree tree = new BinaryTree();
        Node root = tree.createTree(arr);

        preorder(root);
        System.out.println("\n");
        inorder(root);
        System.out.println("\n");
        postorder(root);
        System.out.println("\n");
        levelOrder(root);
        System.out.println();
        System.out.println(countOfNodes(root));
        System.out.println();
        System.out.println(sumOfNodes(root));
        System.out.println();
        System.out.println(heightOfTree(root));
        System.out.println();
        System.out.println(diameterOfTree1(root));
        System.out.println();
        System.out.println(diameterOfTree2(root).diameter);
        System.out.println();
        System.out.println(">>> " + sumOfNodesAtKthLevel(root, 2));

    }

}
