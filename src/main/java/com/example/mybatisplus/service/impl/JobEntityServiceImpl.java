package com.example.mybatisplus.service.impl;

import com.example.mybatisplus.entity.JobEntity;
import com.example.mybatisplus.mapper.JobEntityMapper;
import com.example.mybatisplus.service.JobEntityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Solarie
 * @since 2020-08-26
 */
@Service
public class JobEntityServiceImpl extends ServiceImpl<JobEntityMapper, JobEntity> implements JobEntityService {

}
