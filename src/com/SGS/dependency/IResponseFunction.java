package com.SGS.dependency;

import java.util.HashMap;

public interface IResponseFunction {
    public Message getResponse(Message message);
    public String mapToString();
}
