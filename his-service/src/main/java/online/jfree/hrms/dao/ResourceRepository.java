package online.jfree.hrms.dao;

import online.jfree.hrms.domain.ResourceDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Guo Lixiao
 * @description
 * @date 2018/12/24 17:34
 * @sign 1.0
 */
@Repository
public class ResourceRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public ResourceDO getOne(Integer id) {
        return jdbcTemplate.query("select * from hr_resource where id = ?", new Object[]{id}, resultSet -> {
            while (resultSet.next()) {
                ResourceDO resource = new ResourceDO();
                resource.setId(resultSet.getInt("id"));
                resource.setName(resultSet.getString("name"));
                return resource;
            }
            return null;
        });
    }
}
