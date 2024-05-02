package com.dao;

import com.entity.FangjianfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangjianfenleiVO;
import com.entity.view.FangjianfenleiView;


/**
 * 房间分类
 * 
 * @author 
 * @email 
 * @date 2021-04-17 17:23:49
 */
public interface FangjianfenleiDao extends BaseMapper<FangjianfenleiEntity> {
	
	List<FangjianfenleiVO> selectListVO(@Param("ew") Wrapper<FangjianfenleiEntity> wrapper);
	
	FangjianfenleiVO selectVO(@Param("ew") Wrapper<FangjianfenleiEntity> wrapper);
	
	List<FangjianfenleiView> selectListView(@Param("ew") Wrapper<FangjianfenleiEntity> wrapper);

	List<FangjianfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<FangjianfenleiEntity> wrapper);
	
	FangjianfenleiView selectView(@Param("ew") Wrapper<FangjianfenleiEntity> wrapper);
	
}
