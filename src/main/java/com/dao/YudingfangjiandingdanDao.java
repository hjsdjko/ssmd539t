package com.dao;

import com.entity.YudingfangjiandingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YudingfangjiandingdanVO;
import com.entity.view.YudingfangjiandingdanView;


/**
 * 预订房间订单
 * 
 * @author 
 * @email 
 * @date 2021-04-17 17:23:49
 */
public interface YudingfangjiandingdanDao extends BaseMapper<YudingfangjiandingdanEntity> {
	
	List<YudingfangjiandingdanVO> selectListVO(@Param("ew") Wrapper<YudingfangjiandingdanEntity> wrapper);
	
	YudingfangjiandingdanVO selectVO(@Param("ew") Wrapper<YudingfangjiandingdanEntity> wrapper);
	
	List<YudingfangjiandingdanView> selectListView(@Param("ew") Wrapper<YudingfangjiandingdanEntity> wrapper);

	List<YudingfangjiandingdanView> selectListView(Pagination page,@Param("ew") Wrapper<YudingfangjiandingdanEntity> wrapper);
	
	YudingfangjiandingdanView selectView(@Param("ew") Wrapper<YudingfangjiandingdanEntity> wrapper);
	
}
