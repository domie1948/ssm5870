package com.dao;

import com.entity.YoueryuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YoueryuanxinxiVO;
import com.entity.view.YoueryuanxinxiView;


/**
 * 幼儿园信息
 * 
 * @author 
 * @email 
 * @date 2021-03-12 15:54:05
 */
public interface YoueryuanxinxiDao extends BaseMapper<YoueryuanxinxiEntity> {
	
	List<YoueryuanxinxiVO> selectListVO(@Param("ew") Wrapper<YoueryuanxinxiEntity> wrapper);
	
	YoueryuanxinxiVO selectVO(@Param("ew") Wrapper<YoueryuanxinxiEntity> wrapper);
	
	List<YoueryuanxinxiView> selectListView(@Param("ew") Wrapper<YoueryuanxinxiEntity> wrapper);

	List<YoueryuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YoueryuanxinxiEntity> wrapper);
	
	YoueryuanxinxiView selectView(@Param("ew") Wrapper<YoueryuanxinxiEntity> wrapper);
	
}
