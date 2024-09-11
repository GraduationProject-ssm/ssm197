package com.entity.model;

import com.entity.JiaoshifanxiaoshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 教师返校申请
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-15 11:56:39
 */
public class JiaoshifanxiaoshenqingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
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
	 * 做在地风险等级
	 */
	
	private String zuozaidifengxiandengji;
		
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
	 * 设置：做在地风险等级
	 */
	 
	public void setZuozaidifengxiandengji(String zuozaidifengxiandengji) {
		this.zuozaidifengxiandengji = zuozaidifengxiandengji;
	}
	
	/**
	 * 获取：做在地风险等级
	 */
	public String getZuozaidifengxiandengji() {
		return zuozaidifengxiandengji;
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
