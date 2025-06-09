package com.dao;

import com.entity.DiscussyoueryuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyoueryuanxinxiVO;
import com.entity.view.DiscussyoueryuanxinxiView;


/**
 * 幼儿园信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-12 15:54:05
 */
public interface DiscussyoueryuanxinxiDao extends BaseMapper<DiscussyoueryuanxinxiEntity> {
	
	List<DiscussyoueryuanxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussyoueryuanxinxiEntity> wrapper);
	
	DiscussyoueryuanxinxiVO selectVO(@Param("ew") Wrapper<DiscussyoueryuanxinxiEntity> wrapper);
	
	List<DiscussyoueryuanxinxiView> selectListView(@Param("ew") Wrapper<DiscussyoueryuanxinxiEntity> wrapper);

	List<DiscussyoueryuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyoueryuanxinxiEntity> wrapper);
	
	DiscussyoueryuanxinxiView selectView(@Param("ew") Wrapper<DiscussyoueryuanxinxiEntity> wrapper);
	
}
