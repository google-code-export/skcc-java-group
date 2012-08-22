package com.skcc.tutorial.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CodeService {
	CodeDao dao;
	Map<String, Code> cache = new ConcurrentHashMap<String, Code>();
	
	public Code getCode(String codeName){
		if(!cache.containsKey(codeName)) {
			Code code = dao.getCode(codeName);
			cache.put(codeName, code);
		}
		return cache.get(codeName);
	}
}
