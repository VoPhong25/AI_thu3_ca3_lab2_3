/**
 * 
 */
package k21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearchAlgo implements ISearchAlgo {

	@Override
	public Node execute(Node root, String goal) {
		ArrayList<Node> visit=new ArrayList<>();
		Queue<Node> frontier = new LinkedList<Node>();
		frontier.add(root);
		while(!frontier.isEmpty()) {
			Node begin= frontier.poll();
			visit.add(begin);
			if(begin.getLabel().equals(goal))
				return begin;
			
			for(Node child: begin.getChildrenNodes()) {
				if(!visit.contains(child)) {
					child.setParent(begin);
					frontier.add(child);
					visit.add(child);
					if(child.getLabel().equals(goal))
						return visit.get(visit.size()-1);
				}
			}
		}
		return null;
	}

	@Override
	public Node execute(Node root, String start, String goal) {
		ArrayList<Node> visit=new ArrayList<>();
		Queue<Node> frontier = new LinkedList<Node>();
		frontier.add(root);
		while(!frontier.isEmpty()) {
			Node begin= frontier.poll();
			visit.add(begin);
			if(begin.getLabel().equals(goal))
				return begin;
			
			for(Node child: begin.getChildrenNodes()) {
				if(!visit.contains(child)) {
					child.setParent(begin);
					frontier.add(child);
					visit.add(child);
					if(child.getLabel().equals(goal))
						return visit.get(visit.size()-1);
				}
			}
			for (Node node : begin.getChildrenNodes()) {
				if(node.getLabel().equals(start)) {
					node.setParent(null);
					frontier.clear();
					visit.clear();
					frontier.add(node);
				}
			}
		}
		return null;
	}
	

}
