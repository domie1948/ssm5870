package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiucanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiucanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiucanxinxiView;


/**
 * 就餐信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-12 15:54:05
 */
public interface DiscussjiucanxinxiService extends IService<DiscussjiucanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiucanxinxiVO> selectListVO(Wrapper<DiscussjiucanxinxiEntity> wrapper);
   	
   	DiscussjiucanxinxiVO selectVO(@Param("ew") Wrapper<DiscussjiucanxinxiEntity> wrapper);
   	
   	List<DiscussjiucanxinxiView> selectListView(Wrapper<DiscussjiucanxinxiEntity> wrapper);
   	
   	DiscussjiucanxinxiView selectView(@Param("ew") Wrapper<DiscussjiucanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiucanxinxiEntity> wrapper);
   	
}

