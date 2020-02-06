package com.belgium.numtoword.business.impl;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.belgium.numtoword.business.exception.BusinessException;

public class ConverterImplTest {

	@InjectMocks
	ConverterImpl converterImpl;
     
    
 
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
     
    @Test
    public void processTest() throws BusinessException
    {
    	converterImpl.process(12345);
    }
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();
     
    @Test
    public void whenExceptionThrown_thenRuleIsApplied() throws BusinessException {
        exceptionRule.expect(BusinessException.class);
        exceptionRule.expectMessage("Limit is 6 digit exit");
        converterImpl.process(1234567);
    }
}
