package com.entity.vo;

import com.entity.JiaoshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 教师信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-12 15:54:05
 */
public class JiaoshixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 教学年龄
	 */
	
	private Integer jiaoxuenianling;
		
	/**
	 * 教学专业
	 */
	
	private String jiaoxuezhuanye;
		
	/**
	 * 获得荣誉
	 */
	
	private String huoderongyu;
		
	/**
	 * 相片
	 */
	
	private String xiangpian;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：教学年龄
	 */
	 
	public void setJiaoxuenianling(Integer jiaoxuenianling) {
		this.jiaoxuenianling = jiaoxuenianling;
	}
	
	/**
	 * 获取：教学年龄
	 */
	public Integer getJiaoxuenianling() {
		return jiaoxuenianling;
	}
				
	
	/**
	 * 设置：教学专业
	 */
	 
	public void setJiaoxuezhuanye(String jiaoxuezhuanye) {
		this.jiaoxuezhuanye = jiaoxuezhuanye;
	}
	
	/**
	 * 获取：教学专业
	 */
	public String getJiaoxuezhuanye() {
		return jiaoxuezhuanye;
	}
				
	
	/**
	 * 设置：获得荣誉
	 */
	 
	public void setHuoderongyu(String huoderongyu) {
		this.huoderongyu = huoderongyu;
	}
	
	/**
	 * 获取：获得荣誉
	 */
	public String getHuoderongyu() {
		return huoderongyu;
	}
				
	
	/**
	 * 设置：相片
	 */
	 
	public void setXiangpian(String xiangpian) {
		this.xiangpian = xiangpian;
	}
	
	/**
	 * 获取：相片
	 */
	public String getXiangpian() {
		return xiangpian;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
			
}
