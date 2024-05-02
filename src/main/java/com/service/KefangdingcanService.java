package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KefangdingcanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KefangdingcanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KefangdingcanView;


/**
 * 客房订餐
 *
 * @author 
 * @email 
 * @date 2021-04-17 17:23:49
 */
public interface KefangdingcanService extends IService<KefangdingcanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KefangdingcanVO> selectListVO(Wrapper<KefangdingcanEntity> wrapper);
   	
   	KefangdingcanVO selectVO(@Param("ew") Wrapper<KefangdingcanEntity> wrapper);
   	
   	List<KefangdingcanView> selectListView(Wrapper<KefangdingcanEntity> wrapper);
   	
   	KefangdingcanView selectView(@Param("ew") Wrapper<KefangdingcanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KefangdingcanEntity> wrapper);
   	
}

