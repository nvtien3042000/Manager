package com.Manager.api;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Manager.service.CategoryService;
import com.Manager.service.impl.CategoryServiceImpl;
import com.google.gson.Gson;

@WebServlet(urlPatterns = {"/category"})
public class CategoryApi extends HttpServlet{
	private static CategoryService categoryService;
	static {
		categoryService = new CategoryServiceImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<String> result = categoryService.getAllCategory();
		Gson gson = new Gson();
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		out.print(gson.toJson(result));
		out.flush();
	}
}
