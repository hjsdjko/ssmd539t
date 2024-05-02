package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuidingxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuidingxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuidingxinxiView;


/**
 * 退订信息
 *
 * @author 
 * @email 
 * @date 2021-04-17 17:23:49
 */
public interface TuidingxinxiService extends IService<TuidingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuidingxinxiVO> selectListVO(Wrapper<TuidingxinxiEntity> wrapper);
   	
   	TuidingxinxiVO selectVO(@Param("ew") Wrapper<TuidingxinxiEntity> wrapper);
   	
   	List<TuidingxinxiView> selectListView(Wrapper<TuidingxinxiEntity> wrapper);
   	
   	TuidingxinxiView selectView(@Param("ew") Wrapper<TuidingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuidingxinxiEntity> wrapper);
   	
}

