import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;



/**
 * buildtree
 */
public class buildtree {

     public static class node{
        int data;
        node left;
        node right;
        public node(int data1){
            this.data = data1;
            this.left = null;
            this.right = null;
        }
    }
        public static node treebuild(node root,Scanner sc){
       System.out.println("enter data");
     
       int data = sc.nextInt();
       if(data == -1){
        return null;
       }
       root = new node(data);
       
       System.out.println("enter the data for left node"+ data);
       root.left = treebuild(root.left,sc);
       System.out.println("enter the data for right node "+ data);
       root.right = treebuild(root.right,sc);
       return root;
    }
    public static void levelwiseprint(node root){
        Queue<node> q =new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        if(root == null){
            System.out.println("tree is empty");
            return;
        }

        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            node temp =q.peek();
            q.poll();
            if(temp == null){
                System.out.println();
                if(!q.isEmpty()){
                    q.add(null);
                }
            }
            else{
                System.out.print(temp.data +"\t");
                st.add(temp.data);
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp. right!= null){
                    q.add(temp.right);
                }
                
            }
           
        }
        System.out.println();
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
    public static void inorder(node root){
        if (root==null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+"\t");
        inorder(root.right);
    }
    public static void preorder(node root){
        if (root==null) {
            return;
        }
        System.out.print(root.data+"\t");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(node root){
        if (root==null) {
            return;
        }
       
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+"\t");
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        node root = null;
        root = treebuild(root,sc);
        sc.close();
        levelwiseprint(root);
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
        
        
    }

}