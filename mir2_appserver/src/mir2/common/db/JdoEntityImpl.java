/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.common.db;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.webjvm.core.entity.BaseEntity;

/**
 * JDO实体实现
 */
public class JdoEntityImpl implements BaseEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	
	protected Date createDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}