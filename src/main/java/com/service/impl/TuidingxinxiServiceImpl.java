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


import com.dao.TuidingxinxiDao;
import com.entity.TuidingxinxiEntity;
import com.service.TuidingxinxiService;
import com.entity.vo.TuidingxinxiVO;
import com.entity.view.TuidingxinxiView;

@Service("tuidingxinxiService")
public class TuidingxinxiServiceImpl extends ServiceImpl<TuidingxinxiDao, TuidingxinxiEntity> implements TuidingxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuidingxinxiEntity> page = this.selectPage(
                new Query<TuidingxinxiEntity>(params).getPage(),
                new EntityWrapper<TuidingxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuidingxinxiEntity> wrapper) {
		  Page<TuidingxinxiView> page =new Query<TuidingxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuidingxinxiVO> selectListVO(Wrapper<TuidingxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuidingxinxiVO selectVO(Wrapper<TuidingxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuidingxinxiView> selectListView(Wrapper<TuidingxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuidingxinxiView selectView(Wrapper<TuidingxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
