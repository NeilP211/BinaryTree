import java.util.*;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner (System.in);
        ArrayList<Character> numlist1 = new ArrayList<Character>();
        System.out.println("What word do you want for this program");
        String word = kb.nextLine();
        for(int i = 0; i < word.length(); i++){
            numlist1.add(word.charAt(i));
        }
        BListDepth b1 = new BListDepth();
        for(int i = 0; i < numlist1.size();i++){
            System.out.println(numlist1.get(i));
            b1.add(numlist1.get(i));
        }
        
        System.out.println();
        

        
        b1.ChildShow(b1.root);
        System.out.println(b1.CountEmpty(b1.root));
        b1.Duplicate(b1.root);
        
        
        
        
        
        
        
        
    }
}
