package com.denis.kisina.wee1;

import java.util.Queue;
import java.util.Stack;

public class MyHashSet {

	/** Initialize your data structure here. */
	int set[] = new int[1000001];

	public MyHashSet() {
		Stack<E>

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
		obj.add(3);
		obj.remove(3);
		boolean param_3 = obj.contains(2);

		System.out.println(param_3);
	}
}

/**
 * Your MyHashSet object will be instantiated and called as such: MyHashSet obj
 * = new MyHashSet(); obj.add(key); obj.remove(key); boolean param_3 =
 * obj.contains(key);
 */
