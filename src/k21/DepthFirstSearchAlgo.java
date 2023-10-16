package k21;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;




public class DepthFirstSearchAlgo implements ISearchAlgo {
	Stack<Node> frontier = new Stack<Node>();

	@Override
	public Node execute(Node root, String goal) {
		Stack<Node> frontier = new Stack<Node>();
		ArrayList<Node> visit = new ArrayList();
		frontier.push(root);
		while (!frontier.empty()) {
			Node temp = frontier.pop();
			List<Node> childrenNode = temp.getChildrenNodes();
			Collections.reverse(childrenNode);
			if (!visit.contains(temp)) {
				visit.add(temp);
				if (temp.getLabel().equals(goal)) {
					return temp;
				}
				for (Node chill : childrenNode) {
					if (!visit.contains(chill)) {
						frontier.push(chill);
						chill.setParent(temp);
					}
				}
			}
		}
		return null;
	}


	@Override
	public Node execute(Node root, String start, String goal) {
		Stack<Node> frontier = new Stack<Node>();
		ArrayList<Node> visit = new ArrayList();
		frontier.push(root);
		while (!frontier.empty()) {
			Node temp = frontier.pop();
			List<Node> childrenNode = temp.getChildrenNodes();
			Collections.reverse(childrenNode);
			if (!visit.contains(temp)) {
				visit.add(temp);
				if (temp.getLabel().equals(goal)) {
					return temp;
				}
				for (Node chill : childrenNode) {
					if (!visit.contains(chill)) {
						frontier.push(chill);
						chill.setParent(temp);
					}
				}
				for (Node node : childrenNode) {
					if (node.getLabel() == start) {
						node.setParent(null);
						frontier.clear();
						visit.clear();
						frontier.push(node);
					}
				}
			}
		}
		return null;
	}

}
