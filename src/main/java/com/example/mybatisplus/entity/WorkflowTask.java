package com.example.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class WorkflowTask extends Model<WorkflowTask> {

    private static final long serialVersionUID = 1L;

    /**
     * 任务编号
     */
    @TableId(value = "task_code", type = IdType.AUTO)
    private Integer taskCode;

    /**
     * 任务名称
     */
    private String taskName;

    /**
     * 任务信息描述
     */
    private String description;

    private String workflowCode;

    /**
     * 任务所属node
     */
    private String nodeCode;

    /**
     * 是否需要文件 0否 ，1是
     */
    private Integer needFiles;

    /**
     * 该节点是否有衍生流程
     */
    private Integer haveRamification;

    /**
     * 衍生流程号
     */
    private String ramificWorkflowId;

    /**
     * 1: 前期节点 2:工程节点
     */
    private Integer type;


    @Override
    protected Serializable pkVal() {
        return this.taskCode;
    }

}
