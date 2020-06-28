package june_challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Reconstructitineary {

	/*
	 Given a list of airline tickets represented by pairs of departure and arrival airports [from, to], reconstruct the itinerary in order. All of the tickets belong to a man who departs from JFK. Thus, the itinerary must begin with JFK.

	 Note:

	 If there are multiple valid itineraries, you should return the itinerary that has the smallest lexical order when read as a single string. For example, the itinerary ["JFK", "LGA"] has a smaller lexical order than ["JFK", "LGB"].
	 All airports are represented by three capital letters (IATA code).
	 You may assume all tickets form at least one valid itinerary.
	 One must use all the tickets once and only once.
	 */
	
	public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> flightsMap = new HashMap<String, PriorityQueue<String>>();
        for(List<String> ticket : tickets) {
            flightsMap.putIfAbsent(ticket.get(0), new PriorityQueue<String>());
            flightsMap.get(ticket.get(0)).add(ticket.get(1));
        }
        
        ArrayList<String> res = new ArrayList<>();
        visit("JFK", flightsMap, res);
        return res;
    }
    
    private void visit(String airport, Map<String, PriorityQueue<String>> map, ArrayList<String> res) {
        PriorityQueue<String> pq = map.get(airport);
        
        while(pq!=null && !pq.isEmpty()) {
            visit((String)pq.poll(), map, res);
        }
        
        res.add(0, airport);
    }
}
