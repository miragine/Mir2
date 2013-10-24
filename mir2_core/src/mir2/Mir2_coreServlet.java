package mir2;

import java.io.IOException;
import java.util.concurrent.Future;
import java.util.logging.Level;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.memcache.AsyncMemcacheService;
import com.google.appengine.api.memcache.ErrorHandlers;
import com.google.appengine.api.memcache.MemcacheService;
import com.google.appengine.api.memcache.MemcacheServiceFactory;

@SuppressWarnings("serial")
public class Mir2_coreServlet extends HttpServlet {
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		try {
			String key = "text";
			byte[] value;

			// Using the synchronous cache
			MemcacheService syncCache = MemcacheServiceFactory.getMemcacheService();
			syncCache.setErrorHandler(ErrorHandlers
					.getConsistentLogAndContinue(Level.INFO));
			value = (byte[]) syncCache.get(key); // read from cache
			if (value == null) {
				
				

				syncCache.put(key, value); // populate cache
			}

			// Using the asynchronous cache
			AsyncMemcacheService asyncCache = MemcacheServiceFactory
					.getAsyncMemcacheService();
			asyncCache.setErrorHandler(ErrorHandlers
					.getConsistentLogAndContinue(Level.INFO));
			Future<Object> futureValue = asyncCache.get(key); // read from cache
			// ... do other work in parallel to cache retrieval
			value = (byte[]) futureValue.get();
			if (value == null) {
				// get value from other source
				// ........

				// asynchronously populate the cache
				// Returns a Future<Void> which can be used to block until
				// completion
				asyncCache.put(key, value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");

	}
}
