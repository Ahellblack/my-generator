package com.example.mybatisplus.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
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
public class WorkflowLinkApprover extends Model<WorkflowLinkApprover> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 流程编号
     */
    private String workflowCode;

    /**
     * 流程节点编号
     */
    private String workflowNodeCode;

    /**
     * 流程线名称
     */
    private String workflowLinkName;

    /**
     * 上一个节点
     */
    private String workflowLinkPreNode;

    /**
     * 下一个节点
     */
    private String workflowLinkNextNode;

    /**
     * 审批人id 多个以‘，’间隔
     */
    private Integer userIds;

    /**
     * 角色id 多个以‘，’间隔
     */
    private Integer roleIds;

    /**
     * 部门id 多个以‘，’间隔
     */
    private String departIds;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
