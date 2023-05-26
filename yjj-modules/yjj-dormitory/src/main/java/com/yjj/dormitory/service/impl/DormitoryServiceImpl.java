package com.yjj.dormitory.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yjj.dormitory.mapper.DormitoryMapper;
import com.yjj.dormitory.domain.Dormitory;
import com.yjj.dormitory.service.IDormitoryService;

/**
 * 宿舍信息Service业务层处理
 * 
 * @author yjj
 * @date 2023-04-10
 */
@Service
public class DormitoryServiceImpl implements IDormitoryService 
{
    @Autowired
    private DormitoryMapper dormitoryMapper;

    /**
     * 查询宿舍信息
     * 
     * @param id 宿舍信息主键
     * @return 宿舍信息
     */
    @Override
    public Dormitory selectDormitoryById(Long id)
    {
        return dormitoryMapper.selectDormitoryById(id);
    }

    /**
     * 查询宿舍信息列表
     * 
     * @param dormitory 宿舍信息
     * @return 宿舍信息
     */
    @Override
    public List<Dormitory> selectDormitoryList(Dormitory dormitory)
    {
        return dormitoryMapper.selectDormitoryList(dormitory);
    }

    /**
     * 新增宿舍信息
     * 
     * @param dormitory 宿舍信息
     * @return 结果
     */
    @Override
    public int insertDormitory(Dormitory dormitory)
    {
        return dormitoryMapper.insertDormitory(dormitory);
    }

    /**
     * 修改宿舍信息
     * 
     * @param dormitory 宿舍信息
     * @return 结果
     */
    @Override
    public int updateDormitory(Dormitory dormitory)
    {
        return dormitoryMapper.updateDormitory(dormitory);
    }

    /**
     * 批量删除宿舍信息
     * 
     * @param ids 需要删除的宿舍信息主键
     * @return 结果
     */
    @Override
    public int deleteDormitoryByIds(Long[] ids)
    {
        return dormitoryMapper.deleteDormitoryByIds(ids);
    }

    /**
     * 删除宿舍信息信息
     * 
     * @param id 宿舍信息主键
     * @return 结果
     */
    @Override
    public int deleteDormitoryById(Long id)
    {
        return dormitoryMapper.deleteDormitoryById(id);
    }
}
