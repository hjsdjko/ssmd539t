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


import com.dao.JiudiankefuDao;
import com.entity.JiudiankefuEntity;
import com.service.JiudiankefuService;
import com.entity.vo.JiudiankefuVO;
import com.entity.view.JiudiankefuView;

@Service("jiudiankefuService")
public class JiudiankefuServiceImpl extends ServiceImpl<JiudiankefuDao, JiudiankefuEntity> implements JiudiankefuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiudiankefuEntity> page = this.selectPage(
                new Query<JiudiankefuEntity>(params).getPage(),
                new EntityWrapper<JiudiankefuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiudiankefuEntity> wrapper) {
		  Page<JiudiankefuView> page =new Query<JiudiankefuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiudiankefuVO> selectListVO(Wrapper<JiudiankefuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiudiankefuVO selectVO(Wrapper<JiudiankefuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiudiankefuView> selectListView(Wrapper<JiudiankefuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiudiankefuView selectView(Wrapper<JiudiankefuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
