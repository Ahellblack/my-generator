package com.example.mybatisplus.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class QrtzSchedulerState extends Model<QrtzSchedulerState> {

    private static final long serialVersionUID = 1L;

    @TableId("SCHED_NAME")
    private String schedName;

    @TableField("INSTANCE_NAME")
    private String instanceName;

    @TableField("LAST_CHECKIN_TIME")
    private Long lastCheckinTime;

    @TableField("CHECKIN_INTERVAL")
    private Long checkinInterval;


    @Override
    protected Serializable pkVal() {
        return this.schedName;
    }

}
