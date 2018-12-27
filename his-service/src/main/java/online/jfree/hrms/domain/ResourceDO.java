package online.jfree.hrms.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Guo Lixiao
 * @description
 * @date 2018/12/24 17:19
 * @sign 1.0
 */
@Setter
@Getter
@ToString
public class ResourceDO {

    private Integer id;
    private Integer pId;
    private String name;
    private String icon;
    private String url;
    private Integer type;
    private Integer enable;
    private String desc;
}
