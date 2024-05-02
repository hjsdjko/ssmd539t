package com.entity.view;

import com.entity.JiudiankefuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 酒店客服
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 17:23:49
 */
@TableName("jiudiankefu")
public class JiudiankefuView  extends JiudiankefuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiudiankefuView(){
	}
 
 	public JiudiankefuView(JiudiankefuEntity jiudiankefuEntity){
 	try {
			BeanUtils.copyProperties(this, jiudiankefuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
