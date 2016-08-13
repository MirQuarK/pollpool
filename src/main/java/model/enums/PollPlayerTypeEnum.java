package model.enums;

/**
 * Created by Quark on 16/8/12.
 */
public enum PollPlayerTypeEnum {

    /**
     * 房间创建者,即第一个进入房间的人
     */
    CREAT0R("CREATOR","房间创建者"),

    /**
     * 观众,可以看到所有选手的状态
     */
    SPECTATOR("SPECTATOR","观众"),

    /**
     *  参与者,只能看到自己的击球状况
     */
    PLAYER("PLAYER","参与者");

    /** 参数名称 */
    private String code;

    /** 参数业务描述 */
    private String desc;

    /**
     * 构造方法
     *
     * @param code 参数名称
     * @param desc 参数含义描述
     */
    PollPlayerTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
