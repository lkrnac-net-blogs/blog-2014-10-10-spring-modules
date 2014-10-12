package net.lkrnac.blog.springmodules.package2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApiComponent {
	@Autowired
	public ApiComponent(PackagePrivateComponent privateComponent){

	}
}
