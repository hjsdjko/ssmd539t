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


import com.dao.KefangdingcanDao;
import com.entity.KefangdingcanEntity;
import com.service.KefangdingcanService;
import com.entity.vo.KefangdingcanVO;
import com.entity.view.KefangdingcanView;

@Service("kefangdingcanService")
public class KefangdingcanServiceImpl extends ServiceImpl<KefangdingcanDao, KefangdingcanEntity> implements KefangdingcanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KefangdingcanEntity> page = this.selectPage(
                new Query<KefangdingcanEntity>(params).getPage(),
                new EntityWrapper<KefangdingcanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KefangdingcanEntity> wrapper) {
		  Page<KefangdingcanView> page =new Query<KefangdingcanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KefangdingcanVO> selectListVO(Wrapper<KefangdingcanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KefangdingcanVO selectVO(Wrapper<KefangdingcanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KefangdingcanView> selectListView(Wrapper<KefangdingcanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KefangdingcanView selectView(Wrapper<KefangdingcanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
