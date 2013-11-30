/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.common.db;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.webjvm.core.entity.BaseEntity;

/**
 * JPA实体实现
 */
@MappedSuperclass
public abstract class JpaEntityImpl implements BaseEntity, Serializable {

	@Id
	@GeneratedValue
	protected Long id;

	@Column(name = "CREATE_DATE", nullable = false)
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