package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyoueryuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyoueryuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyoueryuanxinxiView;


/**
 * 幼儿园信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-12 15:54:05
 */
public interface DiscussyoueryuanxinxiService extends IService<DiscussyoueryuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyoueryuanxinxiVO> selectListVO(Wrapper<DiscussyoueryuanxinxiEntity> wrapper);
   	
   	DiscussyoueryuanxinxiVO selectVO(@Param("ew") Wrapper<DiscussyoueryuanxinxiEntity> wrapper);
   	
   	List<DiscussyoueryuanxinxiView> selectListView(Wrapper<DiscussyoueryuanxinxiEntity> wrapper);
   	
   	DiscussyoueryuanxinxiView selectView(@Param("ew") Wrapper<DiscussyoueryuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyoueryuanxinxiEntity> wrapper);
   	
}

