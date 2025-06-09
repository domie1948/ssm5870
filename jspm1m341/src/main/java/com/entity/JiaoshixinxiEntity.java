package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 教师信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-12 15:54:05
 */
@TableName("jiaoshixinxi")
public class JiaoshixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaoshixinxiEntity() {
		
	}
	
	public JiaoshixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
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
