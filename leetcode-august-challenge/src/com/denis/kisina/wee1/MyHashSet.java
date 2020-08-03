package com.denis.kisina.wee1;

public class MyHashSet {

	/** Initialize your data structure here. */
	int set[] = new int[1000001];

	public MyHashSet() {

	}

	public void add(int key) {
		set[key] = 1;
	}

	public void remove(int key) {
		set[key] = 0;

	}

	/** Returns true if this set contains the specified element */
	public boolean contains(int key) {
		return set[key] == 1;
	}

	public static void main(String[] args) {
		MyHashSet obj = new MyHashSet();
		obj.add(2);
		obj.remove(2);
		boolean param_3 = obj.contains(2);
	}
}

/**
 * Your MyHashSet object will be instantiated and called as such: MyHashSet obj
 * = new MyHashSet(); obj.add(key); obj.remove(key); boolean param_3 =
 * obj.contains(key);
 */
