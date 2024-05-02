package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiudiankefuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiudiankefuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiudiankefuView;


/**
 * 酒店客服
 *
 * @author 
 * @email 
 * @date 2021-04-17 17:23:49
 */
public interface JiudiankefuService extends IService<JiudiankefuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiudiankefuVO> selectListVO(Wrapper<JiudiankefuEntity> wrapper);
   	
   	JiudiankefuVO selectVO(@Param("ew") Wrapper<JiudiankefuEntity> wrapper);
   	
   	List<JiudiankefuView> selectListView(Wrapper<JiudiankefuEntity> wrapper);
   	
   	JiudiankefuView selectView(@Param("ew") Wrapper<JiudiankefuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiudiankefuEntity> wrapper);
   	
}

