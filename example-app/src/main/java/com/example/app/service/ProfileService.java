/*
 * Copyright (c) Interactive Information R & D (I2RD) LLC.
 * All Rights Reserved.
 *
 * This software is confidential and proprietary information of
 * I2RD LLC ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered
 * into with I2RD.
 */

package com.example.app.service;


import com.example.app.model.profile.Profile;
import com.example.app.model.user.User;

import javax.annotation.Nullable;
import java.util.Optional;

import net.proteusframework.ui.search.QLBuilder;

/**
 * Service for Profile related activities.
 *
 * @author Russ Tennant (russ@venturetech.net)
 */
public interface ProfileService
{
    // FIXME : Your Application must implement this interface as a spring bean.
    // Typically you will have a DAO that all users are tied to that implements this interface.

    /**
     * Get the admin profile for a user.
     * User's have at most one profile that is considered
     * the admin of the user.
     *
     * @param user the user.
     *
     * @return the profile.
     */
    Optional<Profile> getAdminProfileForUser(@Nullable User user);

    /**
     * Get a profile by programmatic identifier.
     *
     * @param profileId the profile identifier.
     *
     * @return the profile.
     */
    @Nullable
    Profile getProfileByProgrammaticIdentifier(String profileId);

    /**
     * Get the QLBuilder for the profile that owns users.
     *
     * @return the builder.
     */
    QLBuilder getQLBuilder();

    /**
     * Set the admin profile for a user.
     *
     * @param user the user.
     * @param profile the profile.
     *
     * @return true if this is a new assignment; otherwise false.
     */
    boolean setAdminProfileForUser(User user, Profile profile);
}
