package com.example.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class WorkflowRealInfo extends Model<WorkflowRealInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 流程单号
     */
    private String sheetCode;

    /**
     * 流程编号
     */
    private String workflowCode;

    /**
     * 节点编号
     */
    private String nodeCode;

    /**
     * 项目工程编号
     */
    private String constructionCode;

    /**
     * 流程状态
     */
    private String workflowStatus;

    /**
     * 节点描述
     */
    private String description;

    /**
     * 节点名称
     */
    private String nodeName;

    /**
     * 进入节点时间
     */
    private LocalDateTime insideTime;

    /**
     * 创建时，初始时间
     */
    private LocalDateTime initialTime;

    /**
     * 创建时，截止时间
     */
    private LocalDateTime finalTime;

    /**
     * 实际完成时间
     */
    private LocalDateTime finishTime;

    /**
     * 审批人id
     */
    private Integer approvalUserId;

    /**
     * 审批人姓名
     */
    private String approvalUserName;

    /**
     * 是否已完成 0 未完成  1已完成  2进行中 3逾期
     */
    private Integer status;

    /**
     * 项目工程名称
     */
    private String constructionName;

    /**
     * 是否启用 0 否 1 是
     */
    private Integer onUsed;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
