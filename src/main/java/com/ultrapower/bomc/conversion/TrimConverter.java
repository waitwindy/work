package com.ultrapower.bomc.conversion;

import org.springframework.core.convert.converter.Converter;

public class TrimConverter implements Converter<String, String>{
	
	public String convert(String source) {
		// TODO Auto-generated method stub
		try {
			if(null != source){
				source = source.trim();
				if(!"".equals(source)){
					return source;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}

