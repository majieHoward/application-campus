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
 * @ClassName: CampusFunctionController
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: mayijie
 * @date: 2017年5月21日 上午4:05:30
 * 
 * @Copyright: 2017 https://github.com/majieHoward Inc. All rights reserved.
 */
@RestController
public class CampusFunctionController {
	protected final Logger log = LoggerFactory.getLogger(CampusFunctionController.class);

	@Autowired
	private ApplicationContext cApplicationContext;
    
	/**
	 * 
	 * @Title: obtainCampusCircles   
	 * @Description: TODO 分页获取校园圈内容
	 * @param: @param requiredParameter
	 * @param: @return
	 * @param: @throws Exception      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping("/campus/obtainCampusCircles.howard")
	public String obtainCampusCircles(IDataTransferObject requiredParameter) throws Exception {
		return FrameworkStringUtils.asString(JSONObject.fromObject(requiredParameter));
	}

	/**
	 * 
	 * @Title: obtainCampusCirclesCommentary   
	 * @Description: TODO 获取一条校园圈的所有评论
	 * @param: @param requiredParameter
	 * @param: @return
	 * @param: @throws Exception      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping("/campus/obtainCampusCirclesCommentary.howard")
	public String obtainCampusCirclesCommentary(IDataTransferObject requiredParameter) throws Exception {
		return FrameworkStringUtils.asString(JSONObject.fromObject(requiredParameter));
	}

	/**
	 * 
	 * @Title: comment   
	 * @Description: TODO 发表一条校园圈的评论   
	 * @param: @param requiredParameter
	 * @param: @return
	 * @param: @throws Exception      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping("/campus/comment.howard")
	public String comment(IDataTransferObject requiredParameter) throws Exception {
		System.out.println(FrameworkStringUtils.asString(JSONObject.fromObject(requiredParameter)));
		return FrameworkStringUtils.asString(JSONObject.fromObject(requiredParameter));
	}

	/**
	 * 
	 * @Title: obtainCampusCirclesLikes   
	 * @Description: TODO 获取一条校园圈的所有赞
	 * @param: @param requiredParameter
	 * @param: @return
	 * @param: @throws Exception      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping("/campus/obtainCampusCirclesLikes.howard")
	public String obtainCampusCirclesLikes(IDataTransferObject requiredParameter) throws Exception {
		return FrameworkStringUtils.asString(JSONObject.fromObject(requiredParameter));
	}

	/**
	 * 
	 * @Title: giveTheThumbsUp   
	 * @Description: TODO 为一条校园圈点赞
	 * @param: @param requiredParameter
	 * @param: @return
	 * @param: @throws Exception      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping("/campus/giveTheThumbsUp.howard")
	public String giveTheThumbsUp(IDataTransferObject requiredParameter) throws Exception {
		return FrameworkStringUtils.asString(JSONObject.fromObject(requiredParameter));
	}

	/**
	 * 
	 * @Title: publishCampusCircles   
	 * @Description: TODO 发表一条校园圈  
	 * @param: @param requiredParameter
	 * @param: @return
	 * @param: @throws Exception      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping("/campus/publishCampusCircles.howard")
	public String publishCampusCircles(IDataTransferObject requiredParameter) throws Exception {
		return FrameworkStringUtils.asString(JSONObject.fromObject(requiredParameter));
	}
	
	/**
	 * 
	 * @Title: removeCampusCircles   
	 * @Description: TODO 移除一条校园圈   
	 * @param: @param requiredParameter
	 * @param: @return
	 * @param: @throws Exception      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping("/campus/removeCampusCircles.howard")
	public String removeCampusCircles(IDataTransferObject requiredParameter) throws Exception {
		return FrameworkStringUtils.asString(JSONObject.fromObject(requiredParameter));
	}
}
