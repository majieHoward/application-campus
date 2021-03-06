package com.howard.www.business.controller;

import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.howard.www.core.data.transfer.dto.IDataTransferObject;
/**
 * 
 * @ClassName:  CampusTemplateController   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: mayijie
 * @date:   2017年5月21日 上午4:05:24   
 *     
 * @Copyright: 2017 https://github.com/majieHoward Inc. All rights reserved.
 */
@Controller
public class CampusTemplateController {
	protected final Logger log = LoggerFactory.getLogger(CampusTemplateController.class);

	@RequestMapping("/campusCircles.html")
	public String campusCircles(Map<String, Object> map, IDataTransferObject requiredParameter) {

		return "/campusCircles";
	}

	@RequestMapping("/detailPage.html")
	public String detailPage(Map<String, Object> map, IDataTransferObject requiredParameter) {
		return "/detailPage";
	}
	
	@RequestMapping("/campusNotes.html")
	public String campusNotes(Map<String, Object> map, IDataTransferObject requiredParameter) {
		
		return "/campusNotes";
	}

	@RequestMapping("/flashShot.html")
	public String flashShot(Map<String, Object> map, IDataTransferObject requiredParameter) {

		return "/flashShot";
	}

	@RequestMapping("/photoControl.html")
	public String photoControl(Map<String, Object> map, IDataTransferObject requiredParameter) {

		return "/photoControl";
	}

	@RequestMapping("/tab-webview-subpage-about.html")
	public String about(Map<String, Object> map, IDataTransferObject requiredParameter) {

		return "/tab-webview-subpage-about";
	}

	@RequestMapping("/tab-webview-subpage-setting.html")
	public String setting(Map<String, Object> map, IDataTransferObject requiredParameter) {

		return "/tab-webview-subpage-setting";
	}
}
