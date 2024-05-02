package com.entity.view;

import com.entity.YudingfangjiandingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 预订房间订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 17:23:49
 */
@TableName("yudingfangjiandingdan")
public class YudingfangjiandingdanView  extends YudingfangjiandingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YudingfangjiandingdanView(){
	}
 
 	public YudingfangjiandingdanView(YudingfangjiandingdanEntity yudingfangjiandingdanEntity){
 	try {
			BeanUtils.copyProperties(this, yudingfangjiandingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
