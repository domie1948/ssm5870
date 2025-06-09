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
 * 缴费信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-12 15:54:05
 */
@TableName("jiaofeixinxi")
public class JiaofeixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaofeixinxiEntity() {
		
	}
	
	public JiaofeixinxiEntity(T t) {
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
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 班级
	 */
					
	private String banji;
	
	/**
	 * 手机账号
	 */
					
	private String shoujizhanghao;
	
	/**
	 * 家长姓名
	 */
					
	private String jiazhangxingming;
	
	/**
	 * 缴费项目
	 */
					
	private String jiaofeixiangmu;
	
	/**
	 * 缴费金额
	 */
					
	private Integer jiaofeijine;
	
	/**
	 * 发布日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
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
	 * 设置：班级
	 */
	public void setBanji(String banji) {
		this.banji = banji;
	}
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
	/**
	 * 设置：手机账号
	 */
	public void setShoujizhanghao(String shoujizhanghao) {
		this.shoujizhanghao = shoujizhanghao;
	}
	/**
	 * 获取：手机账号
	 */
	public String getShoujizhanghao() {
		return shoujizhanghao;
	}
	/**
	 * 设置：家长姓名
	 */
	public void setJiazhangxingming(String jiazhangxingming) {
		this.jiazhangxingming = jiazhangxingming;
	}
	/**
	 * 获取：家长姓名
	 */
	public String getJiazhangxingming() {
		return jiazhangxingming;
	}
	/**
	 * 设置：缴费项目
	 */
	public void setJiaofeixiangmu(String jiaofeixiangmu) {
		this.jiaofeixiangmu = jiaofeixiangmu;
	}
	/**
	 * 获取：缴费项目
	 */
	public String getJiaofeixiangmu() {
		return jiaofeixiangmu;
	}
	/**
	 * 设置：缴费金额
	 */
	public void setJiaofeijine(Integer jiaofeijine) {
		this.jiaofeijine = jiaofeijine;
	}
	/**
	 * 获取：缴费金额
	 */
	public Integer getJiaofeijine() {
		return jiaofeijine;
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
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
