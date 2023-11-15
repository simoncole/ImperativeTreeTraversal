import java.util.LinkedList;
 
public class TreeNode<T> {
 
    private T value;
    private LinkedList<TreeNode<T>> childNodes;
    
    public TreeNode(T value) {
        this.value = value;
        this.childNodes = new LinkedList<TreeNode<T>>();
    }
    
    public void addChild(TreeNode<T> childNode) {
        this.childNodes.add(childNode);
    }
    
    public T getValue() {
        return value;
    }
  }
