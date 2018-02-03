package org.hazi.Collections.SetandHashSet;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StockList {
	private final Map<String, SortedStock> list;

	public StockList() {
		this.list = new HashMap<>();
	}
	
	public int addStock(SortedStock item){
		if(item != null){
			SortedStock inStock = list.getOrDefault(item.getName(), item);
			if(inStock != item){
				item.adjustStock(inStock.getQuantity());
			}
			list.put(item.getName(), item);
			return item.getQuantity();
		}
		return 0;
	}
	
	public int sellStock(String item, int quantity){
		SortedStock inStock = list.getOrDefault(item, null);
		
		if((inStock != null)  && (inStock.getQuantity() >= quantity) && (quantity >0)){
			inStock.adjustStock(-quantity);
			return quantity;
		}
		return 0;
	}
	
	public SortedStock get(String key){
		return list.get(key);
		
	}
	
	public Map<String, SortedStock> Items(){
		return Collections.unmodifiableMap(list);
	}
	
	
	
	

}
