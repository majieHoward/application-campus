package com.howard.www.business.controller;

import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.howard.www.core.data.transfer.dto.IDataTransferObject;

@Controller
public class CampusTemplateController {
	protected final Logger log = LoggerFactory.getLogger(CampusTemplateController.class);

	@RequestMapping("/campusCircles.html")
	public String campusCircles(Map<String, Object> map, IDataTransferObject paramOfDto) {

		return "/campusCircles";
	}

	@RequestMapping("/detailPage.html")
	public String detailPage(Map<String, Object> map, IDataTransferObject paramOfDto) {
		return "/detailPage";
	}
	
	@RequestMapping("/campusNotes.html")
	public String campusNotes(Map<String, Object> map, IDataTransferObject paramOfDto) {
		return "/campusNotes";
	}

	@RequestMapping("/flashShot.html")
	public String flashShot(Map<String, Object> map, IDataTransferObject paramOfDto) {

		return "/flashShot";
	}

	@RequestMapping("/photoControl.html")
	public String photoControl(Map<String, Object> map, IDataTransferObject paramOfDto) {

		return "/photoControl";
	}

	@RequestMapping("/tab-webview-subpage-about.html")
	public String about(Map<String, Object> map, IDataTransferObject paramOfDto) {

		return "/tab-webview-subpage-about";
	}

	@RequestMapping("/tab-webview-subpage-setting.html")
	public String setting(Map<String, Object> map, IDataTransferObject paramOfDto) {

		return "/tab-webview-subpage-setting";
	}
}
