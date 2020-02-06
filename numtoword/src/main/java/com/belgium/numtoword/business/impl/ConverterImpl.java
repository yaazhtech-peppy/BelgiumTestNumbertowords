/**
 * 
 */
package com.belgium.numtoword.business.impl;

import org.springframework.stereotype.Component;

import com.belgium.numtoword.business.api.Converter;
import com.belgium.numtoword.business.exception.BusinessException;
import com.belgium.numtoword.business.strategy.NumbersToWords;

/**
 * @author PC
 * 
 */
@Component
public class ConverterImpl implements Converter {
	
	public String process(Integer param) throws BusinessException{

		return NumbersToWords.convert(param);
	}

}
