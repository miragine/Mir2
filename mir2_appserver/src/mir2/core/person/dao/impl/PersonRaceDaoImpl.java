/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.person.dao.impl;

import mir2.common.db.JdoBaseDaoImpl;
import mir2.core.person.beans.PersonRace;
import mir2.core.person.dao.PersonRaceDao;

import org.springframework.stereotype.Repository;

/**
 * 
 */
@Repository
public class PersonRaceDaoImpl extends JdoBaseDaoImpl<PersonRace> implements
		PersonRaceDao {

}
