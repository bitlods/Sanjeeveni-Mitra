package in.Health.Tharun.service;

import java.util.Optional;

import in.Health.Tharun.entity.User;

public interface IUserService {

	Long saveUser(User user);
	Optional<User> findByUsername(String username);
	void updateUserPwd(String pwd,Long userId);
}
