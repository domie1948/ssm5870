package com.entity.vo;

import com.entity.KaoqinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 考勤信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-12 15:54:05
 */
public class KaoqinxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 考勤项目
	 */
	
	private String kaoqinxiangmu;
		
	/**
	 * 考勤内容
	 */
	
	private String kaoqinneirong;
		
	/**
	 * 考勤日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaoqinriqi;
				
	
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
	 * 设置：考勤日期
	 */
	 
	public void setKaoqinriqi(Date kaoqinriqi) {
		this.kaoqinriqi = kaoqinriqi;
	}
	
	/**
	 * 获取：考勤日期
	 */
	public Date getKaoqinriqi() {
		return kaoqinriqi;
	}
			
}
