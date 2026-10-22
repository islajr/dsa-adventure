# LC 981: [Time Based Key-Value Store]


> **Date:** [2026-10-22]

> **Description:** [LC 981](https://leetcode.com/problems/time-based-key-value-store/description/)

> **Difficulty:** [Medium]

> **Category:** [[dsa-concepts#[Binary Search|Binary Search]]

## Approach

### [Sorted Map]

> **Time Complexity:** $O(n)$ or $O(\log n)$ for $set()$ and $O(\log n)$ for $get()$

> **Space Complexity:** $O(m * n)$

This problem is rather nuanced. It requires us to design a time based key-value data structure. This data structure supports two operations: `set(key, value, timestamp)` and `get(key, timestamp)`. The nuanced part is the `get()` method that should return **the greatest value less than or equal to the requested timestamp**. 

Given the complex nature of this ask, we require a data structure that can keep the timestamps in sorted order. This is known as a `TreeMap` in java. Upon initialization, we do so as a nested map: `Map<String, TreeMap<Integer, String>>`. Storing the element and timestamp is a simple case of appending to the map.

Retrieval is a bit more complex, however. Firstly, we check if the key is not present and return a blank string `""` per the problem spec. Then we have to find the largest stored element less than or equal to the requested timestamp. The TreeMap operation `.floorEntry()` does this perfectly, and in logarithmic time. This leaves us with the simple task of returning either an empty string or the expected value.

``` java
public class TimeMap {
	private Map<String, TreeMap<Integer, String>> m;
	
	public TimeMap() {
		m = new HashMap();
	}
	
	public void set(String key, String value, int timestamp) {
		m.computeIfAbsent(key, k -> new TreeMap()).put(timestamp, value);
	}
	
	public String get(String key, int timestamp) {
		if (!m.containsKey(key)) return "";
		TreeMap<Integer, String> timestamps = m.get(key);
		Map.Entry<Integer, String> entry = timestamps.floorEntry(timestamp);
		return entry == null ? "" : entry.getValue();
	}
}
```

---
*Tags: #dsa #leetcode #binary-search*
