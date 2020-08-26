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
public class JobEntity extends Model<JobEntity> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private String group;

    private String cron;

    private String parameter;

    private String description;

    /**
     * 类名
     */
    private String className;

    /**
     * 方法名称
     */
    private String methodName;

    /**
     * 传入的参数
     */
    private String params;

    /**
     * 启用状态（OPEN开启，CLOSE关闭）
     */
    private String status;

    /**
     * 工作状态（1生效中；0未生效）
     */
    private Boolean workStatus;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
