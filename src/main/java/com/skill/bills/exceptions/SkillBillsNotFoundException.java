package com.skill.bills.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

import java.text.MessageFormat;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@ResponseStatus(NOT_FOUND)
public class SkillBillsNotFoundException extends SkillBillsException {

  private static final String ERROR_MESSAGE = "Could not find a {0} matching the given id: {1}.";

  public <T extends Enum<T>> SkillBillsNotFoundException(T value, String idNotFound) {
    super(MessageFormat.format(ERROR_MESSAGE, value.name(), idNotFound));
  }

  public SkillBillsNotFoundException(String value, String idNotFound) {
    super(MessageFormat.format(ERROR_MESSAGE, value, idNotFound));
  }

  public SkillBillsNotFoundException(String message) {
    super(message);
  }
}
