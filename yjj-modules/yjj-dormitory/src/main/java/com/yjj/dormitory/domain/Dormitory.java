package com.yjj.dormitory.domain;

import com.yjj.common.core.annotation.Excel;
import com.yjj.common.core.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 宿舍信息对象 dormitory
 * 
 * @author yjj
 * @date 2023-04-10
 */
public class Dormitory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 宿舍主键 */
    private Long id;

    /** 寝室联系电话 */
    @Excel(name = "寝室联系电话")
    private Long phone;

    /** 寝室长姓名 */
    @Excel(name = "寝室长姓名")
    private String name;

    /** 寝室楼层 */
    @Excel(name = "寝室楼层")
    private String storey;

    /** 所在楼宇 */
    @Excel(name = "所在楼宇")
    private String address;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPhone(Long phone) 
    {
        this.phone = phone;
    }

    public Long getPhone() 
    {
        return phone;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setStorey(String storey) 
    {
        this.storey = storey;
    }

    public String getStorey() 
    {
        return storey;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("phone", getPhone())
            .append("name", getName())
            .append("storey", getStorey())
            .append("address", getAddress())
            .toString();
    }
}
