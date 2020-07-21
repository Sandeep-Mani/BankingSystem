package com.sandeep.mani.users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	List<User> users = new ArrayList<>(Arrays.asList(
			new User("Sandeep", "Ramagondahalli", "email", LocalDate.parse("1995-12-23"), "male", "9845003180",
					"sandeep", "sandeep"),
			new User("Sandeep", "Ramagondahalli", "email", LocalDate.parse("1995-12-23"), "male", "9845003180",
					"sandeep", "sandeep")));

	public List<User> getAllTopics() {
		return users;
	}

	public User getUser(String userId) {
		return users.stream().filter(u -> u.getUserId().equals(userId)).findFirst().get();
	}

	public void addUser(User user) {
		users.add(user);
	}

	public void updateUser(String userId, User user) {
		for (int i = 0; i < users.size(); i++) {
			User u = users.get(i);
			if (u.getUserId().equals(userId)) {
				users.set(i, user);
				return;
			}
		}
	}

	public void removeUser(String userId) {
		users.removeIf(u -> u.getUserId().equals(userId));
	}
}
