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
 * 考勤申请
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-12 15:54:05
 */
@TableName("kaoqinshenqing")
public class KaoqinshenqingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KaoqinshenqingEntity() {
		
	}
	
	public KaoqinshenqingEntity(T t) {
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
	 * 考勤编号
	 */
					
	private String kaoqinbianhao;
	
	/**
	 * 考勤项目
	 */
					
	private String kaoqinxiangmu;
	
	/**
	 * 考勤内容
	 */
					
	private String kaoqinneirong;
	
	/**
	 * 手机账号
	 */
					
	private String shoujizhanghao;
	
	/**
	 * 家长姓名
	 */
					
	private String jiazhangxingming;
	
	/**
	 * 考勤状态
	 */
					
	private String kaoqinzhuangtai;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：考勤编号
	 */
	public void setKaoqinbianhao(String kaoqinbianhao) {
		this.kaoqinbianhao = kaoqinbianhao;
	}
	/**
	 * 获取：考勤编号
	 */
	public String getKaoqinbianhao() {
		return kaoqinbianhao;
	}
	/**
	 * 设置：考勤项目
	 */
	public void setKaoqinxiangmu(String kaoqinxiangmu) {
		this.kaoqinxiangmu = kaoqinxiangmu;
	}
	/**
	 * 获取：考勤项目
	 */
	public String getKaoqinxiangmu() {
		return kaoqinxiangmu;
	}
	/**
	 * 设置：考勤内容
	 */
	public void setKaoqinneirong(String kaoqinneirong) {
		this.kaoqinneirong = kaoqinneirong;
	}
	/**
	 * 获取：考勤内容
	 */
	public String getKaoqinneirong() {
		return kaoqinneirong;
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
	 * 设置：考勤状态
	 */
	public void setKaoqinzhuangtai(String kaoqinzhuangtai) {
		this.kaoqinzhuangtai = kaoqinzhuangtai;
	}
	/**
	 * 获取：考勤状态
	 */
	public String getKaoqinzhuangtai() {
		return kaoqinzhuangtai;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
