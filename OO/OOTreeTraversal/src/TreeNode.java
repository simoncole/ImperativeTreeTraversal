import java.util.ArrayList;
 
public class TreeNode<T> {
 
    private T value;
    private ArrayList<TreeNode<T>> childNodes;
    
    public TreeNode(T value) {
        this.value = value;
        this.childNodes = new ArrayList<TreeNode<T>>();
    }
    
    public void addChild(TreeNode<T> childNode) {
        this.childNodes.add(childNode);
    }

    public ArrayList<TreeNode<T>> getChildren() {
        return this.childNodes;
    }
    
    public T getValue() {
        return value;
    }
  }
