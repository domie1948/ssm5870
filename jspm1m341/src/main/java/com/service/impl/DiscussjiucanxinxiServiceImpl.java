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


import com.dao.DiscussjiucanxinxiDao;
import com.entity.DiscussjiucanxinxiEntity;
import com.service.DiscussjiucanxinxiService;
import com.entity.vo.DiscussjiucanxinxiVO;
import com.entity.view.DiscussjiucanxinxiView;

@Service("discussjiucanxinxiService")
public class DiscussjiucanxinxiServiceImpl extends ServiceImpl<DiscussjiucanxinxiDao, DiscussjiucanxinxiEntity> implements DiscussjiucanxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiucanxinxiEntity> page = this.selectPage(
                new Query<DiscussjiucanxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussjiucanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiucanxinxiEntity> wrapper) {
		  Page<DiscussjiucanxinxiView> page =new Query<DiscussjiucanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiucanxinxiVO> selectListVO(Wrapper<DiscussjiucanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiucanxinxiVO selectVO(Wrapper<DiscussjiucanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiucanxinxiView> selectListView(Wrapper<DiscussjiucanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiucanxinxiView selectView(Wrapper<DiscussjiucanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
