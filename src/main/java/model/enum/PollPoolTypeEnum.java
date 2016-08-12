package model.enum;


/**
 * Created by Quark on 16/8/12.
 */
public enum PollPoolTypeEnum {

    /** 国标15球 */
    CHINESE_STANDRAD("CHINESE_STANDARD","国标15球"),

    /** 美式9球 */
    AMERICAN_SIDEPOCKET("AMERICAN_SIDEPOCKET","美式9球");


    /**
     * 构造方法
     *
     * @param code 参数名称
     * @param desc 参数含义描述
     */
    PollPoolTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}