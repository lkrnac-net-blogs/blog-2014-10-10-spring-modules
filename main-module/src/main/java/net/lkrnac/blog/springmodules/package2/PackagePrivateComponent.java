package net.lkrnac.blog.springmodules.package2;

import org.springframework.stereotype.Component;

@Component
class PackagePrivateComponent {
	public PackagePrivateComponent() {
		System.out.println("autowired...");
	}
}
