package com.tcg.json;
import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListCustom<E> extends ArrayList<E> {

		public boolean allowDuplicates;
		public ArrayListCustom(boolean allowDuplicates) {
			this.allowDuplicates = allowDuplicates;
		}
		HashSet <Object> mySet = new HashSet<Object>();
		public boolean add(E e) {
			if(this.allowDuplicates == false && mySet.add(e) == false) {
				throw new IllegalArgumentException("no duplicates allowed");
			}
			else if(this.allowDuplicates == true && mySet.add(e) == false){
				super.add(e);
			}
			return allowDuplicates;
		}
		
			
}
