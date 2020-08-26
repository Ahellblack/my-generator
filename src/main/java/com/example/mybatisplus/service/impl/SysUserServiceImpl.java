package com.example.mybatisplus.service.impl;

import com.example.mybatisplus.entity.SysUser;
import com.example.mybatisplus.mapper.SysUserMapper;
import com.example.mybatisplus.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author Solarie
 * @since 2020-08-26
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

}
