package com.example.mybatisplus.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 流程主体
 * </p>
 *
 * @author Solarie
 * @since 2020-08-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WorkflowReal extends Model<WorkflowReal> {

    private static final long serialVersionUID = 1L;

    /**
     * 流程单号
     */
    private String sheetCode;

    /**
     * 流程号以流程创建日期+流程简称+6位随机数
     */
    private String workflowCode;

    /**
     * 流程名称
     */
    private String workflowName;

    /**
     * 描述
     */
    private String workflowDesc;

    /**
     * 流程版本
     */
    private String version;

    /**
     * 创建流程时间
     */
    private LocalDateTime createTime;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 当前流程版本更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 项目工程编号
     */
    private String constructionCode;

    /**
     * 项目工程名称
     */
    private String constructionName;

    /**
     * 流程类型 1.工程流程 2. 业务流程
     */
    private Integer type;

    /**
     * 关联业务表名称
     */
    private String businessTableName;

    /**
     * 业务表id
     */
    private Integer relevanceId;

    /**
     * 当前流程状态， 0.未开始 ，1. 已开始， 2.已竣工
     */
    private Integer status;


    @Override
    protected Serializable pkVal() {
        return this.sheetCode;
    }

}
