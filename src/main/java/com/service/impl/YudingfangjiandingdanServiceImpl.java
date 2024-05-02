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


import com.dao.YudingfangjiandingdanDao;
import com.entity.YudingfangjiandingdanEntity;
import com.service.YudingfangjiandingdanService;
import com.entity.vo.YudingfangjiandingdanVO;
import com.entity.view.YudingfangjiandingdanView;

@Service("yudingfangjiandingdanService")
public class YudingfangjiandingdanServiceImpl extends ServiceImpl<YudingfangjiandingdanDao, YudingfangjiandingdanEntity> implements YudingfangjiandingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YudingfangjiandingdanEntity> page = this.selectPage(
                new Query<YudingfangjiandingdanEntity>(params).getPage(),
                new EntityWrapper<YudingfangjiandingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YudingfangjiandingdanEntity> wrapper) {
		  Page<YudingfangjiandingdanView> page =new Query<YudingfangjiandingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YudingfangjiandingdanVO> selectListVO(Wrapper<YudingfangjiandingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YudingfangjiandingdanVO selectVO(Wrapper<YudingfangjiandingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YudingfangjiandingdanView> selectListView(Wrapper<YudingfangjiandingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YudingfangjiandingdanView selectView(Wrapper<YudingfangjiandingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
