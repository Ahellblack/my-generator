package com.example.mybatisplus.entity;

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
public class WorkflowHistoryInfo extends Model<WorkflowHistoryInfo> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 项目工程编号
     */
    private String constructionCode;

    /**
     * 项目工程名称
     */
    private String constructionName;

    /**
     * 流程编号
     */
    private String workflowCode;

    /**
     * 节点编号
     */
    private String workflowNodeCode;

    /**
     * 流程状态
     */
    private String workflowStatus;

    /**
     * 节点描述
     */
    private String nodeDesc;

    /**
     * 节点名称
     */
    private String nodeName;

    /**
     * 进入节点时间
     */
    private LocalDateTime insideTime;

    /**
     * 截止时间
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


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
