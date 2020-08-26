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
 * 信息单基本信息表
 * </p>
 *
 * @author Solarie
 * @since 2020-08-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class InfBase extends Model<InfBase> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 反应线路
     */
    private String fyxl;

    /**
     * 开往方向
     */
    private String kwfx;

    /**
     * 转发单位
     */
    private String zfdw;

    /**
     * 车牌号
     */
    private String cph;

    /**
     * 上车站点
     */
    private String sczd;

    /**
     * 下车站点
     */
    private String xczd;

    /**
     * 反应类型
     */
    private String fylx;

    /**
     * 反映人
     */
    private String fyr;

    /**
     * 发生日期
     */
    private String fsrq;

    /**
     * 反应人电话
     */
    private String fyrdh;

    /**
     * 接报日期
     */
    private String jbrq;

    /**
     * 信息来源
     */
    private String xxly;

    /**
     * 监督员姓名
     */
    private String jdyxm;

    /**
     * 监督员编号
     */
    private String jdybh;

    /**
     * 反应内容
     */
    private String fynr;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
