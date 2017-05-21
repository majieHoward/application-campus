package com.howard.www.business.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.howard.www.core.base.util.FrameworkStringUtils;
import com.howard.www.core.data.transfer.dto.IDataTransferObject;
import net.sf.json.JSONObject;
/**
 * 
 * @ClassName:  CampusFunctionController   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: mayijie
 * @date:   2017年5月21日 上午4:05:30   
 *     
 * @Copyright: 2017 https://github.com/majieHoward Inc. All rights reserved.
 */
@RestController
public class CampusFunctionController {
	protected final Logger log = LoggerFactory.getLogger(CampusFunctionController.class);
	
	@Autowired
	private ApplicationContext cApplicationContext;
	
	@RequestMapping("/campus/obtainCampusCircles.howard")
	public String obtainCampusCircles(IDataTransferObject requiredParameter)throws Exception{
		return FrameworkStringUtils.asString(JSONObject.fromObject(requiredParameter));
	}
	
}
