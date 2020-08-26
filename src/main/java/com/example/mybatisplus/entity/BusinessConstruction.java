package com.example.mybatisplus.entity;

import java.math.BigDecimal;
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
public class BusinessConstruction extends Model<BusinessConstruction> {

    private static final long serialVersionUID = 1L;

    /**
     * 项目工程编号
     */
    private String constructionCode;

    /**
     * 项目工程名称
     */
    private String constructionName;

    /**
     * 项目类型，待确定
     */
    private String type;

    /**
     * 当前项目状态 0：未启动， 1： 项目进行中，   2：项目已完成，   -1：项目被停止
     */
    private Integer status;

    /**
     * 建设内容/项目描述
     */
    private String buildContent;

    /**
     * 四至范围
     */
    private String fourRange;

    /**
     * 施工纬度
     */
    private String constructionPurpose;

    /**
     * 主办部门
     */
    private String manageDepart;

    /**
     * 建设规模描述/规划指标
     */
    private String constructionScale;

    /**
     * 建设投资金额
     */
    private BigDecimal constructionInvest;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建人id
     */
    private String createBy;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 修改人id
     */
    private String updateBy;

    /**
     * 上传图片文件地址
     */
    private String imageUrl;

    /**
     * 项目竣工时间
     */
    private LocalDateTime finishTime;

    /**
     * 进入节点时间
     */
    private LocalDateTime insideTime;

    /**
     * 创建时，初始时间
     */
    private LocalDateTime initialTime;

    /**
     * 创建时，截止时间
     */
    private LocalDateTime finalTime;

    /**
     * 项目负责人
     */
    private String pm;

    /**
     * 工程部负责人
     */
    private String enginPm;

    /**
     * 建设单位
     */
    private String buildUnit;

    /**
     * 施工单位/承建单位
     */
    private String constructionUnit;

    /**
     * 监管单位
     */
    private String superviseUnit;

    /**
     * 财务单位
     */
    private String financeUnit;


    @Override
    protected Serializable pkVal() {
        return this.constructionCode;
    }

}
