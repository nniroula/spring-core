package com.codepersist.restful_we_services.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;



@Component
public class UserDaoService {
	/* method this class handles are 
	 * public List<User> findAll()
	 * public User save(User user)
	 * public User findOne(int id)
	 * */
	
	/* create a static list and use Dao Service layer to talk to this */
	private static List<User> users = new ArrayList<>();
	
	private static int usersCount = 0;
	
	
	//static User user1 = new User(1, "Nabin", LocalDate.now().minusYears(24));
	//static User user2 = new User(2, "Joe Biden", LocalDate.now().minusYears(80));
						// OR
	static User user1 = new User(++usersCount, "Nabin", LocalDate.now().minusYears(24));
	static User user2 = new User(++usersCount, "Joe Biden", LocalDate.now().minusYears(80));
	
	//create a static block to initialize the above static list
	static {
		users.add(user1);
		users.add(user2);
		users.add(new User(++usersCount, "Donald Trump", LocalDate.now().minusYears(75)));
	}
	
	// find all users
	public List<User> findAll(){
		return users;
	}
	
	// find one user by its id. USE functional programming and predicate approach
	public User findOne(Integer id){
		//User user = users.get(0);
		Predicate<? super User> predicate = givenUser -> givenUser.getId().equals(id); // lambda expression
		//User user = users.stream().filter(predicate).findFirst().get();
		User user = users.stream().filter(predicate).findFirst().orElse(null);
		return user;
	}
	
	// save a user
	public User save(User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
	}
	
	// --------- Delete a user ------------
	public void deleteById(int id) {
		//User userToBeDeleted = findOne(id); // @PathVariable will grab this id value form a URL
		// users.remove(userToBeDeleted);
			//OR
		
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		users.removeIf(predicate);
	}
	
}
