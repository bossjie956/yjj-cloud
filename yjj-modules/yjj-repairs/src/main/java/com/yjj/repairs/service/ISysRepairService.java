package com.yjj.repairs.service;

import java.util.List;
import com.yjj.repairs.domain.SysRepair;

/**
 * 报修信息Service接口
 * 
 * @author yjj
 * @date 2023-04-10
 */
public interface ISysRepairService 
{
    /**
     * 查询报修信息
     * 
     * @param id 报修信息主键
     * @return 报修信息
     */
    public SysRepair selectSysRepairById(Long id);

    /**
     * 查询报修信息列表
     * 
     * @param sysRepair 报修信息
     * @return 报修信息集合
     */
    public List<SysRepair> selectSysRepairList(SysRepair sysRepair);

    /**
     * 新增报修信息
     * 
     * @param sysRepair 报修信息
     * @return 结果
     */
    public int insertSysRepair(SysRepair sysRepair);

    /**
     * 修改报修信息
     * 
     * @param sysRepair 报修信息
     * @return 结果
     */
    public int updateSysRepair(SysRepair sysRepair);

    /**
     * 批量删除报修信息
     * 
     * @param ids 需要删除的报修信息主键集合
     * @return 结果
     */
    public int deleteSysRepairByIds(Long[] ids);

    /**
     * 删除报修信息信息
     * 
     * @param id 报修信息主键
     * @return 结果
     */
    public int deleteSysRepairById(Long id);
}
