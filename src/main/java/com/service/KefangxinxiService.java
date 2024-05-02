package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KefangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KefangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KefangxinxiView;


/**
 * 客房信息
 *
 * @author 
 * @email 
 * @date 2021-04-17 17:23:49
 */
public interface KefangxinxiService extends IService<KefangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KefangxinxiVO> selectListVO(Wrapper<KefangxinxiEntity> wrapper);
   	
   	KefangxinxiVO selectVO(@Param("ew") Wrapper<KefangxinxiEntity> wrapper);
   	
   	List<KefangxinxiView> selectListView(Wrapper<KefangxinxiEntity> wrapper);
   	
   	KefangxinxiView selectView(@Param("ew") Wrapper<KefangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KefangxinxiEntity> wrapper);
   	
}

