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
public class WorkflowNode extends Model<WorkflowNode> {

    private static final long serialVersionUID = 1L;

    /**
     * wo
     */
    @TableId(value = "node_code", type = IdType.AUTO)
    private Integer nodeCode;

    private String workflowCode;

    /**
     * 节点名称
     */
    private String nodeName;

    /**
     * 节点级别
     */
    private String nodeLevel;

    /**
     * 流程路径
     */
    private String parentPath;

    /**
     * 描述
     */
    private String description;

    /**
     * 排序号
     */
    private Integer sort;

    /**
     * 审批方式 0 串行 1并行 2抢占 0 1所有人都要审批 2一人审批就行
     */
    private Integer approvalMethod;

    /**
     * 允许调整流程关联数据库表字段名，用英文逗号分隔
     */
    private String relatTable;

    /**
     * 操作用户ID
     */
    private Integer updateBy;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


    @Override
    protected Serializable pkVal() {
        return this.nodeCode;
    }

}
