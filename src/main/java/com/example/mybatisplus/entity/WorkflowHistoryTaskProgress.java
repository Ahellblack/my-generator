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
public class WorkflowHistoryTaskProgress extends Model<WorkflowHistoryTaskProgress> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 项目工程编号
     */
    private String constructionCode;

    /**
     * 流程编号
     */
    private String workflowCode;

    /**
     * 节点编号
     */
    private String nodeCode;

    /**
     * 任务编号
     */
    private String taskCode;

    /**
     * 任务名
     */
    private String taskName;

    /**
     * 任务描述
     */
    private String taskDesc;

    /**
     * 任务起始时间
     */
    private LocalDateTime initialTime;

    /**
     * 任务应完成时间
     */
    private LocalDateTime finalTime;

    /**
     * 任务实际完成时间
     */
    private LocalDateTime finishTime;

    /**
     * 操作人id
     */
    private Integer finishUserId;

    /**
     * 操作人员姓名
     */
    private String finishUserName;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
