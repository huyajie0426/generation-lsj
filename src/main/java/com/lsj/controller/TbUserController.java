<<<<<<< HEAD
package com.lsj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/user")
public class TbUserController {
	
	@RequestMapping(value="/index")
	public String goIndex() {
		return "index";
	}
	
	@RequestMapping(value="/integral")
	public String goIntegral() {
		return "integral";
	}
	
	@RequestMapping(value="/login")
	public String goLogin() {
		return "login";
	}
	@RequestMapping(value="/order")
	public String goOrder() {
		return "order";
	}
	
	@RequestMapping(value="/productDetailes")
	public String goProductDetailes() {
		return "productDetailes";
	}
	
	@RequestMapping(value="/productList")
	public String goProductList() {
		return "productList";
	}
	
	@RequestMapping(value="/products")
	public String goProducts() {
		return "products";
	}
	
	@RequestMapping(value="/register")
	public String goRegister() {
		return "register";
	}
	
	@RequestMapping(value="/shoppingCart")
	public String goShoppingCart() {
		return "shoppingCart";
	}
	
	@RequestMapping(value="/user")
	public String goUser() {
		return "user";
	}
	
	@RequestMapping(value="/userAddress")
	public String goUserAddress() {
		return "userAddress";
	}
	
	@RequestMapping(value="/userCollect")
	public String goUserCollect() {
		return "userCollect";
	}
	
	@RequestMapping(value="/userInfo")
	public String goUserInfo() {
		return "userInfo";
	}
	
	@RequestMapping(value="/userIntegral")
	public String goUserIntegral() {
		return "userIntegral";
	}
	
	@RequestMapping(value="/userPassword")
	public String goUserPassword() {
		return "userPassword";
	}
	
}
=======
package com.lsj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/user")
public class TbUserController {
	
	@RequestMapping(value="/index")
	public String goIndex() {
		return "index";
	}
	
}
>>>>>>> branch 'master' of https://github.com/huyajie0426/generation-lsj.git
