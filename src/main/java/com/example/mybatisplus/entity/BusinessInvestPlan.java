package com.example.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Solarie
 * @since 2020-08-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("business_invest_plan")
public class BusinessInvestPlan extends Model<BusinessInvestPlan> {

    private static final long serialVersionUID = 1L;

    /**
     * 项目工程编号
     */
    private String constructionCode;

    /**
     * 项目年份月份
     */
    private String ym;

    /**
     * 项目进度说明
     */
    private String content;

    /**
     * 金额 计划投资金额 单位元
     */
    private String sum;

    /**
     * 工作量 单位元
     */
    private String workload;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建人id
     */
    private String createBy;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 修改人id
     */
    private String updateBy;

    /**
     * 项目竣工时间
     */
    private LocalDateTime finishTime;

    /**
     * 类型 1：前期  2：工程 
     */
    private Integer type;

    /**
     * 描述
     */
    private String description;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
