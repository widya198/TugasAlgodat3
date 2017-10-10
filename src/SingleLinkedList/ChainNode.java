
package SingleLinkedList;

public class ChainNode {
    Object element;
    ChainNode next;
    
    ChainNode(){
        
    }
    ChainNode(Object Element){
        this.element = element;
    }

    public ChainNode(Object element, ChainNode next) {
        this.element = element;
        this.next = next;
    }
}
