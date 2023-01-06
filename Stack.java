package PracticeDay14;

import java.util.LinkedList;

	public class Stack<T> {

		LinkedList<T> list = new LinkedList<>();

		public void push(T key) {
			list.add(key);
		}

		public T pop() {
			return list.pop();
		}

		public T peek() {
			return list.peek();
		}

		public boolean isEmpty() {
			if (list.size() == 0) {
				return true;
			} else {
				return false;
			}
		}

		void print() {
			
			
		}

	}


