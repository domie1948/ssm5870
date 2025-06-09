package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiucanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiucanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiucanxinxiView;


/**
 * 就餐信息
 *
 * @author 
 * @email 
 * @date 2021-03-12 15:54:05
 */
public interface JiucanxinxiService extends IService<JiucanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiucanxinxiVO> selectListVO(Wrapper<JiucanxinxiEntity> wrapper);
   	
   	JiucanxinxiVO selectVO(@Param("ew") Wrapper<JiucanxinxiEntity> wrapper);
   	
   	List<JiucanxinxiView> selectListView(Wrapper<JiucanxinxiEntity> wrapper);
   	
   	JiucanxinxiView selectView(@Param("ew") Wrapper<JiucanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiucanxinxiEntity> wrapper);
   	
}

