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
 * 缴费
 *
 * @author 
 * @email
 */
@TableName("jiaofei")
public class JiaofeiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiaofeiEntity() {

	}

	public JiaofeiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 学生
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 缴费名目
     */
    @TableField(value = "jiaofei_name")

    private String jiaofeiName;


    /**
     * 缴费类型
     */
    @TableField(value = "jiaofei_types")

    private Integer jiaofeiTypes;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 应缴金额
     */
    @TableField(value = "jiaofei_yingjiao_money")

    private Double jiaofeiYingjiaoMoney;


    /**
     * 实收金额
     */
    @TableField(value = "jiaofei_shishou_money")

    private Double jiaofeiShishouMoney;


    /**
     * 备注
     */
    @TableField(value = "jiaofei_content")

    private String jiaofeiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：缴费名目
	 */
    public String getJiaofeiName() {
        return jiaofeiName;
    }


    /**
	 * 获取：缴费名目
	 */

    public void setJiaofeiName(String jiaofeiName) {
        this.jiaofeiName = jiaofeiName;
    }
    /**
	 * 设置：缴费类型
	 */
    public Integer getJiaofeiTypes() {
        return jiaofeiTypes;
    }


    /**
	 * 获取：缴费类型
	 */

    public void setJiaofeiTypes(Integer jiaofeiTypes) {
        this.jiaofeiTypes = jiaofeiTypes;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：应缴金额
	 */
    public Double getJiaofeiYingjiaoMoney() {
        return jiaofeiYingjiaoMoney;
    }


    /**
	 * 获取：应缴金额
	 */

    public void setJiaofeiYingjiaoMoney(Double jiaofeiYingjiaoMoney) {
        this.jiaofeiYingjiaoMoney = jiaofeiYingjiaoMoney;
    }
    /**
	 * 设置：实收金额
	 */
    public Double getJiaofeiShishouMoney() {
        return jiaofeiShishouMoney;
    }


    /**
	 * 获取：实收金额
	 */

    public void setJiaofeiShishouMoney(Double jiaofeiShishouMoney) {
        this.jiaofeiShishouMoney = jiaofeiShishouMoney;
    }
    /**
	 * 设置：备注
	 */
    public String getJiaofeiContent() {
        return jiaofeiContent;
    }


    /**
	 * 获取：备注
	 */

    public void setJiaofeiContent(String jiaofeiContent) {
        this.jiaofeiContent = jiaofeiContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Jiaofei{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", jiaofeiName=" + jiaofeiName +
            ", jiaofeiTypes=" + jiaofeiTypes +
            ", insertTime=" + insertTime +
            ", jiaofeiYingjiaoMoney=" + jiaofeiYingjiaoMoney +
            ", jiaofeiShishouMoney=" + jiaofeiShishouMoney +
            ", jiaofeiContent=" + jiaofeiContent +
            ", createTime=" + createTime +
        "}";
    }
}
