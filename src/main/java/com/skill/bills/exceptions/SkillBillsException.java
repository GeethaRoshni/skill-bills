package com.skill.bills.exceptions;

import java.text.MessageFormat;

public class SkillBillsException extends Exception {

    /**
     * The Constant serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new cae exception.
     *
     * @param message the message
     * @param params  the params [optionnal]
     */
    public SkillBillsException(String message, Object... params) {

        super(MessageFormat.format(message, params));
    }

    /**
     * Instantiates a new cae exception.
     *
     * @param e       the e
     * @param message the message
     * @param params  the params
     */
    public SkillBillsException(String message, Throwable e, Object... params) {

        super(MessageFormat.format(message, params), e);
    }
}
