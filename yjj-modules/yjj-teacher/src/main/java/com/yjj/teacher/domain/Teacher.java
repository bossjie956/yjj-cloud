package com.yjj.teacher.domain;

import com.yjj.common.core.annotation.Excel;
import com.yjj.common.core.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 教师对象 teacher
 * 
 * @author yjj
 * @date 2023-04-10
 */
public class Teacher extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 老师名称 */
    @Excel(name = "老师名称")
    private String name;

    /** 老师电话 */
    @Excel(name = "老师电话")
    private String phone;

    /** 管理区域 */
    @Excel(name = "管理区域")
    private String buildingArea;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setBuildingArea(String buildingArea) 
    {
        this.buildingArea = buildingArea;
    }

    public String getBuildingArea() 
    {
        return buildingArea;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("phone", getPhone())
            .append("buildingArea", getBuildingArea())
            .toString();
    }
}
