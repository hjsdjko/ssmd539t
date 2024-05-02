package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.FangjianfenleiDao;
import com.entity.FangjianfenleiEntity;
import com.service.FangjianfenleiService;
import com.entity.vo.FangjianfenleiVO;
import com.entity.view.FangjianfenleiView;

@Service("fangjianfenleiService")
public class FangjianfenleiServiceImpl extends ServiceImpl<FangjianfenleiDao, FangjianfenleiEntity> implements FangjianfenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangjianfenleiEntity> page = this.selectPage(
                new Query<FangjianfenleiEntity>(params).getPage(),
                new EntityWrapper<FangjianfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangjianfenleiEntity> wrapper) {
		  Page<FangjianfenleiView> page =new Query<FangjianfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangjianfenleiVO> selectListVO(Wrapper<FangjianfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangjianfenleiVO selectVO(Wrapper<FangjianfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangjianfenleiView> selectListView(Wrapper<FangjianfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangjianfenleiView selectView(Wrapper<FangjianfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
