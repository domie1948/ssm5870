package com.dao;

import com.entity.DiscussjiucanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiucanxinxiVO;
import com.entity.view.DiscussjiucanxinxiView;


/**
 * 就餐信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-12 15:54:05
 */
public interface DiscussjiucanxinxiDao extends BaseMapper<DiscussjiucanxinxiEntity> {
	
	List<DiscussjiucanxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussjiucanxinxiEntity> wrapper);
	
	DiscussjiucanxinxiVO selectVO(@Param("ew") Wrapper<DiscussjiucanxinxiEntity> wrapper);
	
	List<DiscussjiucanxinxiView> selectListView(@Param("ew") Wrapper<DiscussjiucanxinxiEntity> wrapper);

	List<DiscussjiucanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiucanxinxiEntity> wrapper);
	
	DiscussjiucanxinxiView selectView(@Param("ew") Wrapper<DiscussjiucanxinxiEntity> wrapper);
	
}
