package model.request;

import java.io.Serializable;
import model.enums.PollPoolTypeEnum;

/**
 * Created by Quark on 16/8/12.
 */
public class PollPoolRequest implements Serializable {

    private static final long serialVersionUID = -2139066245712172042L;

    /** 参与人数,不包括裁判 */
    private int playerNumber;

    /** 桌球类型 */
    private PollPoolTypeEnum pollPollTypeEnum;

    /** 每局的资金*/
    private int gambleFund;


}
