package com.yunque.www.springbootdemo.service.serviceimpl;

import com.yunque.www.springbootdemo.enums.DoctorTitleEnum;
import com.yunque.www.springbootdemo.mapper.DoctorTitleMapper;
import com.yunque.www.springbootdemo.pojo.DoctorTitle;
import com.yunque.www.springbootdemo.pojo.DoctorTitleList;
import com.yunque.www.springbootdemo.service.DoctorTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created on 2019/3/27.
 * author:crs
 * Description:DoctorTitleServiceImpl
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS)  // TODO: 2019/3/27  
public class DoctorTitleServiceImpl implements DoctorTitleService {

    @Autowired
    DoctorTitleMapper doctorTitleMapper;

    @Override
    public DoctorTitleList selectDoctorTitleById() {
        List<DoctorTitle> doctorTitles = doctorTitleMapper.selectByType(DoctorTitleEnum.doctor_type.getCode());
        List<DoctorTitle> nurseTitles = doctorTitleMapper.selectByType(DoctorTitleEnum.nurse_type.getCode());
        List<DoctorTitle> echnicianTitles = doctorTitleMapper.selectByType(DoctorTitleEnum.echnician_type.getCode());
        return new DoctorTitleList(doctorTitles,nurseTitles,echnicianTitles);
    }

    @Override
    public List<DoctorTitle> selectDoctorTitle(){
        List<DoctorTitle> doctorTitles = doctorTitleMapper.selectByAll();
        return doctorTitles;
    }
}
