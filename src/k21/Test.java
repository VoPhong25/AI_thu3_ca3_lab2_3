package k21;

public class Test {
	public static void main(String[] args) {
//		Node nodeS = new Node("S");
//		Node nodeA = new Node("A");
//		Node nodeB = new Node("B");
//		Node nodeC = new Node("C");
//		Node nodeD = new Node("D");
//		Node nodeE = new Node("E");
//		Node nodeF = new Node("F");
//		Node nodeG = new Node("G");
//		Node nodeH = new Node("H");
//		nodeS.addEdge(nodeA, 5);
//		nodeS.addEdge(nodeB, 2);
//		nodeS.addEdge(nodeC, 4);
//		nodeA.addEdge(nodeD, 9);
//		nodeA.addEdge(nodeE, 4);
//		nodeB.addEdge(nodeG, 6);
//		nodeC.addEdge(nodeF, 2);
//		nodeD.addEdge(nodeH, 7);
//		nodeE.addEdge(nodeG, 6);
//		nodeF.addEdge(nodeG, 1);

		Node nodeS = new Node("S");
		Node nodeA = new Node("A");
		Node nodeB = new Node("B");
		Node nodeC = new Node("C");
		Node nodeD = new Node("D");
		Node nodeE = new Node("E");
		Node nodeF = new Node("F");
		Node nodeG = new Node("G");
		Node nodeH = new Node("H");
		Node nodeP = new Node("P");
		Node nodeQ = new Node("Q");
		Node nodeR = new Node("R");

		nodeS.addEdge(nodeD, 3);
		nodeS.addEdge(nodeE, 9);
		nodeS.addEdge(nodeP, 1);
		nodeD.addEdge(nodeB, 1);
		nodeD.addEdge(nodeC, 8);
		nodeD.addEdge(nodeE, 2);
		nodeB.addEdge(nodeA, 2);
		nodeC.addEdge(nodeA, 2);
		nodeP.addEdge(nodeQ, 15);
		nodeQ.addEdge(nodeR, 3);
		nodeR.addEdge(nodeF, 5);
		nodeF.addEdge(nodeG, 5);
		nodeF.addEdge(nodeC, 5);
		nodeE.addEdge(nodeH, 1);
		nodeE.addEdge(nodeR, 9);
		nodeH.addEdge(nodeP, 4);
		nodeH.addEdge(nodeQ, 4);

//		ISearchAlgo algo1 = new BreadthFirstSearchAlgo();
//		Node result1 = algo1.execute(nodeS, "G");
//		System.out.println("bfs");
//		System.out.println(NodeUtils.printPath(result1));
//		
//		System.out.println("bfs start");
//		Node result1_1 = algo1.execute(nodeS, "A", "G");
//		System.out.println(NodeUtils.printPath(result1_1));

//		ISearchAlgo algo2 = new DepthFirstSearchAlgo();
//		Node result2 = algo2.execute(nodeS, "G");
//		System.out.println("dfs");
//		System.out.println(NodeUtils.printPath(result2));
//
//		System.out.println("dfs start");
//		Node result2_1 = algo2.execute(nodeS, "A", "G");
//		System.out.println(NodeUtils.printPath(result2_1));
//		
//	
//		ISearchAlgo algo3 = new UniformCostSearchAlgo();
//		Node result3 = algo3.execute(nodeS, "G");
//		System.out.println("ucs");
//		System.out.println(NodeUtils.printPath(result3));
//		
//		System.out.println("ucs start");
//		Node result3_1 = algo3.execute(nodeS, "A", "G");
//		System.out.println(NodeUtils.printPath(result3_1));
//		
//		
		DepthLimited algo4 = new DepthLimited();
		Node result4 = algo4.execute(nodeS, "Q", 6);
		System.out.println("deep");
		System.out.println(NodeUtils.printPath(result4));

	}
}
