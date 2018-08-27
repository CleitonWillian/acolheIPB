package com.beews.util.json;

import java.time.LocalDate;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate>{

	@Override
	public LocalDate unmarshal(String v) throws Exception {
		
		 return LocalDate.parse(v, DataUtil.getDataFormat());
	}

	@Override
	public String marshal(LocalDate v) throws Exception {
		
		 return v.format(DataUtil.getDataFormat());
		 
	}

}
