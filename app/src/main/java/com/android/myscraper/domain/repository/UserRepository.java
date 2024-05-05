package com.android.myscraper.domain.repository;

public interface UserRepository {
    /**
     * User must be able to login into My Scraper using either his email or his user name.
     * @param email
     * @param userName
     * @param password
     * This method only saves the new user in Firebase database.
     */
    void createUser(String email, String userName, String password);
}
