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
public class WorkflowRealTaskProgress extends Model<WorkflowRealTaskProgress> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 流程单号
     */
    private String sheetCode;

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
    private String description;

    /**
     * 创建时，初始时间


     */
    private LocalDateTime initialTime;

    /**
     * 创建时，截止时间
     */
    private LocalDateTime finalTime;

    /**
     * 任务实际完成时间
     */
    private LocalDateTime finishTime;

    /**
     * 任务实际进入时间
     */
    private LocalDateTime insideTime;

    /**
     * 操作人id
     */
    private Integer finishUserId;

    /**
     * 操作人员姓名
     */
    private String finishUserName;

    /**
     * 该节点是否有衍生流程
     */
    private Integer haveRamification;

    /**
     * 衍生流程单号
     */
    private String ramificSheetCode;

    /**
     * 衍生流程号
     */
    private String ramificWorkflowId;

    /**
     * 是否需要文件 0否 ，1是
     */
    private Integer needFiles;

    /**
     * 是否必须 0 否，1 是
     */
    private Integer isNecessary;

    /**
     * 任务：0 未完成 1 已完成
     */
    private Integer status;

    /**
     * 任务类型 1前期 2 工程
     */
    private Integer type;

    /**
     * 项目工程名称
     */
    private String constructionName;

    /**
     * 是否启用 2 否 1 是
     */
    private Integer onUsed;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
