package com.Manager.api;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Manager.model.Item;
import com.Manager.service.CategoryService;
import com.Manager.service.ItemService;
import com.Manager.service.impl.CategoryServiceImpl;
import com.Manager.service.impl.ItemServiceImpl;
import com.google.gson.Gson;

@WebServlet(urlPatterns = {"/item"})
public class ItemApi extends HttpServlet{
	private static ItemService itemService;
	static {
		itemService = new ItemServiceImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Item> result = new ArrayList<>();
		if(req.getParameter("category") != null) {
			result = itemService.getItemsByCategory(req.getParameter("category"));
		}else if(req.getParameter("name") != null){
			result = itemService.getItemsByName(req.getParameter("name"));
		}else {
			result = itemService.getAllItem();
		}
		
		Gson gson = new Gson();
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		out.print(gson.toJson(result));
		out.flush();
	}
}
