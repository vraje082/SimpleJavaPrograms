package binarysearchtree;

/**
 * Created by Vasanth on 2017-06-11.
 */
public class BinarySearchTreeAddAndReturnNode {


    public Node add(Node root, int data){
        Node node = new Node(data);
        if(data<root.getData()){
            if(root.getLeftNode()==null){
                root.setLeftNode(node);
            } else{
                add(root.getLeftNode(),data);
            }
        }
        if(data>root.getData()){
            if(root.getRightNode()==null){
                root.setRightNode(node);
            }else{
                add(root.getRightNode(),data);
            }
        }
        return root;
    }

    static Node Insert(Node root, int value){
        Node node = new Node();
        node.data = value;

        if(value<root.getData()){
            if(root.getLeftNode()==null){
                root.setLeftNode(node);
            }else{
                Insert(root.getLeftNode(),value);
            }
        }

        if(value>root.getData()){
            if(root.getRightNode()==null){
                root.setRightNode(node);
            }else{
                Insert(node.getRightNode(),value);
            }
        }
        return root;
    }
}
