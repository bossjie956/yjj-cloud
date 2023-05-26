package com.yjj.repairs.domain;

import com.yjj.common.core.annotation.Excel;
import com.yjj.common.core.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 报修信息对象 sys_repair
 * 
 * @author yjj
 * @date 2023-04-10
 */
public class SysRepair extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private Long phone;

    /** 报修人 */
    @Excel(name = "报修人")
    private String name;

    /** 报修原因 */
    @Excel(name = "报修原因")
    private String reasons;

    /** 报修寝室 */
    @Excel(name = "报修寝室")
    private String dormitoryAddress;

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
    public void setReasons(String reasons) 
    {
        this.reasons = reasons;
    }

    public String getReasons() 
    {
        return reasons;
    }
    public void setDormitoryAddress(String dormitoryAddress) 
    {
        this.dormitoryAddress = dormitoryAddress;
    }

    public String getDormitoryAddress() 
    {
        return dormitoryAddress;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("phone", getPhone())
            .append("name", getName())
            .append("reasons", getReasons())
            .append("dormitoryAddress", getDormitoryAddress())
            .toString();
    }
}
