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

import com.entity.KaoqinshenqingEntity;
import com.entity.view.KaoqinshenqingView;

import com.service.KaoqinshenqingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 考勤申请
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-12 15:54:05
 */
@RestController
@RequestMapping("/kaoqinshenqing")
public class KaoqinshenqingController {
    @Autowired
    private KaoqinshenqingService kaoqinshenqingService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KaoqinshenqingEntity kaoqinshenqing, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			kaoqinshenqing.setShoujizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<KaoqinshenqingEntity> ew = new EntityWrapper<KaoqinshenqingEntity>();
    	PageUtils page = kaoqinshenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaoqinshenqing), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KaoqinshenqingEntity kaoqinshenqing, HttpServletRequest request){
        EntityWrapper<KaoqinshenqingEntity> ew = new EntityWrapper<KaoqinshenqingEntity>();
    	PageUtils page = kaoqinshenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kaoqinshenqing), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KaoqinshenqingEntity kaoqinshenqing){
       	EntityWrapper<KaoqinshenqingEntity> ew = new EntityWrapper<KaoqinshenqingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kaoqinshenqing, "kaoqinshenqing")); 
        return R.ok().put("data", kaoqinshenqingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KaoqinshenqingEntity kaoqinshenqing){
        EntityWrapper< KaoqinshenqingEntity> ew = new EntityWrapper< KaoqinshenqingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kaoqinshenqing, "kaoqinshenqing")); 
		KaoqinshenqingView kaoqinshenqingView =  kaoqinshenqingService.selectView(ew);
		return R.ok("查询考勤申请成功").put("data", kaoqinshenqingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KaoqinshenqingEntity kaoqinshenqing = kaoqinshenqingService.selectById(id);
        return R.ok().put("data", kaoqinshenqing);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KaoqinshenqingEntity kaoqinshenqing = kaoqinshenqingService.selectById(id);
        return R.ok().put("data", kaoqinshenqing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KaoqinshenqingEntity kaoqinshenqing, HttpServletRequest request){
    	kaoqinshenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kaoqinshenqing);

        kaoqinshenqingService.insert(kaoqinshenqing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KaoqinshenqingEntity kaoqinshenqing, HttpServletRequest request){
    	kaoqinshenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kaoqinshenqing);

        kaoqinshenqingService.insert(kaoqinshenqing);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody KaoqinshenqingEntity kaoqinshenqing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kaoqinshenqing);
        kaoqinshenqingService.updateById(kaoqinshenqing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kaoqinshenqingService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<KaoqinshenqingEntity> wrapper = new EntityWrapper<KaoqinshenqingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("shoujizhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = kaoqinshenqingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
