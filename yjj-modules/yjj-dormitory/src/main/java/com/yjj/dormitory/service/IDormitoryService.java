package com.yjj.dormitory.service;

import java.util.List;
import com.yjj.dormitory.domain.Dormitory;

/**
 * 宿舍信息Service接口
 * 
 * @author yjj
 * @date 2023-04-10
 */
public interface IDormitoryService 
{
    /**
     * 查询宿舍信息
     * 
     * @param id 宿舍信息主键
     * @return 宿舍信息
     */
    public Dormitory selectDormitoryById(Long id);

    /**
     * 查询宿舍信息列表
     * 
     * @param dormitory 宿舍信息
     * @return 宿舍信息集合
     */
    public List<Dormitory> selectDormitoryList(Dormitory dormitory);

    /**
     * 新增宿舍信息
     * 
     * @param dormitory 宿舍信息
     * @return 结果
     */
    public int insertDormitory(Dormitory dormitory);

    /**
     * 修改宿舍信息
     * 
     * @param dormitory 宿舍信息
     * @return 结果
     */
    public int updateDormitory(Dormitory dormitory);

    /**
     * 批量删除宿舍信息
     * 
     * @param ids 需要删除的宿舍信息主键集合
     * @return 结果
     */
    public int deleteDormitoryByIds(Long[] ids);

    /**
     * 删除宿舍信息信息
     * 
     * @param id 宿舍信息主键
     * @return 结果
     */
    public int deleteDormitoryById(Long id);
}
