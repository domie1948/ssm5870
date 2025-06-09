package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YoueryuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YoueryuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YoueryuanxinxiView;


/**
 * 幼儿园信息
 *
 * @author 
 * @email 
 * @date 2021-03-12 15:54:05
 */
public interface YoueryuanxinxiService extends IService<YoueryuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YoueryuanxinxiVO> selectListVO(Wrapper<YoueryuanxinxiEntity> wrapper);
   	
   	YoueryuanxinxiVO selectVO(@Param("ew") Wrapper<YoueryuanxinxiEntity> wrapper);
   	
   	List<YoueryuanxinxiView> selectListView(Wrapper<YoueryuanxinxiEntity> wrapper);
   	
   	YoueryuanxinxiView selectView(@Param("ew") Wrapper<YoueryuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YoueryuanxinxiEntity> wrapper);
   	
}

