package com.dao;

import com.entity.KefangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KefangxinxiVO;
import com.entity.view.KefangxinxiView;


/**
 * 客房信息
 * 
 * @author 
 * @email 
 * @date 2021-04-17 17:23:49
 */
public interface KefangxinxiDao extends BaseMapper<KefangxinxiEntity> {
	
	List<KefangxinxiVO> selectListVO(@Param("ew") Wrapper<KefangxinxiEntity> wrapper);
	
	KefangxinxiVO selectVO(@Param("ew") Wrapper<KefangxinxiEntity> wrapper);
	
	List<KefangxinxiView> selectListView(@Param("ew") Wrapper<KefangxinxiEntity> wrapper);

	List<KefangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<KefangxinxiEntity> wrapper);
	
	KefangxinxiView selectView(@Param("ew") Wrapper<KefangxinxiEntity> wrapper);
	
}
