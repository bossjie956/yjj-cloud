package com.yjj.repairs.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yjj.repairs.mapper.SysRepairMapper;
import com.yjj.repairs.domain.SysRepair;
import com.yjj.repairs.service.ISysRepairService;

/**
 * 报修信息Service业务层处理
 * 
 * @author yjj
 * @date 2023-04-10
 */
@Service
public class SysRepairServiceImpl implements ISysRepairService 
{
    @Autowired
    private SysRepairMapper sysRepairMapper;

    /**
     * 查询报修信息
     * 
     * @param id 报修信息主键
     * @return 报修信息
     */
    @Override
    public SysRepair selectSysRepairById(Long id)
    {
        return sysRepairMapper.selectSysRepairById(id);
    }

    /**
     * 查询报修信息列表
     * 
     * @param sysRepair 报修信息
     * @return 报修信息
     */
    @Override
    public List<SysRepair> selectSysRepairList(SysRepair sysRepair)
    {
        return sysRepairMapper.selectSysRepairList(sysRepair);
    }

    /**
     * 新增报修信息
     * 
     * @param sysRepair 报修信息
     * @return 结果
     */
    @Override
    public int insertSysRepair(SysRepair sysRepair)
    {
        return sysRepairMapper.insertSysRepair(sysRepair);
    }

    /**
     * 修改报修信息
     * 
     * @param sysRepair 报修信息
     * @return 结果
     */
    @Override
    public int updateSysRepair(SysRepair sysRepair)
    {
        return sysRepairMapper.updateSysRepair(sysRepair);
    }

    /**
     * 批量删除报修信息
     * 
     * @param ids 需要删除的报修信息主键
     * @return 结果
     */
    @Override
    public int deleteSysRepairByIds(Long[] ids)
    {
        return sysRepairMapper.deleteSysRepairByIds(ids);
    }

    /**
     * 删除报修信息信息
     * 
     * @param id 报修信息主键
     * @return 结果
     */
    @Override
    public int deleteSysRepairById(Long id)
    {
        return sysRepairMapper.deleteSysRepairById(id);
    }
}
