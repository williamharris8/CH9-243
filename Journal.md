PHASE 1 - PriorityQueue knows the company is smallest because the Company class implements Comparable and comparies by size in compareTo. To merge largest companies first I'd have to reverse the comparison by flipping compareTo.

PHASE 2 - More efficient is PriorityQueue since it only rearranges a small part of itself every add or company removal. ArrayList have to re sort the entire list every merger. Adding is O(log n) while sorting a whole list O(n log n).

PHASE 3 - If the check of queue size is forgotten the loops keeps calling poll and code would crash. Underflow happens when you try and remove something from a data structure thats already empty.