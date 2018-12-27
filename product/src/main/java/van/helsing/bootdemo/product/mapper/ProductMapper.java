package van.helsing.bootdemo.product.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import van.helsing.bootdemo.product.entity.Product;

/**
 * 商品 mapper
 * @author : yangjunqing / yangjunqing@zhimadi.cn
 * @version : 1.0
 */
@Mapper
public interface ProductMapper {

    /**
     * Get by id product.
     *
     * @return the product
     * @author : yangjunqing / 2018-12-27
     */
    Product getById(@Param("id") String id);

    /**
     * Get by code product.
     *
     * @return the product
     * @author : yangjunqing / 2018-12-27
     */
    Product getByCode(@Param("code") String code);
}
