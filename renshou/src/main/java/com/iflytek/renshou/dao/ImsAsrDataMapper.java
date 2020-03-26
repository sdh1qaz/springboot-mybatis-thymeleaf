package com.iflytek.renshou.dao;

import com.iflytek.renshou.pojo.ImsAsrData;
import com.iflytek.renshou.pojo.ImsAsrDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImsAsrDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ims_asr_data
     *
     * @mbggenerated Fri Mar 27 00:01:18 CST 2020
     */
    int countByExample(ImsAsrDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ims_asr_data
     *
     * @mbggenerated Fri Mar 27 00:01:18 CST 2020
     */
    int deleteByExample(ImsAsrDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ims_asr_data
     *
     * @mbggenerated Fri Mar 27 00:01:18 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ims_asr_data
     *
     * @mbggenerated Fri Mar 27 00:01:18 CST 2020
     */
    int insert(ImsAsrData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ims_asr_data
     *
     * @mbggenerated Fri Mar 27 00:01:18 CST 2020
     */
    int insertSelective(ImsAsrData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ims_asr_data
     *
     * @mbggenerated Fri Mar 27 00:01:18 CST 2020
     */
    List<ImsAsrData> selectByExample(ImsAsrDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ims_asr_data
     *
     * @mbggenerated Fri Mar 27 00:01:18 CST 2020
     */
    ImsAsrData selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ims_asr_data
     *
     * @mbggenerated Fri Mar 27 00:01:18 CST 2020
     */
    int updateByExampleSelective(@Param("record") ImsAsrData record, @Param("example") ImsAsrDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ims_asr_data
     *
     * @mbggenerated Fri Mar 27 00:01:18 CST 2020
     */
    int updateByExample(@Param("record") ImsAsrData record, @Param("example") ImsAsrDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ims_asr_data
     *
     * @mbggenerated Fri Mar 27 00:01:18 CST 2020
     */
    int updateByPrimaryKeySelective(ImsAsrData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ims_asr_data
     *
     * @mbggenerated Fri Mar 27 00:01:18 CST 2020
     */
    int updateByPrimaryKey(ImsAsrData record);
}