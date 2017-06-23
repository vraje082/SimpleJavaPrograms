package trees;

import org.junit.Test;

/**
 * Created by vasanthan on 2017-06-19.
 */
public class GenericBinaryTreeTest {
    @Test
    public void test(){
        GenericNode vdomRoot = new GenericNode("a");
        vdomRoot.setLeftNode(new GenericNode ("c "));
        vdomRoot.setRightNode(new GenericNode("d"));
        vdomRoot.getLeftNode().setLeftNode(new GenericNode("g"));
        vdomRoot.getLeftNode().setRightNode(new GenericNode("h"));
        vdomRoot.getRightNode().setLeftNode(new GenericNode("i"));


        GenericNode domRoot = new GenericNode("root");
        domRoot.setLeftNode(new GenericNode("a"));
        domRoot.setRightNode(new GenericNode("b"));
        domRoot.getLeftNode().setLeftNode(new GenericNode("c"));
        domRoot.getLeftNode().setRightNode(new GenericNode("d"));
        domRoot.getLeftNode().getLeftNode().setLeftNode(new GenericNode("g"));
        domRoot.getLeftNode().getLeftNode().setRightNode(new GenericNode("h"));
        domRoot.getLeftNode().getRightNode().setLeftNode(new GenericNode("i"));

        domRoot.getRightNode().setLeftNode(new GenericNode("e"));
        domRoot.getRightNode().setRightNode(new GenericNode("f"));
        domRoot.getRightNode().getLeftNode().setRightNode(new GenericNode("j"));
        domRoot.getRightNode().getLeftNode().getRightNode().setLeftNode(new GenericNode("k"));
        domRoot.getRightNode().getLeftNode().getRightNode().setRightNode(new GenericNode("l"));

       GenericBinaryTree tree = new GenericBinaryTree();
       System.out.println(tree.isSubtree(domRoot,vdomRoot));

      /*  String s1 = tree.stringFromPreOrder(domRoot);
        String s2 = tree.stringFromPreOrder(vdomRoot);
        System.out.println(s2.indexOf(s1));*/
    }
}
