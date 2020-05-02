package com.iyou.service;

import com.iyou.entity.User;
import com.iyou.entity.UserThirdparty;
import com.baomidou.mybatisplus.service.IService;
import com.iyou.model.ThirdPartyUser;

/**
 * <p>
 * 第三方用户表 服务类
 * </p>
 *
 * @author iyou123
 * @since 2018-07-27
 */
public interface IUserThirdpartyService extends IService<UserThirdparty> {

    User insertThirdPartyUser(ThirdPartyUser param, String password)throws Exception;

}
