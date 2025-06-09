package com.entity.view;

import com.entity.DiscussyoueryuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 幼儿园信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 15:54:05
 */
@TableName("discussyoueryuanxinxi")
public class DiscussyoueryuanxinxiView  extends DiscussyoueryuanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussyoueryuanxinxiView(){
	}
 
 	public DiscussyoueryuanxinxiView(DiscussyoueryuanxinxiEntity discussyoueryuanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussyoueryuanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
