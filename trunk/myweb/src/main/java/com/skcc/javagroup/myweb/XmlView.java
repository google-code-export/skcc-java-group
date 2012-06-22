package com.skcc.javagroup.myweb;

import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.Marshaller;

import org.springframework.web.servlet.view.AbstractView;

public class XmlView extends AbstractView {
	@Resource(name="jaxb2Marshaller")
	Marshaller marshaller;
	
	@Override
	protected void renderMergedOutputModel(Map<String, Object> model,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		response.setContentType("application/xml");
		response.setCharacterEncoding("UTF-8");
		StringBuilder xml = new StringBuilder();
		for(Entry<String, Object> entry: model.entrySet()){
			marshaller.marshal(entry, response.getWriter());
		}
//		System.out.println(xml);
//		response.getWriter().write(xml.toString());
	}

}
