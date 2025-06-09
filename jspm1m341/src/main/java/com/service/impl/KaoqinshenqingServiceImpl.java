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


import com.dao.KaoqinshenqingDao;
import com.entity.KaoqinshenqingEntity;
import com.service.KaoqinshenqingService;
import com.entity.vo.KaoqinshenqingVO;
import com.entity.view.KaoqinshenqingView;

@Service("kaoqinshenqingService")
public class KaoqinshenqingServiceImpl extends ServiceImpl<KaoqinshenqingDao, KaoqinshenqingEntity> implements KaoqinshenqingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaoqinshenqingEntity> page = this.selectPage(
                new Query<KaoqinshenqingEntity>(params).getPage(),
                new EntityWrapper<KaoqinshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaoqinshenqingEntity> wrapper) {
		  Page<KaoqinshenqingView> page =new Query<KaoqinshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaoqinshenqingVO> selectListVO(Wrapper<KaoqinshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaoqinshenqingVO selectVO(Wrapper<KaoqinshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaoqinshenqingView> selectListView(Wrapper<KaoqinshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaoqinshenqingView selectView(Wrapper<KaoqinshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
