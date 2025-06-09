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
 * 幼儿园信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-12 15:54:05
 */
@TableName("youeryuanxinxi")
public class YoueryuanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YoueryuanxinxiEntity() {
		
	}
	
	public YoueryuanxinxiEntity(T t) {
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
	 * 信息编号
	 */
					
	private String xinxibianhao;
	
	/**
	 * 名称
	 */
					
	private String mingcheng;
	
	/**
	 * 简介
	 */
					
	private String jianjie;
	
	/**
	 * 类型
	 */
					
	private String leixing;
	
	/**
	 * 招生人数
	 */
					
	private Integer zhaoshengrenshu;
	
	/**
	 * 创办人
	 */
					
	private String chuangbanren;
	
	/**
	 * 相关图片
	 */
					
	private String xiangguantupian;
	
	/**
	 * 创建日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date chuangjianriqi;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	
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
	 * 设置：信息编号
	 */
	public void setXinxibianhao(String xinxibianhao) {
		this.xinxibianhao = xinxibianhao;
	}
	/**
	 * 获取：信息编号
	 */
	public String getXinxibianhao() {
		return xinxibianhao;
	}
	/**
	 * 设置：名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
	/**
	 * 设置：简介
	 */
	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}
	/**
	 * 获取：简介
	 */
	public String getJianjie() {
		return jianjie;
	}
	/**
	 * 设置：类型
	 */
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
	/**
	 * 设置：招生人数
	 */
	public void setZhaoshengrenshu(Integer zhaoshengrenshu) {
		this.zhaoshengrenshu = zhaoshengrenshu;
	}
	/**
	 * 获取：招生人数
	 */
	public Integer getZhaoshengrenshu() {
		return zhaoshengrenshu;
	}
	/**
	 * 设置：创办人
	 */
	public void setChuangbanren(String chuangbanren) {
		this.chuangbanren = chuangbanren;
	}
	/**
	 * 获取：创办人
	 */
	public String getChuangbanren() {
		return chuangbanren;
	}
	/**
	 * 设置：相关图片
	 */
	public void setXiangguantupian(String xiangguantupian) {
		this.xiangguantupian = xiangguantupian;
	}
	/**
	 * 获取：相关图片
	 */
	public String getXiangguantupian() {
		return xiangguantupian;
	}
	/**
	 * 设置：创建日期
	 */
	public void setChuangjianriqi(Date chuangjianriqi) {
		this.chuangjianriqi = chuangjianriqi;
	}
	/**
	 * 获取：创建日期
	 */
	public Date getChuangjianriqi() {
		return chuangjianriqi;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}

}
