package com.example.demo.app;

/*
 * import宣言でControllerとRequestMappingをインポートする
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * ControllerとRequestMappingをアノテーションする
 */

@Controller
@RequestMapping("/sample")
public class SampleController {
	
	/*
	 * GetMappingをアノテーションし、model呼び出しtestを返す
	 */
	@GetMapping("/test")
	public String test(Model model) {
		model.addAttribute("title", "Inquiry Form");
		return "test";
	}
	
}
