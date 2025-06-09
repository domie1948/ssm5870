package com.dao;

import com.entity.JiucanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiucanxinxiVO;
import com.entity.view.JiucanxinxiView;


/**
 * 就餐信息
 * 
 * @author 
 * @email 
 * @date 2021-03-12 15:54:05
 */
public interface JiucanxinxiDao extends BaseMapper<JiucanxinxiEntity> {
	
	List<JiucanxinxiVO> selectListVO(@Param("ew") Wrapper<JiucanxinxiEntity> wrapper);
	
	JiucanxinxiVO selectVO(@Param("ew") Wrapper<JiucanxinxiEntity> wrapper);
	
	List<JiucanxinxiView> selectListView(@Param("ew") Wrapper<JiucanxinxiEntity> wrapper);

	List<JiucanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiucanxinxiEntity> wrapper);
	
	JiucanxinxiView selectView(@Param("ew") Wrapper<JiucanxinxiEntity> wrapper);
	
}
