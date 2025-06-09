package com.entity.vo;

import com.entity.KaoqinshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 考勤申请
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-12 15:54:05
 */
public class KaoqinshenqingVO  implements Serializable {
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
