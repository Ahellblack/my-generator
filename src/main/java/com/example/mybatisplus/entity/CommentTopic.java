package com.example.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("comment_topic")
public class CommentTopic extends Model<CommentTopic> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 主题类型 backlog 代办,remind 提醒,system 系统,ask 问询
     */
    private String topicType;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评论用户id
     */
    private Integer fromUid;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 指定查看用户
     */
    private Integer toUid;

    /**
     * 父id
     */
    private Integer pid;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
