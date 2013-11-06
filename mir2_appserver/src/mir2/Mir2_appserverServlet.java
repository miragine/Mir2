package mir2;

import java.io.IOException;
import java.util.Date;

import javax.jdo.PersistenceManagerFactory;
import javax.servlet.http.*;

import mir2.core.sys.beans.User;

import org.springframework.beans.factory.annotation.Autowired;

@SuppressWarnings("serial")
public class Mir2_appserverServlet extends HttpServlet {
	
	@Autowired
	private PersistenceManagerFactory persistenceManagerFactory;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		User user = new User();
		user.setUsername("admin");
		user.setPassword("112233");
		user.setCreateDate(new Date());
		persistenceManagerFactory.getPersistenceManager().makePersistent(user);

		Object obj = persistenceManagerFactory.getPersistenceManager()
				.getObjectById(User.class, user.getId());

		System.out.println(obj);

		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
	
}
