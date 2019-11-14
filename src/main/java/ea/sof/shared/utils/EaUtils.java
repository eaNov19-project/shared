package ea.sof.shared.utils;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class EaUtils {

	public static <T> List<T> iterableToCollection(Iterable<T> iterable) {
		List<T> collection = new ArrayList<>();
		iterable.forEach(collection::add);
		return collection;
	}

	// Checking service-to-service communication secret
	/* Use like thi
			if (!EaUtils.isServiceAuthorized(request, serviceSecret))
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
	 */
	public static boolean isServiceAuthorized(HttpServletRequest request, String serviceSecret) {
		System.out.print("Checking service secret... ");
		boolean authorized = false;
		if (request.getHeader("service-secret") != null) {
			authorized = request.getHeader("service-secret").equals(serviceSecret);
		}
		if (authorized){
			System.out.println("service authorized successfully");
		} else{
			System.out.println("service auth failed. Expected: " + serviceSecret + ", received: " + request.getHeader("service-secret"));
		}

		return authorized;
	}

}
