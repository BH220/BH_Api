package bh_soft.api.Authorization.service.impl;

import bh_soft.api.Authorization.service.AuthorizationService;
import bh_soft.api.Authorization.service.mapper.AuthorizationMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class AuthorizationServiceImpl implements AuthorizationService {
    @Autowired
    private AuthorizationMapper authorizationMapper;

}
