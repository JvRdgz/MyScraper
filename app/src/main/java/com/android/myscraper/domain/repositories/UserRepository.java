package com.android.myscraper.domain.repositories;

import com.android.myscraper.domain.model.app.User;

public interface UserRepository {
    /**
     * User must be able to login into My Scraper using either his email or his user name.
     * @param email
     * @param userName
     * @param password
     * This method only saves the new user in Firebase database.
     */
    void createUser(String email, String userName, String password);

    /**
     * Get User info
     * @param id
     * @return User
     */
    User getUserInfo(Integer id);

    /**
     * Modify user params.
     * @param user
     */
    void modifyUser(User user);

    /**
     * Delete user account.
     * @param user
     */
    void deleteUser(User user);
}
