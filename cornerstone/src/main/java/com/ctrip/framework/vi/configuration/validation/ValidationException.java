package com.ctrip.framework.vi.configuration.validation;

/**
 * Created by jiang.j on 2016/4/7.
 */
public class ValidationException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ValidationException() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ValidationException(String arg0, Throwable arg1) {
        super(arg0, arg1);
        // TODO Auto-generated constructor stub
    }

    public ValidationException(String arg0) {
        super(arg0);
        // TODO Auto-generated constructor stub
    }

    public ValidationException(Throwable arg0) {
        super(arg0);
        // TODO Auto-generated constructor stub
    }

}
