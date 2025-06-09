package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaoqinshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaoqinshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoqinshenqingView;


/**
 * 考勤申请
 *
 * @author 
 * @email 
 * @date 2021-03-12 15:54:05
 */
public interface KaoqinshenqingService extends IService<KaoqinshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoqinshenqingVO> selectListVO(Wrapper<KaoqinshenqingEntity> wrapper);
   	
   	KaoqinshenqingVO selectVO(@Param("ew") Wrapper<KaoqinshenqingEntity> wrapper);
   	
   	List<KaoqinshenqingView> selectListView(Wrapper<KaoqinshenqingEntity> wrapper);
   	
   	KaoqinshenqingView selectView(@Param("ew") Wrapper<KaoqinshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoqinshenqingEntity> wrapper);
   	
}

