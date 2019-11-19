package ea.sof.shared.showcases;

import ea.sof.shared.Np;
import ea.sof.shared.models.Car;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


/* This is example of interface to use OpenFeign service-to-service communication

in your SvCar (example) you have to implement this methods below.

in your consumer service you have to add OpenFeign interface and extend from this interface

@FeignClient(name = "sv-car"
//		, url = "http://localhost:8096"
)
public interface SvCar extends SvCarShowcase { }

 */

public interface SvCarShowcase {
	// Example to put service secret to request. To service-to-service communications
	// service-secret - will put header variable in the query
	@RequestMapping("/cars/find/{id}")
	Car findById(@PathVariable(value = "id") int id,  @RequestHeader(Np.SecretHeader) String serviceSecret);

	// This can be accessible without service secret
	@RequestMapping("/cars/find")
	List<Car> findAll();

	// Passing model
	@PostMapping("/cars/add")
	Car add(Car model);

}
