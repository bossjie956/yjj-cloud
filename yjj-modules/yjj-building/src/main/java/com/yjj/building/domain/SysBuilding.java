package com.yjj.building.domain;

import com.yjj.common.core.annotation.Excel;
import com.yjj.common.core.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 楼宇信息对象 sys_building
 * 
 * @author yjj
 * @date 2023-04-10
 */
public class SysBuilding extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 楼宇ID */
    private Long buildingId;

    /** 楼宇编码 */
    @Excel(name = "楼宇编码")
    private String buildingCode;

    /** 楼宇名称 */
    @Excel(name = "楼宇名称")
    private String buildingName;

    /** 显示顺序 */
    @Excel(name = "显示顺序")
    private Integer buildingSort;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    public void setBuildingId(Long buildingId) 
    {
        this.buildingId = buildingId;
    }

    public Long getBuildingId() 
    {
        return buildingId;
    }
    public void setBuildingCode(String buildingCode) 
    {
        this.buildingCode = buildingCode;
    }

    public String getBuildingCode() 
    {
        return buildingCode;
    }
    public void setBuildingName(String buildingName) 
    {
        this.buildingName = buildingName;
    }

    public String getBuildingName() 
    {
        return buildingName;
    }
    public void setBuildingSort(Integer buildingSort) 
    {
        this.buildingSort = buildingSort;
    }

    public Integer getBuildingSort() 
    {
        return buildingSort;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("buildingId", getBuildingId())
            .append("buildingCode", getBuildingCode())
            .append("buildingName", getBuildingName())
            .append("buildingSort", getBuildingSort())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
