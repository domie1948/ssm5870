package com.entity.model;

import com.entity.JiucanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 就餐信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-12 15:54:05
 */
public class JiucanxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
