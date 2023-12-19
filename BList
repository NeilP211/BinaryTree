import java.util.*;
public class BList {
    public BNode root;
    public BList(){
        root = null;
    }
    public void show(){
        print(root);
    }
    public void print(BNode node){
        if(node == null){
            return;
        }
        print(node.left);
        System.out.print(node.data + " ");
        print(node.right);
    
    }
    public boolean addog(char d){
        BNode add= new BNode(d);
        boolean b = true;
        BNode current = root;
        if(root == null){
            root = add;
            return true;
        }
        else{
            while(b){
                if(d>current.data){
                    if(current.right == null){
                        current.right = add ;
                        current = current.right;
                        b = false;
                    }
                    current = current.right;
                }
                else{
                    if(current.left == null){
                        current.left = add;
                        current = current.left;
                        b = false;
                    }
                    current = current.left;
                }
            }
        }
        return true;
    }
    
    
    
}
