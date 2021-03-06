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

package com.example.app.ui;


import net.proteusframework.ui.management.ApplicationRegistry;

/**
 * Application functions for {@link ApplicationRegistry}.
 *
 * @author Russ Tennant (russ@venturetech.net)
 */
public final class ApplicationFunctions
{


    /**
     * Static class defining Application Functions for {@link ResourceRepositoryItem}
     *
     * @author Alan Holt (aholt@venturetech.net)
     */
    public static final class ResourceRepositoryItem
    {
        /** Resource Repository Item Management Application Function */
        public static final String MANAGEMENT = "Resource Repository Item Management";
        /** Resource Repository Item Editor Application Function */
        public static final String EDIT = "Resource Repository Item Editor";
        /** Resource Repository Item Viewer Application Function */
        public static final String VIEW = "Resource Repository Item Viewer";
        /** Resource Repository Item Public Listing */
        public static final String PUBLIC_LISTING = "Resource Repository Item Public Listing";

        private ResourceRepositoryItem()
        {
        }
    }

    /**
     * Static class defining Application Functions for {@link User}
     *
     * @author Alan Holt (aholt@venturetech.net)
     */
    public static final class User
    {
        /** User Management Application Function */
        public static final String MANAGEMENT = "User Management";
        /** User Editor Application Function */
        public static final String EDIT = "User Editor";
        /** User Viewer Application Function */
        public static final String VIEW = "User Viewer";
        /** My Account Viewer Application Function */
        public static final String MY_ACCOUNT_VIEW = "My Account View";
        /** My Account Editor Application Function */
        public static final String MY_ACCOUNT_EDIT = "My Account Edit";

        private User()
        {
        }
    }

    private ApplicationFunctions()
    {
    }


}
