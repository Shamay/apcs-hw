1.What is the difference between the  TreeMap and TreeSet?
TreeMap is a map implementation which means that it stores elements as key value pairs where as TreeSet is a set implementation which has the property of no duplicates.

2. Internally, how is a HashMap implemented?
A HashMap takes both an array of keys and an array of values, mapping each key to one value. It does not take into account the ordering of the keys.

3. Internally, how is a TreeMap implemented?
A TreeMap takes both an array of keys and an array of values, mapping each key to one value. It does take into account the ordering of the keys.

4. Speed comparison between HashMaps and TreeMaps:
Hashmaps were faster in almost all cases because the order of the keys was not important in my specific tests, as it would generally be. A TreeMap would be more effective if ordering would be required for the keys.

5.Java has a built in Heap data structure but it's not named Heap.
What is it?
PriorityQueue