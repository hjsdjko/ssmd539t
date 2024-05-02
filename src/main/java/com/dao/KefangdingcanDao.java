package com.dao;

import com.entity.KefangdingcanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KefangdingcanVO;
import com.entity.view.KefangdingcanView;


/**
 * 客房订餐
 * 
 * @author 
 * @email 
 * @date 2021-04-17 17:23:49
 */
public interface KefangdingcanDao extends BaseMapper<KefangdingcanEntity> {
	
	List<KefangdingcanVO> selectListVO(@Param("ew") Wrapper<KefangdingcanEntity> wrapper);
	
	KefangdingcanVO selectVO(@Param("ew") Wrapper<KefangdingcanEntity> wrapper);
	
	List<KefangdingcanView> selectListView(@Param("ew") Wrapper<KefangdingcanEntity> wrapper);

	List<KefangdingcanView> selectListView(Pagination page,@Param("ew") Wrapper<KefangdingcanEntity> wrapper);
	
	KefangdingcanView selectView(@Param("ew") Wrapper<KefangdingcanEntity> wrapper);
	
}
