import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<TreeNode<Integer>> nodes = new ArrayList<>();

        // Create 17 nodes and add them to the list
        for (int i = 1; i <= 17; i++) {
            nodes.add(new TreeNode<Integer>(i));
        }
        
        nodes.get(0).addChild(nodes.get(1)); 
        nodes.get(0).addChild(nodes.get(2)); 
        nodes.get(0).addChild(nodes.get(3)); 
        
        nodes.get(1).addChild(nodes.get(4)); 
        nodes.get(1).addChild(nodes.get(5)); 
        
        nodes.get(2).addChild(nodes.get(6)); 
        nodes.get(2).addChild(nodes.get(7)); 
        
        nodes.get(3).addChild(nodes.get(8)); 
        nodes.get(3).addChild(nodes.get(9)); 
        
        nodes.get(4).addChild(nodes.get(10));
        nodes.get(4).addChild(nodes.get(11));
        
        nodes.get(8).addChild(nodes.get(12));
        nodes.get(8).addChild(nodes.get(13));
        
        nodes.get(9).addChild(nodes.get(14));
        nodes.get(9).addChild(nodes.get(15));
        
        nodes.get(11).addChild(nodes.get(16));

        for(int i = 0; i < 17; i++) {
            System.out.println("Finished creating tree" + nodes.get(i).getValue());
        }
    }
}
