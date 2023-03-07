
package norahlab7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class NorahLAB7 {

    public static void main(String[] args) {
           DiGraph g = new DiGraph(10);
g.addEdge(1, 0);
g.addEdge(0, 2);
g.addEdge(2, 1);
g.addEdge(0, 3);
g.addEdge(1, 4);
g.addEdge(4, 5);
g.addEdge(4, 6);
g.addEdge(4, 7);
g.addEdge(6, 7);
g.addEdge(6, 8);
g.addEdge(8, 9);
g.addEdge(9, 9);
g.printGraph();
System.out.println("Depth First Search visit order: "); g.DFS(0);
System.out.println();
System.out.println("Breadth First Search visit order: "); g.BFS(0);
    }
    
}

class DiGraph {
int V; 
   LinkedList<Integer> adj[]; 
  
DiGraph(int V) { this.V = V;
adj = new LinkedList[V];
for (int i = 0; i < adj.length; i++)
adj[i] = new LinkedList<Integer>();
 }

void addEdge(int v, int w) { 
    adj[v].add(w); 
}
void DFS(int s) {
  Vector<Boolean> visited = new Vector<Boolean>(V);  
  for (int i = 0; i < V; i++)
visited.add(false);  
    
  Stack<Integer> stack = new Stack<>();
  
  stack.push(s);
  
  while (stack.empty() == false) {
   s = stack.peek();
stack.pop(); 

if (visited.get(s) == false) {
   System.out.print(s + " ");
   visited.set(s, true);
}
Iterator<Integer> itr = adj[s].iterator();

while (itr.hasNext()) { 
    int v = itr.next();
    if(!visited.get(v))
        stack.push(v);
  }
   
}
}
void BFS(int s) {
  
}

public void printGraph() {
for (int src = 0; src < adj.length; src++){ 
    System.out.print(src);
 for (Integer dest : adj[src]) {
        System.out.print(" -> " + dest);
        }

System.out.println();
}
}
}
        