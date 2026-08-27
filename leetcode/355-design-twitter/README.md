# LC 355: [Design Twitter]


> **Date:** [2026-08-23]
> **Description:** [LC 355](https://leetcode.com/problems/design-twitter/description/)
> **Difficulty:** [Medium]
> **Category:** [[dsa-concepts#[Priority Queue|Priority Queue]]

## Approach

### [Sorting]

> **Time Complexity:**
> **Space Complexity:**  

This is the most intuitive solution to the problem. The problem is to design a simplified version of twitter where users can post tweets, follow/unfollow one another, and each user is able to see the `10` most recent tweets in their news feed.

To solve this, we create a tracker for the timestamp -- an integer that increments any time a tweet is posted to provide a way to properly track tweets. There is also a **map** for tweets and followers with the followers map containing a **set** for the values to ensure uniqueness of values, and the tweet map being a **list of integers** for storing the timestamp and the tweet id.

'Posting' the tweet is easy -- each user possesses an list of static integer arrays of tweet ids and their timestamps. We ensure idempotent operations at every point and update the map as required. The same logic follows for following and unfollowing, except for following, we need to ensure that users cannot follow themselves. This manifests as the preliminary check before following to ensure that `followerId` and `followeeId` are not the same.

For getting the news feed, things get a bit more complicated. The general idea is to collect the user's tweets and the tweets of all other users they follow and collate that into a list, sort it by the timestamp, and return the first ten tweets.


``` java
class Solution {
	private int time;
	private Map<Integer, Set<Integer>> followMap;
	private Map<Integer, List<int[]>> tweetMap;
	
	public Twitter() {
		time = 0;
		followMap = new HashMap<>();
		tweetMap = new HashMap<>();
	}
	
	public void postTweet(int userId, int tweetId) {
		tweetMap.putIfAbsent(userId, new ArrayList<>());
		tweetMap.get(userId).add(new int[]{time++, tweetId});
	}
	
	/* Collate each user's feed with theirs and other mutuals tweets */
	public List<Integer> getNewsFeed(int userId) {
		List<int[]> feed = tweetMap.getOrDefault(userId, new ArrayList<>());
		for (int followeeId : followMap.getOrDefault(userId, new HashSet<>()))
			feed.addAll(tweetMap.getOrDefault(followeeId), new ArrayList<>());
		// Sort feed
		feed.sort((a, b) -> b[0] - a[0]);  // lambda operation
		
		List<Integer> result = new ArrayList<>();
		
		for (int i = 0; i < Math.min(10, feed.size()); i++) {
			result.add(feed.get(i)[1])
		}
		
		return result;
	}
	
	/* Check for circular follow case first before enacting follow logic */
	public void follow(int followerId, int followeeId) {
		if (followerId != followeeId) {
			followMap.putIfAbsent(followerId, new HashSet<>());
			followMap.get(followerId).add(followeeId);
		}
	}
	
	public void unfollow(int followerId, int followeeId) {
		followMap.getOrDefault(followerId, new HashSet<>()).remove(followeeId);
	}
}
```

---
*Tags: #dsa #leetcode #priority-queue