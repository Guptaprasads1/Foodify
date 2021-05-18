package com.online.foodDelivery.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.online.foodDelivery.model.Category;
import com.online.foodDelivery.service.CategoryService;

@Controller
public class OwnerController {
	
	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/owner")
	public String ownerHome() {
		return "restaurantOwnerHome";
	}
	@GetMapping("/owner/categories")
	public String getCategories(Model model) {
		model.addAttribute("categories", categoryService.getAllCategory());
		return "categories";
	}
	@GetMapping("/owner/categories/add")
	public String getaddCategories(Model model) {
		model.addAttribute("category", new Category());
		return "categories";
	}
	@PostMapping("/owner/categories/add")
	public String postCategories(@ModelAttribute("category") Category category) {
		categoryService.addCategory(category);
		return "redirect:/owner/categories";
	}
	@GetMapping("/owner/categories/delete/{id}")
	public String deleteCategory(@PathVariable int id) {
		categoryService.removeCategorybyId(id);
		return "redirect:/owner/categories";
	}
	@GetMapping("/owner/categories/delete/{id}")
	public String updateCategoryById(@PathVariable int id,Model model) {
		Optional<Category> category=categoryService.updateCategoryById(id);
		if(category.isPresent()) {
			model.addAttribute("category", category.get());
			return "categoriesAdd";
		}else {
			return "404";
		}
	}
}
