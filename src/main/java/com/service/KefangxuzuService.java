package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KefangxuzuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KefangxuzuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KefangxuzuView;


/**
 * 客房续租
 *
 * @author 
 * @email 
 * @date 2021-04-17 17:23:49
 */
public interface KefangxuzuService extends IService<KefangxuzuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KefangxuzuVO> selectListVO(Wrapper<KefangxuzuEntity> wrapper);
   	
   	KefangxuzuVO selectVO(@Param("ew") Wrapper<KefangxuzuEntity> wrapper);
   	
   	List<KefangxuzuView> selectListView(Wrapper<KefangxuzuEntity> wrapper);
   	
   	KefangxuzuView selectView(@Param("ew") Wrapper<KefangxuzuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KefangxuzuEntity> wrapper);
   	
}

