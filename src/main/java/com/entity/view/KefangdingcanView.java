package com.entity.view;

import com.entity.KefangdingcanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 客房订餐
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 17:23:49
 */
@TableName("kefangdingcan")
public class KefangdingcanView  extends KefangdingcanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KefangdingcanView(){
	}
 
 	public KefangdingcanView(KefangdingcanEntity kefangdingcanEntity){
 	try {
			BeanUtils.copyProperties(this, kefangdingcanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
