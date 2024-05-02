package com.dao;

import com.entity.JiudiankefuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiudiankefuVO;
import com.entity.view.JiudiankefuView;


/**
 * 酒店客服
 * 
 * @author 
 * @email 
 * @date 2021-04-17 17:23:49
 */
public interface JiudiankefuDao extends BaseMapper<JiudiankefuEntity> {
	
	List<JiudiankefuVO> selectListVO(@Param("ew") Wrapper<JiudiankefuEntity> wrapper);
	
	JiudiankefuVO selectVO(@Param("ew") Wrapper<JiudiankefuEntity> wrapper);
	
	List<JiudiankefuView> selectListView(@Param("ew") Wrapper<JiudiankefuEntity> wrapper);

	List<JiudiankefuView> selectListView(Pagination page,@Param("ew") Wrapper<JiudiankefuEntity> wrapper);
	
	JiudiankefuView selectView(@Param("ew") Wrapper<JiudiankefuEntity> wrapper);
	
}
