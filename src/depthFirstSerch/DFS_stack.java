package depthFirstSerch;

import java.util.Stack;

public class DFS_stack {
	static boolean[] visited=new boolean[9];
	static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
	static Stack<Integer> stack=new Stack<Integer>();
	
	public static void main(String[] args) {
		stack.push(1);
		visited[1]=true;
		while(!stack.isEmpty()) {
			int nodeIndex=stack.pop();
			System.out.print(nodeIndex+"->");
			for(int LinkedNode:graph[nodeIndex]) {
				if(!visited[nodeIndex]) {
					stack.push(LinkedNode);
					visited[LinkedNode]=true;
				}
			}
		}
	}
}

