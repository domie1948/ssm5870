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


import com.dao.JiucanxinxiDao;
import com.entity.JiucanxinxiEntity;
import com.service.JiucanxinxiService;
import com.entity.vo.JiucanxinxiVO;
import com.entity.view.JiucanxinxiView;

@Service("jiucanxinxiService")
public class JiucanxinxiServiceImpl extends ServiceImpl<JiucanxinxiDao, JiucanxinxiEntity> implements JiucanxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiucanxinxiEntity> page = this.selectPage(
                new Query<JiucanxinxiEntity>(params).getPage(),
                new EntityWrapper<JiucanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiucanxinxiEntity> wrapper) {
		  Page<JiucanxinxiView> page =new Query<JiucanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiucanxinxiVO> selectListVO(Wrapper<JiucanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiucanxinxiVO selectVO(Wrapper<JiucanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiucanxinxiView> selectListView(Wrapper<JiucanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiucanxinxiView selectView(Wrapper<JiucanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
