package com.entity.model;

import com.entity.XueshengfanxiaoshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 学生返校申请
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-15 11:56:39
 */
public class XueshengfanxiaoshenqingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 手机号码
	 */
	
	private String shoujihaoma;
		
	/**
	 * 身份证号
	 */
	
	private String shenfenzhenghao;
		
	/**
	 * 家庭住址
	 */
	
	private String jiatingzhuzhi;
		
	/**
	 * 返校日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fanxiaoriqi;
		
	/**
	 * 返校方式
	 */
	
	private String fanxiaofangshi;
		
	/**
	 * 返校车次
	 */
	
	private String fanxiaocheci;
		
	/**
	 * 所在地风险等级
	 */
	
	private String suozaidifengxiandengji;
		
	/**
	 * 核酸检测报告
	 */
	
	private String hesuanjiancebaogao;
		
	/**
	 * 返校后是否进行隔离
	 */
	
	private String fanxiaohoushifoujinxinggeli;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：手机号码
	 */
	 
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
				
	
	/**
	 * 设置：身份证号
	 */
	 
	public void setShenfenzhenghao(String shenfenzhenghao) {
		this.shenfenzhenghao = shenfenzhenghao;
	}
	
	/**
	 * 获取：身份证号
	 */
	public String getShenfenzhenghao() {
		return shenfenzhenghao;
	}
				
	
	/**
	 * 设置：家庭住址
	 */
	 
	public void setJiatingzhuzhi(String jiatingzhuzhi) {
		this.jiatingzhuzhi = jiatingzhuzhi;
	}
	
	/**
	 * 获取：家庭住址
	 */
	public String getJiatingzhuzhi() {
		return jiatingzhuzhi;
	}
				
	
	/**
	 * 设置：返校日期
	 */
	 
	public void setFanxiaoriqi(Date fanxiaoriqi) {
		this.fanxiaoriqi = fanxiaoriqi;
	}
	
	/**
	 * 获取：返校日期
	 */
	public Date getFanxiaoriqi() {
		return fanxiaoriqi;
	}
				
	
	/**
	 * 设置：返校方式
	 */
	 
	public void setFanxiaofangshi(String fanxiaofangshi) {
		this.fanxiaofangshi = fanxiaofangshi;
	}
	
	/**
	 * 获取：返校方式
	 */
	public String getFanxiaofangshi() {
		return fanxiaofangshi;
	}
				
	
	/**
	 * 设置：返校车次
	 */
	 
	public void setFanxiaocheci(String fanxiaocheci) {
		this.fanxiaocheci = fanxiaocheci;
	}
	
	/**
	 * 获取：返校车次
	 */
	public String getFanxiaocheci() {
		return fanxiaocheci;
	}
				
	
	/**
	 * 设置：所在地风险等级
	 */
	 
	public void setSuozaidifengxiandengji(String suozaidifengxiandengji) {
		this.suozaidifengxiandengji = suozaidifengxiandengji;
	}
	
	/**
	 * 获取：所在地风险等级
	 */
	public String getSuozaidifengxiandengji() {
		return suozaidifengxiandengji;
	}
				
	
	/**
	 * 设置：核酸检测报告
	 */
	 
	public void setHesuanjiancebaogao(String hesuanjiancebaogao) {
		this.hesuanjiancebaogao = hesuanjiancebaogao;
	}
	
	/**
	 * 获取：核酸检测报告
	 */
	public String getHesuanjiancebaogao() {
		return hesuanjiancebaogao;
	}
				
	
	/**
	 * 设置：返校后是否进行隔离
	 */
	 
	public void setFanxiaohoushifoujinxinggeli(String fanxiaohoushifoujinxinggeli) {
		this.fanxiaohoushifoujinxinggeli = fanxiaohoushifoujinxinggeli;
	}
	
	/**
	 * 获取：返校后是否进行隔离
	 */
	public String getFanxiaohoushifoujinxinggeli() {
		return fanxiaohoushifoujinxinggeli;
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
