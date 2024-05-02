package com.dao;

import com.entity.KefangxuzuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KefangxuzuVO;
import com.entity.view.KefangxuzuView;


/**
 * 客房续租
 * 
 * @author 
 * @email 
 * @date 2021-04-17 17:23:49
 */
public interface KefangxuzuDao extends BaseMapper<KefangxuzuEntity> {
	
	List<KefangxuzuVO> selectListVO(@Param("ew") Wrapper<KefangxuzuEntity> wrapper);
	
	KefangxuzuVO selectVO(@Param("ew") Wrapper<KefangxuzuEntity> wrapper);
	
	List<KefangxuzuView> selectListView(@Param("ew") Wrapper<KefangxuzuEntity> wrapper);

	List<KefangxuzuView> selectListView(Pagination page,@Param("ew") Wrapper<KefangxuzuEntity> wrapper);
	
	KefangxuzuView selectView(@Param("ew") Wrapper<KefangxuzuEntity> wrapper);
	
}
