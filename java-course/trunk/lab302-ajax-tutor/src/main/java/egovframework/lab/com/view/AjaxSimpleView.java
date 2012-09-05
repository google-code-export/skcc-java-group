package egovframework.lab.com.view;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.AbstractView;

public class AjaxSimpleView extends AbstractView {

	@SuppressWarnings("unchecked")
    @Override
	protected void renderMergedOutputModel(Map model, HttpServletRequest request, HttpServletResponse response)
	        throws Exception {
		PrintWriter writer = null;
		try {
			response.setContentType("text/xml");
			response.setHeader("Cache-Control", "no-cache");
			response.setCharacterEncoding("UTF-8");

			writer = response.getWriter();
			writer.write((String) model.get("ajaxSimple"));
			
		} finally {

			writer.close();
		}
	}
}