//read in the file in the main method and create the edges that way 
//call the
import java.io.*;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ListIterator;  

class WeightedGraph{
  private LinkedList<Edges> adj[]; ///linkedlist of edges for each node, 
  private int N; // number of nodes in the graph
  private char[] names; // names of each node
  
  WeightedGraph(int numNodes, char[] nodeNames){
      N = numNodes;
      adj = new LinkedList[N];
      names = new char[N];
      
      for(int i = 0; i < N; i++) {
         adj[i] = new LinkedList(); // create empty list of edges
         names[i] = nodeNames[i]; // name the current node
      }
  }

  public void addFriends(int startNode, int endNode, int weight){
      Edges edge = new Edges(startNode, endNode, weight);
      adj[startNode].add(edge);
  }
  
  public int getNumNodes() {
      return N;
  }
   
  public char[] getNodeNames() {
      return names;
  }
   
  public LinkedList<Edges>[] getAdjList() {
      return adj;
  }
  
  public String toString() {
      String output = new String();
      
      for(int i = 0; i < N; i++) {
         output += names[i] + ": ";
       
         
         output += "\n";  
      }
      
      return output;
   }
}

 //add weights to the edges
   class Edges{
      private int startNode;
      private int endNode;
      private int weight;
   
      public Edges(int _startNode, int _endNode, int _weight) {
        startNode = _startNode;
        endNode = _endNode;
        weight = _weight;
      }
      
      public int getWeight(){
         return weight;
      }
      
      public int getEndNode(){
         return endNode;
      }
      
      public int getStartNode(){
         return startNode;
      }
   }

public class TakeHomeExam{

   public static void main(String[] args){
      int numFriends = 0;
      int[] friends = null;
      
      
      //read in the file 
      try{
         File file = new File("friendships1.txt");
         Scanner scn = new Scanner(file);
         
         while(scn.hasNextLine()){
            
         }
      }
      
      catch(Exception e){
         System.out.println("Exception: " + e);
      }
   } 


} 