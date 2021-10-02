package com.example.demo.app;

/*
 * import�錾��Controller��RequestMapping���C���|�[�g����
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Controller��RequestMapping���A�m�e�[�V��������
 */

@Controller
@RequestMapping("/sample")
public class SampleController {
	
	/*
	 * GetMapping���A�m�e�[�V�������Amodel�Ăяo��test��Ԃ�
	 */
	@GetMapping("/test")
	public String test(Model model) {
		model.addAttribute("title", "Inquiry Form");
		return "test";
	}
	
}
