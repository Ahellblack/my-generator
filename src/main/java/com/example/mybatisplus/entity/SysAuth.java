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
 * 系统权限
 * </p>
 *
 * @author Solarie
 * @since 2020-08-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysAuth extends Model<SysAuth> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 资源名称
     */
    private String name;

    /**
     * 父ID
     */
    private Integer pid;

    /**
     * 资源类型：1:menu 2:控制器 3:方法
     */
    private Integer type;

    /**
     * 访问url地址
     */
    private String url;

    /**
     * 权限编码
     */
    private String code;

    /**
     * 不同资源类型的属性信息，使用json存储
     */
    private String props;

    /**
     * 排序号
     */
    private Integer sort;

    /**
     * 父id列表串
     */
    private String pids;

    /**
     * 描述
     */
    private String descr;

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
        return this.id;
    }

}
