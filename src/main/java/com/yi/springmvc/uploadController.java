package com.yi.springmvc;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/good")
public class uploadController {
	
	@RequestMapping("/upload")
	public String upload(HttpServletRequest httpR,MultipartFile upload) throws IllegalStateException, IOException {
		System.out.println("来了");
		String path = httpR.getSession().getServletContext().getRealPath("/uploads");
		File file = new File(path);
		if(!file.exists()){
			file.mkdir();
		}
		String ofn = upload.getOriginalFilename();
		String name = UUID.randomUUID().toString().replace("-", "");
		upload.transferTo(new File(path, name+"_"+ofn));
		return "success";
	}
	
	@RequestMapping("/beanBD")
	public String beanBD(String user) throws IllegalStateException, IOException {
		System.out.println(user);
		return "success";
	}
	@RequestMapping("/body")
	public String beanBody(User user) throws IllegalStateException, IOException {
		System.out.println(user);
		return "success";
	}
	@RequestMapping("/stringBody")
	public String beanBody(@RequestBody String user) throws IllegalStateException, IOException {
		System.out.println(user);
		return "success";
	}
	@RequestMapping("/sss")
	public @ResponseBody User sss(@RequestBody User user) throws IllegalStateException, IOException {
		System.out.println(user);
		return user ;
	}
	
	

}
