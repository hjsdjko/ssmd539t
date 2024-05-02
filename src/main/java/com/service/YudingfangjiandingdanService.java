package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YudingfangjiandingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YudingfangjiandingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YudingfangjiandingdanView;


/**
 * 预订房间订单
 *
 * @author 
 * @email 
 * @date 2021-04-17 17:23:49
 */
public interface YudingfangjiandingdanService extends IService<YudingfangjiandingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YudingfangjiandingdanVO> selectListVO(Wrapper<YudingfangjiandingdanEntity> wrapper);
   	
   	YudingfangjiandingdanVO selectVO(@Param("ew") Wrapper<YudingfangjiandingdanEntity> wrapper);
   	
   	List<YudingfangjiandingdanView> selectListView(Wrapper<YudingfangjiandingdanEntity> wrapper);
   	
   	YudingfangjiandingdanView selectView(@Param("ew") Wrapper<YudingfangjiandingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YudingfangjiandingdanEntity> wrapper);
   	
}

