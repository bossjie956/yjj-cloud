package com.yjj.student.domain;

import com.yjj.common.core.annotation.Excel;
import com.yjj.common.core.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 学生信息对象 student
 *
 * @author yjj
 * @date 2023-04-10
 */
public class Student extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 学生电话 */
    @Excel(name = "学生电话")
    private Long phone;

    /** 学生姓名 */
    @Excel(name = "学生姓名")
    private String name;

    /** 学生性别 */
    @Excel(name = "学生性别")
    private String sex;

    /** 所住楼宇 */
    @Excel(name = "所住楼宇")
    private String address;

    /** 所住班级 */
    @Excel(name = "所住班级")
    private String class1;

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
    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String getSex()
    {
        return sex;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }
    public void setClass1(String class1)
    {
        this.class1 = class1;
    }

    public String getClass1()
    {
        return class1;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("phone", getPhone())
            .append("name", getName())
            .append("sex", getSex())
            .append("address", getAddress())
            .append("class1", getClass1())
            .toString();
    }
}
