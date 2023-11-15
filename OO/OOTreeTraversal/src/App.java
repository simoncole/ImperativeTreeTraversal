import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

        // for(int i = 0; i < 17; i++) {
        //     System.out.println("Finished creating tree" + nodes.get(i).getValue());
        // }

        // ArrayList<Integer> DFSequence = depthFirstTraveral(nodes.get(0));
        // for(int i = 0; i < DFSequence.size(); i++) {
        //     System.out.println(DFSequence.get(i));
        // }

        ArrayList<Integer> BFSequence = breadthFirstTraversal(nodes.get(0));
        for(int i = 0; i < BFSequence.size(); i++) {
            System.out.println(BFSequence.get(i));
        }
    }

    public static ArrayList<Integer> depthFirstTraveral(TreeNode<Integer> root) {
        ArrayList<Integer> sequence = new ArrayList<>();

        HashSet<TreeNode<Integer>> visited = new HashSet<>();
        Stack<TreeNode<Integer>> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            boolean unvisited = false;

            //iterate through children to see if there are any unvisited
            ArrayList<TreeNode<Integer>> stackTopChildren = stack.peek().getChildren();
            for(int i = 0; i < stackTopChildren.size(); i++) {
                if(!visited.contains(stackTopChildren.get(i))) {
                    stack.push(stackTopChildren.get(i));
                    unvisited = true;
                    break;
                }
            }

            if(!unvisited) {
                visited.add(stack.peek());
                sequence.add(stack.pop().getValue());
            }
        }

        return sequence;
    }

    public static ArrayList<Integer> breadthFirstTraversal(TreeNode<Integer> root) {
        ArrayList<Integer> sequence = new ArrayList<>();

        HashSet<Integer> visited = new HashSet<>();

        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            //visit
            visited.add(queue.peek().getValue());
            sequence.add(queue.peek().getValue());

            //add children to the queue
            for(int i = 0; i < queue.peek().getChildren().size(); i++) {
                queue.add(queue.peek().getChildren().get(i));
            }

            //remove
            queue.poll();
        }

        return sequence;
    }
}
