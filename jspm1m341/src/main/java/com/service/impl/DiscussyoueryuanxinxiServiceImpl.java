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


import com.dao.DiscussyoueryuanxinxiDao;
import com.entity.DiscussyoueryuanxinxiEntity;
import com.service.DiscussyoueryuanxinxiService;
import com.entity.vo.DiscussyoueryuanxinxiVO;
import com.entity.view.DiscussyoueryuanxinxiView;

@Service("discussyoueryuanxinxiService")
public class DiscussyoueryuanxinxiServiceImpl extends ServiceImpl<DiscussyoueryuanxinxiDao, DiscussyoueryuanxinxiEntity> implements DiscussyoueryuanxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyoueryuanxinxiEntity> page = this.selectPage(
                new Query<DiscussyoueryuanxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussyoueryuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyoueryuanxinxiEntity> wrapper) {
		  Page<DiscussyoueryuanxinxiView> page =new Query<DiscussyoueryuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyoueryuanxinxiVO> selectListVO(Wrapper<DiscussyoueryuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyoueryuanxinxiVO selectVO(Wrapper<DiscussyoueryuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyoueryuanxinxiView> selectListView(Wrapper<DiscussyoueryuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyoueryuanxinxiView selectView(Wrapper<DiscussyoueryuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
