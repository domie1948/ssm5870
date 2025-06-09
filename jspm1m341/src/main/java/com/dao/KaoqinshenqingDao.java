package com.dao;

import com.entity.KaoqinshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaoqinshenqingVO;
import com.entity.view.KaoqinshenqingView;


/**
 * 考勤申请
 * 
 * @author 
 * @email 
 * @date 2021-03-12 15:54:05
 */
public interface KaoqinshenqingDao extends BaseMapper<KaoqinshenqingEntity> {
	
	List<KaoqinshenqingVO> selectListVO(@Param("ew") Wrapper<KaoqinshenqingEntity> wrapper);
	
	KaoqinshenqingVO selectVO(@Param("ew") Wrapper<KaoqinshenqingEntity> wrapper);
	
	List<KaoqinshenqingView> selectListView(@Param("ew") Wrapper<KaoqinshenqingEntity> wrapper);

	List<KaoqinshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<KaoqinshenqingEntity> wrapper);
	
	KaoqinshenqingView selectView(@Param("ew") Wrapper<KaoqinshenqingEntity> wrapper);
	
}
