package k21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class DepthLimited {
	public Node execute(Node root, String goal, int limited) {
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
				if (temp.getDepth() < limited) {
					for (Node chill : childrenNode) {
						if (!visit.contains(chill)) {
							frontier.push(chill);
							chill.setParent(temp);
							chill.setDepth(temp.getDepth() + 1);
						}
					}
				}
			}
		}
		return null;
	}
}
