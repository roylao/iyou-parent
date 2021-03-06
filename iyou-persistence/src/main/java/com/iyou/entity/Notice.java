package com.iyou.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.*;

/**
 * <p>
 * 消息通知表
 * </p>
 *
 * @author iyou
 * @since 2020-4-21 23:29:52
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("t_sys_notice")
public class Notice extends Model<Notice> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "notice_id", type = IdType.AUTO)
    private Integer noticeId;
    /**
     * 标题
     */
    private String title;
    /**
     * 类型 1:消息类型11;2:消息类型22;3:消息类型33;4:消息类型44;5:消息类型55
     */
    private Integer type;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Long createTime;
    /**
     * 消息所有者
     */
    private String mobile;
    /**
     * 关联的主题no
     */
    @TableField("theme_no")
    private String themeNo;
    /**
     * 是否已读 0 未读; 1 已读
     */
    @TableField("is_read")
    private Integer isRead;

    @Override
    protected Serializable pkVal() {
        return this.noticeId;
    }

}
