package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.TuidingxinxiEntity;
import com.entity.view.TuidingxinxiView;

import com.service.TuidingxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 退订信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-17 17:23:49
 */
@RestController
@RequestMapping("/tuidingxinxi")
public class TuidingxinxiController {
    @Autowired
    private TuidingxinxiService tuidingxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TuidingxinxiEntity tuidingxinxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			tuidingxinxi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<TuidingxinxiEntity> ew = new EntityWrapper<TuidingxinxiEntity>();
		PageUtils page = tuidingxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tuidingxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TuidingxinxiEntity tuidingxinxi, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			tuidingxinxi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<TuidingxinxiEntity> ew = new EntityWrapper<TuidingxinxiEntity>();
		PageUtils page = tuidingxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tuidingxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TuidingxinxiEntity tuidingxinxi){
       	EntityWrapper<TuidingxinxiEntity> ew = new EntityWrapper<TuidingxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tuidingxinxi, "tuidingxinxi")); 
        return R.ok().put("data", tuidingxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TuidingxinxiEntity tuidingxinxi){
        EntityWrapper< TuidingxinxiEntity> ew = new EntityWrapper< TuidingxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tuidingxinxi, "tuidingxinxi")); 
		TuidingxinxiView tuidingxinxiView =  tuidingxinxiService.selectView(ew);
		return R.ok("查询退订信息成功").put("data", tuidingxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TuidingxinxiEntity tuidingxinxi = tuidingxinxiService.selectById(id);
        return R.ok().put("data", tuidingxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TuidingxinxiEntity tuidingxinxi = tuidingxinxiService.selectById(id);
        return R.ok().put("data", tuidingxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TuidingxinxiEntity tuidingxinxi, HttpServletRequest request){
    	tuidingxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tuidingxinxi);

        tuidingxinxiService.insert(tuidingxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TuidingxinxiEntity tuidingxinxi, HttpServletRequest request){
    	tuidingxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tuidingxinxi);
    	tuidingxinxi.setUserid((Long)request.getSession().getAttribute("userId"));

        tuidingxinxiService.insert(tuidingxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TuidingxinxiEntity tuidingxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tuidingxinxi);
        tuidingxinxiService.updateById(tuidingxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tuidingxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<TuidingxinxiEntity> wrapper = new EntityWrapper<TuidingxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = tuidingxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
