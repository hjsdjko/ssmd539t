package com.dao;

import com.entity.RuzhuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RuzhuxinxiVO;
import com.entity.view.RuzhuxinxiView;


/**
 * 入住信息
 * 
 * @author 
 * @email 
 * @date 2021-04-17 17:23:49
 */
public interface RuzhuxinxiDao extends BaseMapper<RuzhuxinxiEntity> {
	
	List<RuzhuxinxiVO> selectListVO(@Param("ew") Wrapper<RuzhuxinxiEntity> wrapper);
	
	RuzhuxinxiVO selectVO(@Param("ew") Wrapper<RuzhuxinxiEntity> wrapper);
	
	List<RuzhuxinxiView> selectListView(@Param("ew") Wrapper<RuzhuxinxiEntity> wrapper);

	List<RuzhuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<RuzhuxinxiEntity> wrapper);
	
	RuzhuxinxiView selectView(@Param("ew") Wrapper<RuzhuxinxiEntity> wrapper);
	
}
