import java.util.ArrayList;
import java.util.LinkedList;

public class CVertex {
  public CPoint m_Point;
  public LinkedList<CVertex> m_Neighbors;
  // Campos para el algoritmo de Dijkstra
  public double m_DijkstraDistance;
  public boolean m_DijkstraVisit;
  public CVertex m_DijkstraPrevious;
  ////
  public int m_VertexID;

  // Campos para el algoritmo de backtracking
  public boolean m_VertexToVisit; // Vertice a visitar (en lista visits)
  public boolean m_VisitedVertex;
  public int m_allowedVisits;
  public ArrayList<CVertex> dijkstraData;

  public CVertex(double x, double y) {
    m_Point = new CPoint(x, y);
    m_Neighbors = new LinkedList<CVertex>();
    m_allowedVisits = 0;
    m_VisitedVertex = false;
  }
  
  public CVertex(CPoint point, double m_DijkstraDistance){
    this.m_Point = new CPoint(point.m_X, point.m_Y);
    this.m_DijkstraDistance = m_DijkstraDistance;  
  }
  
  public String toString(){
    return m_Point.toString();
  }

  public void clearDijkstra() {}

}
