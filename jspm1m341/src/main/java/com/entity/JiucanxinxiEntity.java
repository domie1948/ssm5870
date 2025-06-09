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
 * 就餐信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-12 15:54:05
 */
@TableName("jiucanxinxi")
public class JiucanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiucanxinxiEntity() {
		
	}
	
	public JiucanxinxiEntity(T t) {
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
	 * 早餐菜式
	 */
					
	private String zaocancaishi;
	
	/**
	 * 早餐原材料
	 */
					
	private String zaocanyuancailiao;
	
	/**
	 * 午餐菜式
	 */
					
	private String wucancaishi;
	
	/**
	 * 午餐原材料
	 */
					
	private String wucanyuancailiao;
	
	/**
	 * 晚餐菜式
	 */
					
	private String wancancaishi;
	
	/**
	 * 晚餐原材料
	 */
					
	private String wancanyuancailiao;
	
	/**
	 * 相关图片
	 */
					
	private String xiangguantupian;
	
	/**
	 * 发布日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
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
	 * 设置：早餐菜式
	 */
	public void setZaocancaishi(String zaocancaishi) {
		this.zaocancaishi = zaocancaishi;
	}
	/**
	 * 获取：早餐菜式
	 */
	public String getZaocancaishi() {
		return zaocancaishi;
	}
	/**
	 * 设置：早餐原材料
	 */
	public void setZaocanyuancailiao(String zaocanyuancailiao) {
		this.zaocanyuancailiao = zaocanyuancailiao;
	}
	/**
	 * 获取：早餐原材料
	 */
	public String getZaocanyuancailiao() {
		return zaocanyuancailiao;
	}
	/**
	 * 设置：午餐菜式
	 */
	public void setWucancaishi(String wucancaishi) {
		this.wucancaishi = wucancaishi;
	}
	/**
	 * 获取：午餐菜式
	 */
	public String getWucancaishi() {
		return wucancaishi;
	}
	/**
	 * 设置：午餐原材料
	 */
	public void setWucanyuancailiao(String wucanyuancailiao) {
		this.wucanyuancailiao = wucanyuancailiao;
	}
	/**
	 * 获取：午餐原材料
	 */
	public String getWucanyuancailiao() {
		return wucanyuancailiao;
	}
	/**
	 * 设置：晚餐菜式
	 */
	public void setWancancaishi(String wancancaishi) {
		this.wancancaishi = wancancaishi;
	}
	/**
	 * 获取：晚餐菜式
	 */
	public String getWancancaishi() {
		return wancancaishi;
	}
	/**
	 * 设置：晚餐原材料
	 */
	public void setWancanyuancailiao(String wancanyuancailiao) {
		this.wancanyuancailiao = wancanyuancailiao;
	}
	/**
	 * 获取：晚餐原材料
	 */
	public String getWancanyuancailiao() {
		return wancanyuancailiao;
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
