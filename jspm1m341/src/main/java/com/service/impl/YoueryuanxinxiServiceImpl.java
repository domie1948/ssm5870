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


import com.dao.YoueryuanxinxiDao;
import com.entity.YoueryuanxinxiEntity;
import com.service.YoueryuanxinxiService;
import com.entity.vo.YoueryuanxinxiVO;
import com.entity.view.YoueryuanxinxiView;

@Service("youeryuanxinxiService")
public class YoueryuanxinxiServiceImpl extends ServiceImpl<YoueryuanxinxiDao, YoueryuanxinxiEntity> implements YoueryuanxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YoueryuanxinxiEntity> page = this.selectPage(
                new Query<YoueryuanxinxiEntity>(params).getPage(),
                new EntityWrapper<YoueryuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YoueryuanxinxiEntity> wrapper) {
		  Page<YoueryuanxinxiView> page =new Query<YoueryuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YoueryuanxinxiVO> selectListVO(Wrapper<YoueryuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YoueryuanxinxiVO selectVO(Wrapper<YoueryuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YoueryuanxinxiView> selectListView(Wrapper<YoueryuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YoueryuanxinxiView selectView(Wrapper<YoueryuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
