import java.util.*;
public class BListDepth extends BList {
    ArrayList<Integer> depths = new ArrayList<Integer>();
    public BNodeDepth root;
    public int count;
    public int count2;
    public int nullcounter;
    public int maxdepth = 0;
    public int ipl;
    public int epl;
    
    public BListDepth(){
        root = null;
    }
    
    public void add(char d){
        BNodeDepth x = new BNodeDepth(d,0);
        if(root == null){
            root = x;
            count++;
            return;
        }
        BNodeDepth y = root;
        insert(x,y,0);
    }
    
    private void insert(BNodeDepth d, BNodeDepth current, int depth){
        if(d.data<=current.data){
            if(current.left == null){
                current.left = d;
                current.left.depth = current.depth + 1;
                if(current.left.depth>maxdepth){
                    maxdepth = current.left.depth;
                }
                count++;
            }
            else{
                insert(d,current.left,depth + 1);
            }
        }
        else{
            if(current.right == null){
                current.right = d;
                current.right.depth = current.depth + 1;
                if(current.right.depth>maxdepth){
                    maxdepth = current.right.depth;
                }
                count++;
            }
            else{
                insert(d,current.right,depth + 1);
            }
        }
    }
    
    public void print(BNodeDepth n){
        if(n == null){
            return;
        }
        print(n.left);
        System.out.println(n);
        ipl += n.depth;
        if(n.right == null){
            epl += n.depth + 1;
        }
        if(n.left == null){
            epl += n.depth + 1;
        }
        print(n.right);
       
    }
    
    public void findNode1(int targetDepth, BNodeDepth n){
        if(n == null){
            return;
        }
        if(n.depth == targetDepth){
            System.out.println(n);
            count2++;
        }
        else{
            findNode1(targetDepth, n.right);
            findNode1(targetDepth, n.left);
        }
    }
    
    public void findNode(int targetDepth, BNodeDepth n){
        findNode1(targetDepth,n);
        if(count2 == 0){
            System.out.println("this depth does not exist");
        }
    }
    
    public void ChildShow(BNodeDepth n){
        if(n == null){
            return;
        }
        ChildShow(n.left);
        if((n.right == null && n.left != null)||(n.right != null && n.left == null)){
            System.out.println(n);
        }
        ChildShow(n.right);
    }
    public void CountEmptydo(BNodeDepth n){
        if(n == null){
            nullcounter++;
            return;
        }
        CountEmptydo(n.left);
        if(n.right == null){
            nullcounter++;
        }
        if(n.left == null){
            nullcounter++;
        }
        CountEmptydo(n.right);
    }
    public int CountEmpty(BNodeDepth n){
        CountEmptydo(n);
        return (nullcounter/2);
    }
    
    public void Duplicatedo(BNodeDepth n){
        if(n == null){
            return;
        }
        Duplicatedo(n.left);
        if(n.data==root.data){
            depths.add(n.depth);
        }
        Duplicatedo(n.right);
    }
    public void Duplicate(BNodeDepth n){
        Duplicatedo(n);
        int topnum = 0;
        
        for(int i = 0; i < depths.size();i++ ){
            if(depths.get(i)>topnum){
                topnum = depths.get(i);
            }
        }
        if(topnum == 0 ){
            System.out.println("You have no duplicates");
        }
        else{
            System.out.println(topnum);
        }
    }
    
    
    
    
    
    
    
    public int getIPL(){
        return ipl;
    }
    
    public int getEPL(){
        return epl;
    }
    
    public int getMaxDepth(){
        return maxdepth;
    }
    
     
    
}
