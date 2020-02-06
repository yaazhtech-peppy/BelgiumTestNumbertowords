/**
 * 
 */
package com.belgium.numtoword.business.api;

import org.springframework.stereotype.Service;

import com.belgium.numtoword.business.exception.BusinessException;


/**
 * @author PC
 * @param <T2>
 *
 */
@Service
public interface Business<T1, T2> {
T2 process(T1 param)throws BusinessException;
}
