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


import com.dao.KefangxuzuDao;
import com.entity.KefangxuzuEntity;
import com.service.KefangxuzuService;
import com.entity.vo.KefangxuzuVO;
import com.entity.view.KefangxuzuView;

@Service("kefangxuzuService")
public class KefangxuzuServiceImpl extends ServiceImpl<KefangxuzuDao, KefangxuzuEntity> implements KefangxuzuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KefangxuzuEntity> page = this.selectPage(
                new Query<KefangxuzuEntity>(params).getPage(),
                new EntityWrapper<KefangxuzuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KefangxuzuEntity> wrapper) {
		  Page<KefangxuzuView> page =new Query<KefangxuzuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KefangxuzuVO> selectListVO(Wrapper<KefangxuzuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KefangxuzuVO selectVO(Wrapper<KefangxuzuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KefangxuzuView> selectListView(Wrapper<KefangxuzuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KefangxuzuView selectView(Wrapper<KefangxuzuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
