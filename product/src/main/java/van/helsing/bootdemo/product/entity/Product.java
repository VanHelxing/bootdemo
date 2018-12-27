package van.helsing.bootdemo.product.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;
import van.helsing.bootdemo.common.pojo.BaseEntity;

/**
 * 商品
 *
 * @author : yangjunqing / yangjunqing@zhimadi.cn
 * @version : 1.0
 */
@Data
@Alias("product")
public class Product extends BaseEntity {

    private static final long serialVersionUID = 2608377425047949508L;


    /**
     * Code
     */
    private String code;

    /**
     * Name
     */
    private String name;

    /**
     * Type
     */
    private String type;

    /**
     * Remark
     */
    private String remark;
}
