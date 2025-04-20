package ma.isga.depot.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.isga.depot.entities.Usager;
import ma.isga.depot.service.IUsagerService;

@RestController
@RequestMapping("/auth")
public class AuthConcroller {

	private IUsagerService usagerService;
	
	
	
    public AuthConcroller(IUsagerService usagerService) {
    	this.usagerService = usagerService;
    }


	@PostMapping("/login")
	public boolean saveProfile(String login, String password) {
		// TODO Auto-generated method stub
		return usagerService.authenticate(login,password);
	}

	@PostMapping("/signup")
	public Usager saveUser(Usager user) {
		// TODO Auto-generated method stub
		return usagerService.saveUsager(user);
	}

	
}
